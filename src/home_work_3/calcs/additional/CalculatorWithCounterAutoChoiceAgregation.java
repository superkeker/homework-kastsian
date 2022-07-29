package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator){
        this.calculatorWithOperator = calculatorWithOperator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy){
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends){
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    private long counter;
    public void incrementCountOperation(){
        counter++;
    }

    public long getCountOperation(){
        return counter;
    }

    public double calcDivision(double numerator, double denominator){
        double div = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.calcDivision(numerator, denominator);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.calcDivision(numerator, denominator);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.calcDivision(numerator, denominator);
        }
        return div;
    }
    public double multiplication(double multiply1, double multiply2){
        double mul = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.multiplication(multiply1, multiply2);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.multiplication(multiply1, multiply2);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.multiplication(multiply1, multiply2);
        }
        return mul;
    }

    public double subtraction(double sub1, double sub2){
        double sub = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.subtraction(sub1, sub2);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.subtraction(sub1, sub2);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.subtraction(sub1, sub2);
        }
        return sub;
    }
    public double addition(double add1, double add2){
        double add = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.addition(add1, add2);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.addition(add1, add2);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.addition(add1, add2);
        }
        return add;
    }
    public double raisingToAnNumberPower(double number, int exponent){
        double pow = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.raisingToAnNumberPower(number, exponent);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.raisingToAnNumberPower(number, exponent);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.raisingToAnNumberPower(number, exponent);
        }
        return pow;
    }
    public double module(double number){
        double mod = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.module(number);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.module(number);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.module(number);
        }
        return mod;
    }
    public double squareRoot(double number){
        double sqr = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return calculatorWithOperator.squareRoot(number);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return calculatorWithMathCopy.squareRoot(number);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return calculatorWithMathExtends.squareRoot(number);
        }
        return sqr;
    }
}
