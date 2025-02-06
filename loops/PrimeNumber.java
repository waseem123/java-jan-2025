import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int n = s.nextInt();  //4
        boolean isprime = true;
        int end = n / 2;

        for (int i = 2; i < end; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime==true) {
            System.out.println(n+" IS A PRIME NUMBER");
        }else{
            System.out.println(n+" IS NOT A PRIME NUMBER.");
        }
    }
}
