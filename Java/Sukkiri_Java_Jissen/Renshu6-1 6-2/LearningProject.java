
package com.chun;

import java.util.*;

public class LearningProject {

    public static void main(String[] args) {

        Func1 func1 = FuncList::isOdd;
        boolean bRet = func1.func1(120);

        if (bRet) {
            System.out.println("奇数");
        } else {
            System.out.println("偶数");
        }

        FuncList funcList = new FuncList(); // インスタンス生成
        Func2 func2 = funcList::addNamePrefix;
        String str = func2.func2(true, "ゴンザレス");

        System.out.println(str);

        // ラムダ式
        Func1 func1_lamda = (int x) -> {
            return (x % 2 == 1);
        };
        boolean bRet_lambda = func1_lamda.func1(1);

        Func2 func2_lamda = (boolean male, String name) -> {
            if (male == true) {
                return ("Mr." + name);
            } else {
                return ("Ms." + name);
            }
        };

        String str_lambda = func2_lamda.func2(false, "ボブ");
    }
}