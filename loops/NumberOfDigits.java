import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A NUMBER - ");
        int n = s.nextInt(); //1528
        int temp = n;
        int count = 0;
        while(n!=0){
            n = n / 10;
            count++;
        }
        System.out.printf("THERE ARE %d DIGITS IN NUMBER %d",count,temp);
    }
}
