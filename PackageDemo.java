import operations.Addition;
import operations.Subtraction;

public class PackageDemo {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("ADDITION IS - "+a.add(150, 270));
        
        Subtraction s = new Subtraction();
        System.out.println("SUBTRACTION IS - "+s.sub(150, 270));

        operations.Mutliplication m = new operations.Mutliplication();
        System.out.println("MULTIPLICATION IS - "+m.mult(100,20));
    }
}
