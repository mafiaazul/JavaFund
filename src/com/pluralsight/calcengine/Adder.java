package com.pluralsight.calcengine;

/**
 * Created by Rodrigo on 5/1/17.
 */
public class Adder extends CalculateBase implements MathProcessing {

    public Adder() { }
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public String getSymbol() {
        return "+";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
