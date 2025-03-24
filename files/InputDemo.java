import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {
    public static void main(String[] args) {
        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            System.out.println("Enter your name: ");
            int data = ir.read();
            while (data != -1) {
                System.out.print((char) data);
                data = ir.read();
            }
        } catch (IOException ex) {
            System.out.println("ERR - " + ex.getMessage());

        }
    }
}
