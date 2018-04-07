/*
 * スッキリわかるJava実践編
 * 練習問題1-1
 */
package com.chun;

public class LearningProject {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            sb.append(i + 1).append(",");
        }

        String[] str = sb.toString().split(",");
        for(String prtStr : str){
            System.out.println(prtStr);
        }
    }
}
