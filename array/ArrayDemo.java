public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(numbers);
        String[] names = new String[5];
        System.out.println(names);
        
        numbers[0] = 1000;
        numbers[1] = 2000;
        numbers[2] = 3000;
        numbers[3] = 4000;
        numbers[4] = 5000;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
