import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] data = new int[5];

        System.out.println("ENTER 5 ELEMENTS");
        for (int i = 0; i < data.length; i++) {
            data[i] = s.nextInt();
        }

        System.out.println("ALL VALUES FROM THE ARRAY");
        for (int i : data) {
            System.out.println(i);
        }
    }    
}
