import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.print("ENTER YOUR CHOICE - ");

        int choice = s.nextInt();
        int n1, n2;
        int result;
        switch (choice) {
            case 1:
                System.out.print("ENTER FIRST NUMBER - ");
                n1 = s.nextInt();
                System.out.print("ENTER SECOND NUMBER - ");
                n2 = s.nextInt();
                result = n1 + n2;
                System.out.println("ADDITION IS " + result);
                break;

            case 2:
                System.out.print("ENTER FIRST NUMBER - ");
                n1 = s.nextInt();
                System.out.print("ENTER SECOND NUMBER - ");
                n2 = s.nextInt();
                result = n1 - n2;
                System.out.println("SUBTRACTION IS " + result);
                break;

            case 3:
                System.out.print("ENTER FIRST NUMBER - ");
                n1 = s.nextInt();
                System.out.print("ENTER SECOND NUMBER - ");
                n2 = s.nextInt();
                result = n1 * n2;
                System.out.println("MULTIPLICATION IS " + result);
                break;

            case 4:
                System.out.print("ENTER FIRST NUMBER - ");
                n1 = s.nextInt();
                System.out.print("ENTER SECOND NUMBER - ");
                n2 = s.nextInt();
                result = n1 / n2;
                System.out.println("DIVISION IS " + result);
                break;

            default:
                System.out.println("WRONG INPUT! PLEASE ENTER THE CHOICE BETWEEN 1 TO 4.");
                break;
        }
    }
}
