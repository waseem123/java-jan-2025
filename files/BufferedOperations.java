import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedOperations {
    public static void main(String[] args) {
        try {
            InputStreamReader ir = new InputStreamReader(new FileInputStream("myfile.txt"));
            BufferedReader br = new BufferedReader(ir);

            OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("output.txt"));
            BufferedWriter bw = new BufferedWriter(ow);

            String line = br.readLine();
            while (line!=null) {
                System.out.println(line);
                bw.write(line+"\n");
                line = br.readLine();
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERR - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERR - " + e.getMessage());
        }
    }
}
