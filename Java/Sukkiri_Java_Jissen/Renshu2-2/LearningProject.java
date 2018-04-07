/*
 * スッキリわかるJava実践編
 * 練習問題2-2
 */
package com.chun;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LearningProject {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        LocalDate ld = LocalDate.now();

        // 100日後を計算
        ld = ld.plusDays(100);

        String str = ld.format(dtf);
        System.out.println("100日後は" + str);
    }
}
