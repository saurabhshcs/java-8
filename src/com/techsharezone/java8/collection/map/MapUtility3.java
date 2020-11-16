package com.techsharezone.java8.collection.map;

/*
 * @created 16/11/2020 -00:03
 * @project java8
 * @author  saurabhshcs
 */

import java.util.Map;

public class MapUtility3 implements Runnable {

    private Map<String, Integer> map;

    public MapUtility3(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, MapUtility3.class.getSimpleName()).start();
    }

    @Override
    public void run() {
        map.put("Three", 3);
        try {
            System.out.println(MapUtility3.class.getSimpleName() + " sleeping...");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
