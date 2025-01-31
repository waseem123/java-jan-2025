import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int n = s.nextInt();
        if (n >= 100) {
            System.out.println("Welcome to Java tutorial");
        } else {
            System.out.println("PROGRAM ENDS HERE...");
        }
    }
}
