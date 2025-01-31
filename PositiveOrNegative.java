import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int n = s.nextInt();

        if(n>0){
            System.out.println(n+" IS A POSITIVE NUMBER");
        }else if(n==0){
            System.out.println(n+ " IS ZERO AND NEUTRAL");
        }else{
            System.out.println(n+" IS A NEGATIVE NUMBER");
        }
    }
}
