import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrittingOSW {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            OutputStreamWriter ow = new OutputStreamWriter(fout);
            ow.write("Hello World\n");
            ow.write("Welcome to Output Stream Writer");
            ow.flush();
            ow.close();
            fout.close();
        } catch (IOException ex) {
            System.out.println("ERR - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERR - " + ex.getMessage());
        }
    }
}
