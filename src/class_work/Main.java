package class_work;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static home_work_5.utils.PersonUtils.randomNameFromFile;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("”кажите адресс файла: ");
        Scanner scanner = new Scanner(System.in);
        String fileLocation = scanner.next();

        BufferedReader in;
        BufferedWriter out;

        if(fileLocation == null){
            try{
                in = new BufferedReader(new FileReader("students.bin"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            try{
                in = new BufferedReader(new FileReader(fileLocation));
            } catch (FileNotFoundException e) {
                out = new BufferedWriter(new FileWriter("students.bin"));
            }
        }
        ThreadLocalRandom random = (ThreadLocalRandom) new Random();
        //Stream.generate(new Student(randomNameFromFile(), randomNameFromFile(), randomNameFromFile(), random.nextInt(1, 101))).;
    }
}
