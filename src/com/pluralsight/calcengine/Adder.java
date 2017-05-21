package com.pluralsight.calcengine;

/**
 * Created by Rodrigo on 5/1/17.
 */
public class Adder extends CalculateBase {

    public Adder() { }
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
