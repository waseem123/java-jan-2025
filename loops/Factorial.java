import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int n = s.nextInt();
        int f = 1;
        for(int i=1;i<=n;i++){
            // f = f * i;
            f *= i;
        }
        System.out.printf("FACTORIAL OF %d IS %d.",n,f);
    }
}
