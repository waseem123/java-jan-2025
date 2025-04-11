import java.sql.*;
import java.util.Scanner;

class DBOperations {
    public static Connection connect() {
        Connection con = null;
        try {
            // Your database operations go here
            System.out.println("Database operations executed successfully.");
            // Example: Loading the JDBC driver
            // step 1
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Example: Establishing a connection to the database
            // step 2
            String url = "jdbc:mysql://127.0.0.1:3306/db_school";
            String user = "root"; // Replace with your database username
            String password = "admin"; // Replace with your database password

            con = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED SUCCESSFULLY");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("ERROR IN DATABASE CONNECTION");
        }
        return con;
    }

    private static void insert(String name, String city, double marks, String mobileno) {
        Connection con = connect();
        try {
            String query = "INSERT INTO student(studname,city,marks,mobileno)VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, city);
            ps.setDouble(3, marks);
            ps.setString(4, mobileno);
            ps.executeUpdate();
            System.out.println("INSERTION SUCCESSFUL");
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("INSERTION FAILED: " + e.getMessage());
        } catch (Exception e) {
        }
    }

    private static void update(int rollno, String name, String city, double marks, String mobileno) {
        Connection con = connect();
        try {
            String query = "UPDATE student set studname=?,city=?,marks=?,mobileno=? WHERE rollno = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, city);
            ps.setDouble(3, marks);
            ps.setString(4, mobileno);
            ps.setInt(5, rollno);
            ps.executeUpdate();
            System.out.println("UPDATION SUCCESSFUL");
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("UPDATED FAILED: " + e.getMessage());
        } catch (Exception e) {
        }
    }

    public static void delete(int rollno) {
        Connection con = connect();
        try {
            String query = "DELETE FROM student WHERE rollno = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, rollno);
            ps.executeUpdate();
            System.out.println("DELETION SUCCESSFUL");
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("DELETION FAILED: " + e.getMessage());
        } catch (Exception e) {
        }
    }

    public static void selectAll() {
        Connection con = connect();
        try {
            String sql = "SELECT rollno,studname,city,marks,mobileno FROM student;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); // executeQuery() is used for SELECT statements
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("studname");
                String city = rs.getString("city");
                double marks = rs.getDouble("marks");
                String mobileno = rs.getString("mobileno");

                System.out.printf("ROLL NO   - %d\n", rollno);
                System.out.printf("NAME      - %s\n", name);
                System.out.printf("CITY      - %s\n", city);
                System.out.printf("MARKS     - %2f\n", marks);
                System.out.printf("MOBILE NO - %s\n", mobileno);
                System.out.println("=========================================");
            }
            ps.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SELECT ALL FAILED: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("SELECT ALL FAILED: " + e.getMessage());
        }
    }

    public static void selectSingle(int rollno){
        Connection con = connect();
        try {
            String sql = "SELECT rollno,studname,city,marks,mobileno FROM student WHERE rollno=?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rollno);
            ResultSet rs = ps.executeQuery(); // executeQuery() is used for SELECT statements
            if (rs.next()) {
                int rollnum = rs.getInt("rollno");
                String name = rs.getString("studname");
                String city = rs.getString("city");
                double marks = rs.getDouble("marks");
                String mobileno = rs.getString("mobileno");

                System.out.printf("ROLL NO   - %d\n", rollnum);
                System.out.printf("NAME      - %s\n", name);
                System.out.printf("CITY      - %s\n", city);
                System.out.printf("MARKS     - %2f\n", marks);
                System.out.printf("MOBILE NO - %s\n", mobileno);
                System.out.println("=========================================");
            }else{
                System.out.println("NO DATA FOUND FOR ROLL NO " + rollno);
            }
            ps.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("SELECT ALL FAILED: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("SELECT ALL FAILED: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("1. INSERT");
        System.out.println("2. UPDATE");
        System.out.println("3. DELETE");
        System.out.println("4. SELECT ALL");
        System.out.println("5. SELECT SINGLE");
        System.out.println("6. EXIT");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Scanner s = new Scanner(System.in);
        String name, city, mobileno;
        double marks;
        int rollno;
        switch (choice) {
            case 1:
                // Insert operation

                System.out.println("ENTER NAME - ");
                name = s.next();
                System.out.println("ENTER CITY - ");
                city = s.next();
                System.out.println("ENTER MARKS - ");
                marks = s.nextDouble();
                System.out.println("ENTER MOBILE NO - ");
                mobileno = s.next();
                insert(name, city, marks, mobileno);
                break;
            case 2:
                // Update operation
                System.out.print("ENTER THE ROLL NO TO UPDATE THE DATA - ");
                rollno = s.nextInt();
                System.out.printf("ENTER THE NAME YOU WANT TO UPDATE FOR ROLL NO %d - ", rollno);
                name = s.next();
                System.out.printf("ENTER THE CITY YOU WANT TO UPDATE FOR ROLL NO %d - ", rollno);
                city = s.next();
                System.out.printf("ENTER THE MARKS YOU WANT TO UPDATE FOR ROLL NO %d - ", rollno);
                marks = s.nextDouble();
                System.out.printf("ENTER THE MOBILE NO YOU WANT TO UPDATE FOR ROLL NO %d - ", rollno);
                mobileno = s.next();

                update(rollno, name, city, marks, mobileno);
                break;
            case 3:
                // Delete operation
                System.out.print("ENTER THE ROLL NO TO DELETE THE DATA - ");
                rollno = s.nextInt();
                delete(rollno);
                break;
            case 4:
                // Select all operation
                selectAll();
                break;

            case 5:
                // Select single operation
                System.out.print("ENTER THE ROLL NO TO SELECT THE DATA - ");
                rollno = s.nextInt();
                selectSingle(rollno);
                break;
            case 6:
                System.out.println("Exiting the program.");
                sc.close();
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }

}