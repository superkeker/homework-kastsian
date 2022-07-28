package home_work_3.calcs.api;

public interface ICalculator {
    double calcDivision(double numerator, double denominator);
    double multiplication(double multiply1, double multiply2);
    double subtraction(double sub1, double sub2);
    double addition(double add1, double add2);
    double raisingToAnNumberPower(double number, int exponent);
    double module(double number);
    double squareRoot(double number);
}
