package home_work_3.calcs.additional;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double operation1 = calculator.calcDivision(28, 5);
        calculator.incrementCountOperation();
        double operation2 = calculator.raisingToAnNumberPower(operation1, 2);
        calculator.incrementCountOperation();
        double operation3 = calculator.multiplication(15, 7);
        calculator.incrementCountOperation();
        double operation4 = calculator.addition(operation2, operation3);
        calculator.incrementCountOperation();
        double operation5 = calculator.addition(4.1, operation4);
        calculator.incrementCountOperation();

        System.out.println(operation5);
        System.out.println(calculator.getCountOperation());
    }
}
