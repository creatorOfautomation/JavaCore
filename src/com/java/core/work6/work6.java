package com.java.core.work6;

import java.util.Scanner;

public class work6 {

    public static void main(String[] args) {

        System.out.print("Welcome! Type our string: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.print("The unic symbol of your line: ");
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (line.indexOf(ch) == line.lastIndexOf(ch)) {
                System.out.print(line.charAt(i)+ ", ");
            }
        }
    }
}
