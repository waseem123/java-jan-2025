import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do{
            System.out.println("1. Biryani - INR. 190");
            System.out.println("2. Shawarma - INR. 110");
            System.out.println("3. Pizza - INR. 200");
            System.out.println("4. Vada Pav - INR. 15");
            System.out.println("ENTER YOUR CHOICE - ");
            int choice = s.nextInt();
            int quantity = 0;
            int bill = 0;
            switch (choice) {
                case 1:
                    System.out.print("ENTER QUANTITY FOR BIRYANI - ");
                    quantity = s.nextInt();
                    bill = 190 * quantity;
                    System.out.printf("YOUR BILL FOR %d BIRYANI(s) IS INR. %d\n", quantity, bill);
                    break;
                case 2:
                    System.out.print("ENTER QUANTITY FOR SHAWARMA - ");
                    quantity = s.nextInt();
                    bill = 110 * quantity;
                    System.out.printf("YOUR BILL FOR %d SHAWARMA(s) IS INR. %d\n", quantity, bill);
                    break;
                case 3:
                    System.out.print("ENTER QUANTITY FOR PIZZA - ");
                    quantity = s.nextInt();
                    bill = 200 * quantity;
                    System.out.printf("YOUR BILL FOR %d PIZZA(s) IS INR. %d\n", quantity, bill);
                    break;
                case 4:
                    System.out.print("ENTER QUANTITY FOR VADA PAV - ");
                    quantity = s.nextInt();
                    bill = 15 * quantity;
                    System.out.printf("YOUR BILL FOR %d VADA PAV(s) IS INR. %d\n", quantity, bill);
                    break;
                default:
                    break;
            }
            System.out.print("DO YOU WANT TO PURCHASE MORE ITEMS? (1. YES | 2. NO) - ");
            ch = s.nextInt();
        }while(ch==1);
    }
}
