import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("ENTER NUM 1 - ");
        int num1 = s.nextInt();
        System.out.print("ENTER NUM 2 - ");
        int num2 = s.nextInt();
        System.out.print("ENTER NUM 3 - ");
        int num3 = s.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.printf("%d IS GREATER THAN %d AND %d",num1,num2,num3);
        }else if(num2>num1 && num2>num3){
            System.out.printf("%d IS GREATER THAN %d AND %d",num2,num1,num3);
        }else if(num3>num1 && num3>num2){
            System.out.printf("%d IS GREATER THAN %d AND %d",num3,num1,num2);
        }else{
            System.out.printf("THE VALUES ARE EQUAL");
        }
    }
}
