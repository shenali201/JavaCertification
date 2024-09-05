package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String arg []) throws IOException {
        //CreateNewFile();
        //NumbersExceptionHandling();
        CreateNewFileRethrow();
    }

    private static void NumbersExceptionHandling() {
        File file = new File("resources/nonexistent.txt");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                double num = sc.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            //this will execute wether there are not exceptions found above
        }

    }

    public static void CreateNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

        public static void CreateNewFileRethrow() throws IOException {
            File file = new File("resources/nonexistent.txt");
                file.createNewFile();
        }
    }