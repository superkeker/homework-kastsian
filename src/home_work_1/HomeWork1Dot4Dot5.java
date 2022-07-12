package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot5 {
    public static void main(String[] args) {
        //Áóêâà èëè èíîé ñèìâîë
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ââåäèòå áóêâó íà àíãëèéñêîì èëè ñèìâîë: ");
        char c = scanner.next().charAt(0);

        if(((int)c >= 65 && (int)c <= 90) || ((int)c >= 97 && (int)c <= 122)){
            System.out.println("Âû ââåëè áóêâó");
        } else {
            System.out.println("Âû ââåëè íå áóêâó, ñêîğåå âñåãî ñèìâîë"); // Ñëèøêîì ìíîãî èñêëş÷åíèé. Â òîì ñìûñëå, ÷òî ìîæíî íàçâàòü ñèìâîëîì, à ÷òî íåò
        }
    }
}
