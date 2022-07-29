package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    ICalculator iCalculator;

    public CalculatorWithMemory(ICalculator iCalculator){
        this.iCalculator = iCalculator;
    }
    private long counter;
    private double memory;
    private boolean getUsed = false;
    public void incrementCountOperation(){
        counter++;
    }
    public long getCountOperation(){
        return counter;
    }

    private void setMemory(double memory){
            getUsed = false;
            this.memory = memory;
    }
    public double getMemory(){
        if (!getUsed){
            getUsed = true;
            return memory;
        }
        return 0;
    }
    public double calcDivision(double numerator, double denominator){
        incrementCountOperation();
        setMemory(iCalculator.calcDivision(numerator, denominator));
        return iCalculator.calcDivision(numerator, denominator);
    }
    public double multiplication(double multiply1, double multiply2){
        incrementCountOperation();
        setMemory(iCalculator.multiplication(multiply1, multiply2));
        return iCalculator.multiplication(multiply1, multiply2);
    }

    public double subtraction(double sub1, double sub2){
        incrementCountOperation();
        setMemory(iCalculator.subtraction(sub1, sub2));
        return iCalculator.subtraction(sub1, sub2);
    }
    public double addition(double add1, double add2){
        incrementCountOperation();
        setMemory(iCalculator.addition(add1, add2));
        return iCalculator.addition(add1, add2);
    }
    public double raisingToAnNumberPower(double number, int exponent){
        incrementCountOperation();
        setMemory(iCalculator.raisingToAnNumberPower(number, exponent));
        return iCalculator.raisingToAnNumberPower(number, exponent);
    }
    public double module(double number){
        incrementCountOperation();
        setMemory(iCalculator.module(number));
        return iCalculator.module(number);
    }
    public double squareRoot(double number){
        incrementCountOperation();
        setMemory(iCalculator.squareRoot(number));
        return iCalculator.squareRoot(number);
    }
}
