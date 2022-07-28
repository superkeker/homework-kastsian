package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double calcDivision(double numerator, double denominator){
        double result = numerator / denominator;
        return result;
    }
    public double multiplication(double multibly1, double multiply2){
        double result = multibly1 * multiply2;
        return result;
    }
    public double subtraction(double sub1, double sub2){
        double result = sub1 - sub2;
        return result;
    }
    public double addition(double add1, double add2){
        double result = add1 + add2;
        return result;
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
        double result = Math.sqrt(number);
        return result;
    }
}
