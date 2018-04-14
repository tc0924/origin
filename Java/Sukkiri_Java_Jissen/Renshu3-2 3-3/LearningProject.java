/*
 * スッキリJava 実践編
 * 練習3-2, 3-3
 */
package com.chun;

import java.util.*;

public class LearningProject {
    public static void main(String[] args) {

        // インスタンスを作成
        Hero saitoHero  = new Hero("斉藤");
        Hero suzukiHero = new Hero("鈴木");

        // 練習3-2
        List<Hero> heros = new ArrayList<>();
        heros.add(saitoHero);
        heros.add(suzukiHero);

        Iterator<Hero> it = heros.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }

        // 練習3-3
        Map<Hero, Integer> mapHeros = new HashMap<>();
        mapHeros.put(saitoHero, 3);
        mapHeros.put(suzukiHero, 7);

        for(Hero hero : mapHeros.keySet()){
            System.out.println(hero.getName() + "が倒した敵＝" + mapHeros.get(hero));
        }
    }
}
