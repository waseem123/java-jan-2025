import java.util.Scanner;

public class NestedConditions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE - ");
        int age = s.nextInt();

        if(age>=18){
            System.out.print("DO YOU HAVE VOTER ID?(1.YES|2.NO) - ");
            int voterid = s.nextInt();
            if(voterid==1){
                System.out.println("CONGRATULATIONS! YOU CAN VOTE.");
            }else{
                System.out.println("SORRY! YOU CAN NOT VOTE.");
            }
        }else{
            System.out.printf("YOU ARE NOT ELIGIBLE FOR VOTING. GROW UP AND THEN COME FOR VOTING AFTER %d YEARS.",(18-age));
        }
    }
}
