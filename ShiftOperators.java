public class ShiftOperators {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a << 1);
        System.out.println(a << 1 << 1);
        System.out.println(a << 2);

        a = 10;
        System.out.println(a >> 1); // 5
        System.out.println(a >> 1 >> 1); // 2
        System.out.println(a >> 2); //2
        System.out.println(a >>> 2); //2

        System.out.println(a >> 2 << 1); //2

    }
}
