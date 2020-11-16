package com.techsharezone.java8.collection.map;

/*
 * @created 16/11/2020 -00:08
 * @project java8
 * @author  saurabhshcs
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> shm = Collections.synchronizedMap(map);

        ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
        MapUtility1 mapUtility1 = new MapUtility1(chm);
        MapUtility2 mapUtility2 = new MapUtility2(chm);
        MapUtility3 mapUtility3 = new MapUtility3(chm);
        MapUtility4 mapUtility4 = new MapUtility4(chm);

        for (Map.Entry<String, Integer> entry : chm.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
