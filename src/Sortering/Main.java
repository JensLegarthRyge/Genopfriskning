package Sortering;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Indtast ord: ");
            strings[i]=getUserInput();
        }
        Arrays.sort(strings, Collections.reverseOrder());
        for (String currentString:strings) {
            System.out.println(currentString);
        }
    }

    public static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
