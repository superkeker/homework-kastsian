package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter;
    public void incrementCountOperation(){
        counter++;
    }
    public long getCountOperation(){
        return counter;
    }
    public double calcDivision(double numerator, double denominator){
        double result = super.calcDivision(numerator, denominator);
        incrementCountOperation();
        return result;
    }
    public double multiplication(double multiply1, double multiply2){
        double result = super.multiplication(multiply1, multiply2);
        incrementCountOperation();
        return result;
    }

    public double subtraction(double sub1, double sub2){
        double result = super.subtraction(sub1, sub2);
        incrementCountOperation();
        return result;
    }
    public double addition(double add1, double add2){
        double result = super.addition(add1, add2);
        incrementCountOperation();
        return result;
    }
    public double raisingToAnNumberPower(double number, int exponent){
        double result = super.raisingToAnNumberPower(number, exponent);
        incrementCountOperation();
        return result;
    }
    public double module(double number){
        incrementCountOperation();
        return super.module(number);
    }
    public double squareRoot(double number){
        incrementCountOperation();
        return super.squareRoot(number);
    }
}
