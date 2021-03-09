package com.techsharezone.java8.collection.random;

/*
 * @created 09/03/2021 -23:11
 * @project Java8
 * @author  saurabhshcs
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterByMapKey {

    public static void main(String[] args) {
        List<Promotion> listToBeSorted = Arrays.asList(
                new Promotion("p1", "SCONTO_FIDATY"),
                new Promotion("p2", "PREZZI_CORTI"),
                new Promotion("p3", "SCONTO"),
                new Promotion("p4", "SCONTO_FIDATY"),
                new Promotion("p5", "PREZZI_CORTI"),
                new Promotion("p6", "SCONTO_FIDATY"),
                new Promotion("p7", "SCONTO"),
                new Promotion("p8", "Alpeno"));

        Map<String, List<String>> map = listToBeSorted.stream()
                .collect(Collectors.groupingBy(Promotion::getType,
                        Collectors.mapping(Promotion::getType, Collectors.toList())));

        System.out.println(map);
    }
}
    class Promotion {
        String name;
        String type;

        public Promotion(String name, String type) {
            super();
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "[name=" + name + ", type=" + type + "]";
        }
}
