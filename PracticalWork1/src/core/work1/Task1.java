package core.work1;

public class Task1 {


    public static void main(String[] args) {

        int i = 1;
        int k;
        while (i < 9) {
            k = i;
            while (k != 0) {

                System.out.print(k + " ");
                k--;
            }
            System.out.println();
            i++;
        }
    }
}
