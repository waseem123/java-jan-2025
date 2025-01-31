import java.util.Scanner;

public class TerneryOperator {
    public static void main(String[] args) {
        /*
         * (condition)?Execute if condition is true:Execute if condition is false;
         */

        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A VALUE - ");
        int n = s.nextInt();
        System.out.println((n>100)?"Welcome":"Goodbye");
    }
}
