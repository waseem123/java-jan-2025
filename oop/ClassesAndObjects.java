class Person{
    String name = "Alexandar"; 
    int age = 25; 
    double height = 5.6;
    String city = "Solapur";
    String state = "MAHARASHTRA";
}

class ClassesAndObjects {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        Person p1 = new Person();
        System.out.println("NAME - "+p1.name);
        System.out.println("AGE  - "+p1.age);
        System.out.println("HEIGHT - "+p1.height);
        System.out.println("CITY - "+p1.city);
        System.out.println("STATE - "+p1.state);

        System.out.println("________________");
        Person p2;
        p2 = new Person();

        p2.name = "Peter";
        p2.city = "Pune";
        p2.age = 30;
        p2.height = 6.0;
        p2.state = "Maharashtra";
        System.out.println("NAME - "+p2.name);
        System.out.println("AGE  - "+p2.age);
        System.out.println("HEIGHT - "+p2.height);
        System.out.println("CITY - "+p2.city);
        System.out.println("STATE - "+p2.state);

        Person p3;
        p3 = new Person();

        p3.name = "Roger";
        p3.city = "Mumbai";
        p3.age = 35;
        p3.height = 5.0;
        p3.state = "Maharashtra";
        System.out.println("NAME - "+p3.name);
        System.out.println("AGE  - "+p3.age);
        System.out.println("HEIGHT - "+p3.height);
        System.out.println("CITY - "+p3.city);
        System.out.println("STATE - "+p3.state);
    }

}