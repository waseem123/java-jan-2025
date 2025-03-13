import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {

            int[] myarray = {10,20,30,40,50};
            int nr, dr;
            Scanner s = new Scanner(System.in);
            System.out.print("ENTER A NUMBER - ");
            nr = s.nextInt();
            System.out.print("ENTER A NUMBER - ");
            dr = s.nextInt();

            int division = nr / dr;
            System.out.println("DIVISION IS - " + division);
            System.out.println(myarray[1]);
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN NOT DIVIDE ANY NUMBER BY ZERO.");
        }catch (InputMismatchException e) {
            System.out.println("YOU CAN NOT DIVIDE ANY NUMBER BY NON NUMERIC VALUE.");
        }catch(Exception e){
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }finally{
            System.out.println("Finally reached at finally block");
        }
    }
}
