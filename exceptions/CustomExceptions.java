import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomExceptions {
    public static void main(String[] args) throws InvalidAgeException{
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE - ");
        int age = s.nextInt();
        String name = null;
        try{
            if(age < 18){
                InvalidAgeException exception = new InvalidAgeException("YOU ARE NOT ELIGIBLE TO VOTE.");
                throw exception;
            }else{
                System.out.println("YOU ARE ELIGIBLE TO VOTE.");
            }
            
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("YOU CAN NOT ENTER NON NUMERIC VALUE.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
