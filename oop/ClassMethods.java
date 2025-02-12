import java.util.Scanner;

class Student {
    int rollno;
    String name;
    String city;

    private void setStudentData() {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME - ");
        name = s.next();
        System.out.print("ENTER YOUR ROLLNO - ");
        rollno = s.nextInt();
        System.out.print("ENTER YOUR CITY - ");
        city = s.next();
    }

    public void getStudentData(){
        System.out.println("ROLL NO - "+rollno);
        System.out.println("NAME    - "+name);
        System.out.println("CITY    - "+city);
    }
}

class ClassMethods {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("ENTER DATA FOR STUDENT NO 1");
        s1.setStudentData();
        System.out.println("ENTER DATA FOR STUDENT NO 2");
        s2.setStudentData();
        System.out.println("ENTER DATA FOR STUDENT NO 3");
        s3.setStudentData();
        System.out.println("__________________");
        s1.getStudentData();
        System.out.println("------------------");
        s2.getStudentData();
        System.out.println("------------------");
        s3.getStudentData();
        System.out.println("------------------");
    }
}
