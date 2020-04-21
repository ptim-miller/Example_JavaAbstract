package edu.myschool.java;

public enum Grade {

    AA(3),
    A(2),
    B(1);

    private final int rating;

    Grade(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
