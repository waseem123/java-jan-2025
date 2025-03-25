import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReadingISR {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("ENTER THE FILE NAME WITHOUT ITS EXTENSION - ");
            String filename = s.next();
            filename = filename+".txt";
            InputStream is = new FileInputStream(filename);
            InputStreamReader ir = new InputStreamReader(is);
            int data = ir.read();
            while (data != -1) {
                System.out.print((char) data);
                data = ir.read();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERR - " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERR - " + ex.getMessage());
        }
    }
}
