package edu.myschool.java;

import java.text.NumberFormat;

public class ProductionChicken extends Chicken {
    private double weight;
    private Breed breed;

    public ProductionChicken(String name, String coop, double weight, Breed breed) {
        super(name, coop);
        setWeight(weight);
        setBreed(breed);
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed newBreed) {
        this.breed = newBreed;
    }

    public double computeValue() {
        double result = this.weight * this.breed.getPricePerPound();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("ProductionChicken value for " + super.getName() + ": " + formatter.format(result));
        return result;
    }
}
