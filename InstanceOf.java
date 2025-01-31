import java.util.Scanner;

public class InstanceOf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(s instanceof Scanner);
        // System.out.println(s instanceof String);
        System.out.println(65 instanceof Integer);
    }
}
