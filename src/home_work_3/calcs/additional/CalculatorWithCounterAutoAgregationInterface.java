package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator iCalculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator){
        this.iCalculator = iCalculator;
    }
    private long counter;
    public void incrementCountOperation(){
        counter++;
    }
    public long getCountOperation(){
        return counter;
    }
    public double calcDivision(double numerator, double denominator){
        incrementCountOperation();
        return iCalculator.calcDivision(numerator, denominator);
    }
    public double multiplication(double multiply1, double multiply2){
        incrementCountOperation();
        return iCalculator.multiplication(multiply1, multiply2);
    }

    public double subtraction(double sub1, double sub2){
        incrementCountOperation();
        return iCalculator.subtraction(sub1, sub2);
    }
    public double addition(double add1, double add2){
        incrementCountOperation();
        return iCalculator.addition(add1, add2);
    }
    public double raisingToAnNumberPower(double number, int exponent){
        incrementCountOperation();
        return iCalculator.raisingToAnNumberPower(number, exponent);
    }
    public double module(double number){
        incrementCountOperation();
        return iCalculator.module(number);
    }
    public double squareRoot(double number){
        incrementCountOperation();
        return iCalculator.squareRoot(number);
    }
}
