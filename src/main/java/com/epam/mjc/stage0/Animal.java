package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getDescription() {

        String furExpression = (getHasFur() == true)? "a" : "no";

        String pawnExpression = (getNumberOfPaws() == 1)? "paw" : "paws";

        String description = "This animal is mostly " + getColor() +". It has " + getNumberOfPaws() + " " + pawnExpression +
                " and " + furExpression + " fur.";

        return description;


    }

    public String getColor() {

        return color;
    }

    public int getNumberOfPaws() {

        return numberOfPaws;
    }

    public boolean getHasFur() {

        return hasFur;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
}
