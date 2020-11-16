package com.techsharezone.java8.collection.map;

/*
 * @created 16/11/2020 -00:03
 * @project java8
 * @author  saurabhshcs
 */

import java.util.Map;

public class MapUtility2 implements Runnable {

    private Map<String, Integer> map;

    public MapUtility2(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, MapUtility2.class.getSimpleName()).start();
    }

    @Override
    public void run() {
        map.put("Two", 2);
        try {
            System.out.println(MapUtility2.class.getSimpleName() + " sleeping...");
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
