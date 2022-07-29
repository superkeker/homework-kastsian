package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithOperator calculatorWithOperator;
    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculatorWithOperator){
        this.calculatorWithOperator = calculatorWithOperator;
    }
    private long counter;
    public void incrementCountOperation(){
        counter++;
    }
    public long getCountOperation(){
        return counter;
    }
    public double calcDivision(double numerator, double denominator){
        //double result = super.calcDivision(numerator, denominator);
        incrementCountOperation();
        return calculatorWithOperator.calcDivision(numerator, denominator);
    }
    public double multiplication(double multiply1, double multiply2){
        //double result = super.multiplication(multiply1, multiply2);
        incrementCountOperation();
        return calculatorWithOperator.multiplication(multiply1, multiply2);
    }

    public double subtraction(double sub1, double sub2){
        //double result = super.subtraction(sub1, sub2);
        incrementCountOperation();
        return calculatorWithOperator.subtraction(sub1, sub2);
    }
    public double addition(double add1, double add2){
        //double result = super.addition(add1, add2);
        incrementCountOperation();
        return calculatorWithOperator.addition(add1, add2);
    }
    public double raisingToAnNumberPower(double number, int exponent){
        //double result = super.raisingToAnNumberPower(number, exponent);
        incrementCountOperation();
        return calculatorWithOperator.raisingToAnNumberPower(number, exponent);
    }
    public double module(double number){
        incrementCountOperation();
        return calculatorWithOperator.module(number);
    }
    public double squareRoot(double number){
        incrementCountOperation();
        return calculatorWithOperator.squareRoot(number);
    }
}
