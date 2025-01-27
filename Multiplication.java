import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ENTER FIRST NUMBER  - ");
        int num1 = s.nextInt();

        System.out.print("ENTER SECOND NUMBER - ");
        int num2 = s.nextInt();

        int result = num1 * num2;

        System.out.printf("MULTIPLICATION OF %d AND %d IS %d.\n", num1, num2, result);
        System.out.printf("%d * %d = %d.", num1, num2, result);
    }
}
