package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    CalculatorWithOperator calculatorWithOperator;
    CalculatorWithMathCopy calculatorWithMathCopy;
    CalculatorWithMathExtends calculatorWithMathExtends;

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
            return div = calculatorWithOperator.calcDivision(numerator, denominator);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return div = calculatorWithMathCopy.calcDivision(numerator, denominator);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return div = calculatorWithMathExtends.calcDivision(numerator, denominator);
        }
        return div;
    }
    public double multiplication(double multiply1, double multiply2){
        double mul = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return mul = calculatorWithOperator.multiplication(multiply1, multiply2);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return mul = calculatorWithMathCopy.multiplication(multiply1, multiply2);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return mul = calculatorWithMathExtends.multiplication(multiply1, multiply2);
        }
        return mul;
    }

    public double subtraction(double sub1, double sub2){
        double sub = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return sub = calculatorWithOperator.subtraction(sub1, sub2);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return sub = calculatorWithMathCopy.subtraction(sub1, sub2);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return sub = calculatorWithMathExtends.subtraction(sub1, sub2);
        }
        return sub;
    }
    public double addition(double add1, double add2){
        double add = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return add = calculatorWithOperator.addition(add1, add2);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return add = calculatorWithMathCopy.addition(add1, add2);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return add = calculatorWithMathExtends.addition(add1, add2);
        }
        return add;
    }
    public double raisingToAnNumberPower(double number, int exponent){
        double pow = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return pow = calculatorWithOperator.raisingToAnNumberPower(number, exponent);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return pow = calculatorWithMathCopy.raisingToAnNumberPower(number, exponent);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return pow = calculatorWithMathExtends.raisingToAnNumberPower(number, exponent);
        }
        return pow;
    }
    public double module(double number){
        double mod = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return mod = calculatorWithOperator.module(number);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return mod = calculatorWithMathCopy.module(number);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return mod = calculatorWithMathExtends.module(number);
        }
        return mod;
    }
    public double squareRoot(double number){
        double sqr = 0;
        if(calculatorWithOperator != null){
            incrementCountOperation();
            return sqr = calculatorWithOperator.squareRoot(number);
        } else if (calculatorWithMathCopy != null) {
            incrementCountOperation();
            return sqr = calculatorWithMathCopy.squareRoot(number);
        } else if (calculatorWithMathExtends != null) {
            incrementCountOperation();
            return sqr = calculatorWithMathExtends.squareRoot(number);
        }
        return sqr;
    }
}
