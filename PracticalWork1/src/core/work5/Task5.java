package core.work5;

public class Task5 {

    public static void main(String[] args) {
        String string1 = "Cartoon";
        String string2 = "Tomcat";
        for (int i = 0; i < string1.length(); i++) {
            char ch = string1.charAt(i);
            if (string2.indexOf(ch) == -1) {
                System.out.println(ch);
            }
        }
    }
}
