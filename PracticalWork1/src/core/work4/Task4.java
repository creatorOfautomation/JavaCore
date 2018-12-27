package core.work4;

public class Task4 {

    public static void main(String[] args) {

        String target = "An information  system  is  designed  to  collect,  process,  store and distribute information";
        String lastPart = target.substring(target.lastIndexOf(' '));
        String firstPart = target.substring(0, target.indexOf(' '));
        String middle = (target.substring(target.indexOf(' '), target.lastIndexOf(' '))).trim();
        System.out.println(lastPart + " " + middle + " " + firstPart);

    }
}
