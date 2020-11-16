package com.techsharezone.java8.collection;

/*
 * @created 16/11/2020 -00:35
 * @project java8
 * @author  saurabhshcs
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class EqualsHashCodeContract {

    public static void main(String[] args) {

        String s = "srm233";
        String str = "srm233";

        System.out.println(Objects.hashCode(s) + " - "+ str.hashCode());


        Student s1 = new Student("S1234");
        Student s2 = new Student("S1234");


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        Map<Student, ReportCard> result = new HashMap<>();
        result.put(s1, new ReportCard());
        result.put(s2, new ReportCard());

        for (Map.Entry<Student, ReportCard> entry : result.entrySet()) {
            System.out.println("["+ entry.getKey()+"] - ["+ entry.getValue()+"]");
        }

        Map<Student, ReportCard> map = new TreeMap<>();

        map.put(s1, new ReportCard());
        map.put(s2, new ReportCard());

        for (Map.Entry<Student, ReportCard> entry : result.entrySet()) {
            System.out.println("["+ entry.getKey()+"] - ["+ entry.getValue()+"]");
        }

    }
}
