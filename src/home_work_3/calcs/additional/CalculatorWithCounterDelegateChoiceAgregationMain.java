package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = calculator1.addition(4.1, calculator1.addition(calculator1.multiplication(15, 7), calculator1.raisingToAnNumberPower(calculator1.calcDivision(28, 5), 2)));
        System.out.println(result1);
        System.out.println(calculator1.getCountOperation());

        double result2 = calculator2.addition(4.1, calculator2.addition(calculator2.multiplication(15, 7), calculator2.raisingToAnNumberPower(calculator2.calcDivision(28, 5), 2)));
        System.out.println(result2);
        System.out.println(calculator2.getCountOperation());

        double result3 = calculator3.addition(4.1, calculator3.addition(calculator3.multiplication(15, 7), calculator3.raisingToAnNumberPower(calculator3.calcDivision(28, 5), 2)));
        System.out.println(result3);
        System.out.println(calculator3.getCountOperation());
    }

}
