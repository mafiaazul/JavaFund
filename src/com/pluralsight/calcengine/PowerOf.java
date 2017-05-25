package com.pluralsight.calcengine;

/**
 * Created by r604254 on 05/23/2017.
 */
public class PowerOf implements MathProcessing {
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public String getSymbol() {
        return "^";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
