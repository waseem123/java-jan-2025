import java.io.OutputStreamWriter;
import java.io.IOException;
public class OutputDemo{
    public static void main(String[] args) {
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        try {
            ow.write("Hello World");
            ow.write("Welcome to Output Stream Writer");
            ow.flush();
        } catch (IOException ex) {
            System.out.println("ERR - " + ex.getMessage());
        }
    }
}