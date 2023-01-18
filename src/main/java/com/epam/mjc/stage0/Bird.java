package com.epam.mjc.stage0;

public class Bird extends Animal{

    @Override
    public String getDescription() {

        String furExpression = (getHasFur() == true)? "a" : "no";
        String pawnExpression = (getNumberOfPaws() == 1)? "paw" : "paws";

        String description = "This animal is mostly " + getColor() +". It has " + getNumberOfPaws() + " " + pawnExpression +
                " and " + furExpression + " fur. Moreover, it has 2 wings and can fly.";

        return description;
    }

    public Bird() {
        super("blue", 2, false);
    }


}
