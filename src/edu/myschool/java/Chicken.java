package edu.myschool.java;

public abstract class Chicken {
    private String name;
    private String coop;

    public Chicken(String name, String coop) {
        System.out.println("Building a new Chicken!!!");
        this.name = name;
        this.coop = coop;
    }

    public abstract double getWeight();
    public abstract void setWeight(double newWeight);
    public abstract double computeValue();

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getCoop() {
        return coop;
    }

    public void setCoop(String newCoop) {
        this.coop = newCoop;
    }

    public String toString() {
        return "Chicken Name:" + getName() + "; Coop:" + getCoop() + "; Weight:" + getWeight() ;
    }
}