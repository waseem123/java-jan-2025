public class LogicalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 15;
        System.out.println(x>y && x>z);
        System.out.println(x<y && x>z);
        System.out.println(x>y && x<z);

        System.out.println(x>y || x>z); //true
        System.out.println(x<y || x<z); //true
        System.out.println(x>y || x<z); //true
        System.out.println(x<y || x>z); //false
        System.out.println("_____________");
        x = 10;
        y = 5;
        z = 15;
        System.out.println(!(x<y)); // true
        System.out.println(!(x>y) || (y>z)); // false
        System.out.println(!((x>y) || (y>z))); // false
        System.out.println(!((x>y) && (y>z))); // true
        System.out.println(!(!((x>y) || (y>z)))); // true
    }
}
