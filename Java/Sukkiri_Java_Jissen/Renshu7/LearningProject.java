
package com.chun;

import java.lang.reflect.Method;

public class LearningProject {

    public static void main(String[] args) {

        String fqcn = args[0];          // 起動すべきクラスのFQCN
        String startParam = args[1];    // 起動パラメータ E or I

        Class<?> clsInfo = null;

        // 現在のメモリ使用量を表示する
        showMemory();

        // FQCNのクラスが持つ、すべてのメソッド名を画面に表示する
        try {
            clsInfo = Class.forName(fqcn);

            Method[] methods = getMethodList(clsInfo);    // 取得
            showMethodList(methods);                      // 一覧表示

        }catch(Exception e){
            System.out.println("FQCNの取得に失敗");
            e.printStackTrace();
            System.exit(1); //終了コード1で終了
        }

        // FQCNで指定されたクラスを起動する
        try {
            if(startParam.equals("E")){
                ProcessBuilder pb = new ProcessBuilder("java", clsInfo.getName());
                Process ps = pb.start();    // 別プロセスとして起動
                ps.waitFor();                // プロセスが終了するまで現在のスレ度を待機
            }else if(startParam.equals("I")){
                Method tgtMethod = clsInfo.getMethod("main", String[].class);   //メインクラスを取得
                String[] dummyArgs = {};
                // 静的メソッド(main)を呼び出すときは第一引数は任意。
                // 可変長引数に対して、配列自体を①つのデータとして渡したい場合は、
                // Objectにキャストする必要がある。
                tgtMethod.invoke(null, (Object)dummyArgs);
            }else{
                throw new IllegalArgumentException("起動方法の指定が不正");
            }
        }catch(Exception e){
            System.out.println("プロセスの起動に失敗");
            e.printStackTrace();
            System.exit(1); //終了コード1で終了
        }

        // 現在のメモリ使用量を表示する
        showMemory();

        System.exit(0);     //終了コード0で終了
    }

    /**
     * クラスのメソッド一覧を取得する
     * @param clsInfo 対象のクラス
     * @return Methodの配列
     */
    private static Method[] getMethodList(Class<?> clsInfo){

        return clsInfo.getMethods();
    }

    /**
     * メソッド一覧を表示する
     * @param methods メソッド一覧
     */
    private static void showMethodList(Method[] methods){

        System.out.println("メソッド一覧を表示");
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }

    /**
     * 現在のメモリ使用量を表示する
     */
    private static void showMemory(){

        Runtime rt = Runtime.getRuntime();  //Runtimeインスタンスを取得
        long usedMemory = (rt.totalMemory() - rt.freeMemory()) / 1024 / 1024;

        System.out.println("現在のメモリ使用量 → " + usedMemory + "MB");
    }
}

