package core.work2;

public class Task2 {


    public static void main(String[] args) {

        int i = 0;
        int x = 1;
        while (true) {

            if (x % 3 < 1 && x % 4 < 1) {
                System.out.println(x);
                i++;
            }
            x++;
            if (i==10) break;
        }
    }
}
