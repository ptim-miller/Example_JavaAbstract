package edu.myschool.java;

public enum Breed {
    Leghorn(.65),
    Sussex(.60),
    Ancona(.55),
    Barnevelder(.51),
    Hamburg(.52),
    Marans(.48);

    private final double pricePerPound;

    Breed(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    public double getPricePerPound() {
        return this.pricePerPound;
    }


}
