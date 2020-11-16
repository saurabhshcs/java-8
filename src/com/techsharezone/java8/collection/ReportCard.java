package com.techsharezone.java8.collection;

/*
 * @created 16/11/2020 -00:43
 * @project java-8
 * @author  saurabhshcs
 */

public class ReportCard {

    private Integer mathScore;

    public ReportCard() {
        this.mathScore = (int)((Math.random()*101) +1);
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mathScore=" + mathScore +
                '}';
    }
}
