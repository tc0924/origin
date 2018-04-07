/*
 * スッキリわかるJava実践編
 * 練習問題2-1
 */
package com.chun;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class LearningProject {
    public static void main(String[] args) {

        Date date = new Date();
        Calendar cldr = Calendar.getInstance();

        // Date型をCalendar型に変換
        cldr.setTime(date);

        // 日を取得し、100日足す
        int day = cldr.get(Calendar.DATE);
        cldr.add(Calendar.DATE, 100);

        // Calendar型をDate型に変換
        Date addDate = cldr.getTime();

        // SimpleDateFormatで指定した書式でString型に変換
        SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
        String str = sdf.format(addDate);
        System.out.println("100日後は" + str);
    }
}
