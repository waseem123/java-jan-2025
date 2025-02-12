class Employee {
    private int empId = 101;
    private String empName = "Peter";

    void setEmployee(int id, String name) {
        empId = id;
        empName = name;
    }

    public void getEmployee() {
        System.out.println("EMPLOYEE ID - " + empId);
        System.out.println("EMPLOYEE NAME - " + empName);
    }
}

public class AccessSpecifier {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        // e1.empId = 1005;
        // e1.empName = "XYZ";
        // System.out.println("ID - " + e1.empId);
        // System.out.println("NAME - " + e1.empName);

        Employee e2 = new Employee();
        e2.setEmployee(111, "Alexandar");
        e2.getEmployee();
    }
}
