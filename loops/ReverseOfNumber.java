import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int num = s.nextInt();
        int temp = num; // 25
        int reverse = 0; // 0

        while (temp != 0) {
            int rem = temp % 10; //2
            reverse = (reverse * 10) + rem; //52
            temp /= 10; // temp = temp / 10  0
        }

        System.out.println(reverse);

        System.out.println((num==reverse)?"NUMBER IS PALINDROME.":"NUMBER IS NOT PALINDROME.");
    }
}
