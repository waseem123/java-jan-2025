public class ArrayCreation {
    public static void main(String[] args) {
        int[] nums = { 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000 };

        for (int i : nums) {
            System.out.println(i);
        }

        // for(Datatype variable : arrayname){

        // }
        System.out.println("_______________");
        String[] students = {"Maaz","Junead","Aniket","Javeria","Maria","Sayma","Misbha","Rumaiza","Shaheen","Farah"};
        System.out.println(students.length);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("_______________");
        for (String s : students) {
            System.out.println(s);
        }

        System.out.println(students[25]);
    }
}
