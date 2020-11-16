package com.techsharezone.java8.collection;

/*
 * @created 16/11/2020 -00:41
 * @project java-8
 * @author  saurabhshcs
 */

import java.util.Objects;

public class Student implements  Comparable<Student>{

    private String registrationNumber;

    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (Objects.isNull(o) || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(registrationNumber, student.registrationNumber);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
