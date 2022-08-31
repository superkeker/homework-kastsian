package home_work_1;

public class HomeWork1Dot4Dot4 {
    public static int bytesKilobytes(int i, char choice){
        if (choice == 'k' || choice == 'K'){
            return i/1024;
        } else if (choice == 'b' || choice == 'B'){
            return i*1024;
        } else {
            System.out.println("Вы ввели неверную букву");
            return 0;
        }
    }
}
