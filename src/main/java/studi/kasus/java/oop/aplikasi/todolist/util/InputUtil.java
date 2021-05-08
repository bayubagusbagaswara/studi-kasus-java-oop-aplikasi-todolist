package studi.kasus.java.oop.aplikasi.todolist.util;

import java.util.Scanner;

/**
 * class tambahan atau utility
 * class inpututil untuk menginputkan sebuah data
 */
public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
        System.out.println(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
}
