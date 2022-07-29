package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double calcDivision(double numerator, double denominator){
        return numerator / denominator;
    }
    public double multiplication(double multibly1, double multiply2){
        return multibly1 * multiply2;
    }
    public double subtraction(double sub1, double sub2){
        return sub1 - sub2;
    }
    public double addition(double add1, double add2){
        return add1 + add2;
    }
    public double raisingToAnNumberPower(double number, int exponent){
        double result = number;
        if(number > 0) {
            for (int i = 1; i < exponent; i++) {
                result *= number;
            }
        }
        return result;
    }
    public double module(double number){
        if(number < 0){
            number *= -1;
            return number;
        } else {
            return number;
        }
    }
    public double squareRoot(double number){
        return Math.sqrt(number);
    }
}
