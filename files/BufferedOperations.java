import java.io.*;
import java.util.Scanner;

public class BufferedOperations {
    public static void readOperation(String fileName) {
        try {

            InputStream is = new FileInputStream(fileName);
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ir);

            // BufferedReader br = new BufferedReader(
            // new InputStreamReader(
            // new FileInputStream(fileName)));
            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void writeOperation(String fileName) {
        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            System.out.println("Enter data to write to file: ");
            String data = br.readLine();

            OutputStream os = new FileOutputStream(fileName);
            OutputStreamWriter ow = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(ow);
            bw.write(data);
            bw.close();
            os.close();
            ow.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException ex) {

        } catch (Exception e) {
        }
    }

    public static void appendOperation(String fileName){
        try{
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter data to append to file: ");
            String data = br.readLine();
            bw.write(data);
            bw.close();
            br.close();
            fw.close();
            System.out.println("Data appended to file successfully.");
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException ex){
            System.out.println("An error occurred: " + ex.getMessage());
        }catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "myfile.txt";
        Scanner s = new Scanner(System.in);
        System.out.println("1. Read");
        System.out.println("2. Write");
        System.out.println("3. Append");
        System.out.println("Enter your choice: ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                readOperation(fileName);
                break;
                case 2:
                writeOperation(fileName);
                break;
                case 3:
                appendOperation(fileName);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
