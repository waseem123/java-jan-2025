import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int num = s.nextInt();

        int temp = num;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        } //3

        temp = num;
        int sum = 0;
        while(temp!=0){
            int rem = temp % 10; //1
            int r = rem; //1
            for(int i=1;i<count;i++){
                r = r * rem;
            } //1
            sum = sum + r;  //153
            temp = temp / 10; //0
        }

        System.out.println(sum);
        if(sum == num){
            System.out.println(num+" IS AN ARMSTRONG NUMBER.");
        }else{
            System.out.println(num+" IS NOT AN ARMSTRONG NUMBER.");
        }
    }
}
