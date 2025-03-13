import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int nr, dr;
            Scanner s = new Scanner(System.in);
            System.out.print("ENTER A NUMBER - ");
            nr = s.nextInt();
            System.out.print("ENTER A NUMBER - ");
            dr = s.nextInt();

            int division = nr / dr;
            System.out.println("DIVISION IS - " + division);
        } catch (Exception e) {
            System.out.println("YOU CAN NOT DIVIDE ANY NUMBER BY ZERO.");
        }
    }
}
