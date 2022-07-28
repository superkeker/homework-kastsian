package home_work_3.calcs.simple;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double result = calculator.addition(4.1, calculator.addition(calculator.multiplication(15, 7), calculator.raisingToAnNumberPower(calculator.calcDivision(28, 5), 2)));
        System.out.println(result);
    }
}
