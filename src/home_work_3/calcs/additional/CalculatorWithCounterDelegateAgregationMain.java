package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calculator.addition(4.1, calculator.addition(calculator.multiplication(15, 7), calculator.raisingToAnNumberPower(calculator.calcDivision(28, 5), 2)));
        System.out.println(result);
        System.out.println(calculator.getCountOperation());
    }
}
