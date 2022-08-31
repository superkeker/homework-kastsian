package home_work_2.loops;

public class HomeWork1Dot1Dot2 {
    public static String recursionMultiplyTo(int to){
        if(to > 0){
            StringBuilder str = new StringBuilder();

            str.append(1);
            for (int k = 2; k <= to; k++){
                str.append(" * ").append(k);
            }
            str.append(" = ").append(factRecursion(to));

            return String.valueOf(str);
        }else {
            System.out.println("Вы ввели отрицательное значение.");
            return null;
        }
    }
    private static int factRecursion(int i) {
        if (i == 1 || i == 0){
            return 1;
        }
        return i * factRecursion(i-1);
    }
}
