package com.pluralsight.calcengine;

/**
 * Created by r604254 on 05/23/2017.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword(); // add
    String getSymbol(); // +
    double doCalculation(double leftVal, double rightVal);
}
