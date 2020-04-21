package edu.myschool.java;

public class Main {

    public static void main(String[] args) {
        Egg bc2099 = new Egg("BarCode2099", "Bldg 2", Grade.A, .0594);
        System.out.println(bc2099.toString());
        bc2099.computeValue();

        System.out.println("");

        Chicken bc1055 = new Egg("BarCode1055", "Bldg 1", Grade.AA, .0695);
        System.out.println(bc1055.toString());
        bc1055.computeValue();

        System.out.println("");

        Chicken pc = new ProductionChicken("Foghorn", "Bldg 2", 3.45, Breed.Leghorn);
        System.out.println(pc.toString());
        pc.computeValue();

    }
}
