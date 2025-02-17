class Employee {
    private int empId;
    private String empName;
    private String empCity;
    private int perDaySalary;
    private int monthlySalary;

    public Employee() {
        this.empId = 0;
        this.empName = "NA";
        this.empCity = "NA";
        this.perDaySalary = 800;
    }

    public Employee(int empId, String empName, String empCity) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.perDaySalary = 800;
    }

    public Employee(int empId, String empName, String empCity, int perDaySalary) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.perDaySalary = perDaySalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public int getPerDaySalary() {
        return perDaySalary;
    }

    public void setPerDaySalary(int perDaySalary) {
        this.perDaySalary = perDaySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    private int getMonthlySalary(int workingDays) {
        return workingDays * perDaySalary;
    }

    public int getSalary(int workingDays) {
        return getMonthlySalary(workingDays);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Tom", "Mumbai");
        System.out.printf("EMPLOYEE ID             - %d\n", e1.getEmpId());
        System.out.printf("EMPLOYEE NAME           - %s\n", e1.getEmpName());
        System.out.printf("EMPLOYEE CITY           - %s\n", e1.getEmpCity());
        System.out.printf("EMPLOYEE PER DAY SALARY - %d\n", e1.getPerDaySalary());
        System.out.printf("EMPLOYEE MONTHLY SALARY - $%d\n", e1.getSalary(25));
        System.out.println("_____________________________________________");

        Employee e2 = new Employee();
        System.out.printf("EMPLOYEE ID             - %d\n", e2.getEmpId());
        System.out.printf("EMPLOYEE NAME           - %s\n", e2.getEmpName());
        System.out.printf("EMPLOYEE CITY           - %s\n", e2.getEmpCity());
        System.out.printf("EMPLOYEE PER DAY SALARY - %d\n", e2.getPerDaySalary());
        System.out.printf("EMPLOYEE MONTHLY SALARY - $%d\n", e2.getSalary(24));
        System.out.println("_____________________________________________");

        Employee e3 = new Employee(103,"John","San Fransisco",600);
        System.out.printf("EMPLOYEE ID             - %d\n", e3.getEmpId());
        System.out.printf("EMPLOYEE NAME           - %s\n", e3.getEmpName());
        System.out.printf("EMPLOYEE CITY           - %s\n", e3.getEmpCity());
        System.out.printf("EMPLOYEE PER DAY SALARY - %d\n", e3.getPerDaySalary());
        System.out.printf("EMPLOYEE MONTHLY SALARY - $%d\n", e3.getSalary(20));
        e3.setPerDaySalary(1000);
        System.out.printf("EMPLOYEE REVISED SALARY - $%d\n", e3.getSalary(20));
        System.out.println("_____________________________________________");

    }
}