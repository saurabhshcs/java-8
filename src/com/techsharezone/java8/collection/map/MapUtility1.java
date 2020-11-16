package com.techsharezone.java8.collection.map;

/*
 * @created 16/11/2020 -00:03
 * @project java8
 * @author  saurabhshcs
 */

import java.util.Map;

public class MapUtility1 implements Runnable {

    private Map<String, Integer> map;

    public MapUtility1(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, MapUtility1.class.getSimpleName()).start();
    }

    @Override
    public void run() {
        map.put("One", 1);
        try {
            System.out.println(MapUtility1.class.getSimpleName() + " sleeping...");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
