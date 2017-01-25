import java.util.Scanner;

/**
 * Created by p2_2 on 1/25/17.
 */
public class Tesing1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        int x = 1;
        String hi = "hlello";
        for (x=1; x <5; x++){
            System.out.println(hi);
        }
        Scanner scanner = new Scanner(System.in);
        String y;
        y = scanner.nextLine();
        dog z = new dog(y);

    }
    public static String dog(String s){
        String input =  s;
        if (input.matches("God")) {
            return "God";
        }
        else {
            return null;
        }
    }

}
