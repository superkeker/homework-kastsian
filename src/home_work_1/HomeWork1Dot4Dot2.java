package home_work_1;

public class HomeWork1Dot4Dot2 {
    public static int meanNumber(int a, int b, int c){
        if ((a < b && b < c) || (a > b && b > c)){
            return b;
        } else if ((b < a && a < c) || ((b > a && a > c))) {
            return a;
        } else {
            return c;
        }
    }
}
