// 1. Import the Scanner class from java.util package.
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //2. Create the object of Scanner Class in main method with
        // System.in parameter.
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME - ");
        String name = sc.next();
        System.out.printf("MY NAME IS %s\n",name);
        System.out.print("ENTER YOUR CITY - ");
        String city = sc.next();
        System.out.printf("I LIVE IN %s",city);
    }
}

