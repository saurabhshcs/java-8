package com.techsharezone.java8.collection.map;

/*
 * @created 16/11/2020 -00:03
 * @project java8
 * @author  saurabhshcs
 */

import java.util.Map;

public class MapUtility4 implements Runnable {

    private Map<String, Integer> map;

    public MapUtility4(Map<String, Integer> map) {
        this.map = map;
        new Thread(this, MapUtility4.class.getSimpleName()).start();
    }

    @Override
    public void run() {
        map.put("Four", 4);
        try {
            System.out.println(MapUtility4.class.getSimpleName() + " sleeping...");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
