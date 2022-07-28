package home_work_3.calcs.simple;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double result = calculator.addition(4.1, calculator.addition(calculator.multiplication(15, 7), calculator.raisingToAnNumberPower(calculator.calcDivision(28, 5), 2)));
        System.out.println(result);
    }
}
