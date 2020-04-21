package edu.myschool.java;

import java.text.NumberFormat;

public class Egg extends Chicken {
    private Grade grade;
    private double weight;

    public Egg(String name, String coop, Grade grade, double weight) {
        super(name, coop);
        setGrade(grade);
        setWeight(weight);
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade newGrade) {
        this.grade = newGrade;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public double computeValue() {
        double result = weight * this.grade.getRating();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("EGG value " + formatter.format(result) + "\n");
        return result;
    }

    public String toString(){
        return super.getName() + "; Coop:" + getCoop() + "; Weight:" + getWeight() + "; Grade:" + getGrade() ;
    }
}
