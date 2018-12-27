package core.work10;

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string here -> ");
        String line = scanner.nextLine();
        boolean result = countBrackets(line);
        System.out.println("The result is: " + result);
    }

    public static boolean countBrackets(String str) {

        int br1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') br1 ++ ;
            else if (ch == ')') br1 --;
            if (br1<0) return false;
        }
        if (br1 == 0) return true;
        return false;
    }

}
