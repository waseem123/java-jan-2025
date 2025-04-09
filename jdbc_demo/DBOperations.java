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
        }  catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        System.out.println("1. INSERT");
        System.out.println("2. UPDATE");
        System.out.println("3. DELETE");
        System.out.println("4. SELECT");
        System.out.println("5. EXIT");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // Insert operation
                String name = "John Doe";
                String city = "New York";
                int marks = 78;
                String mobileno = "1234567890";
                insert(name, city, marks, mobileno);
                break;
            case 2:
                // Update operation
                break;
            case 3:
                // Delete operation
                break;
            case 4:
                // Select operation
                break;
            case 5:
                System.out.println("Exiting the program.");
                sc.close();
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }

}