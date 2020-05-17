package registration;

import students.GetStudents;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Registrations {
    private Scanner scanner = new Scanner(System.in);
    GetStudents getStudents = new GetStudents();
    public void register(Connection connection) throws SQLException {
        System.out.println("Enter Student's Name:");
        String name = scanner.nextLine();
        System.out.println("Enter your Roll number:");
        String roll  = scanner.nextLine();
        System.out.println("Enter Standard");
        String standard = scanner.nextLine();
        System.out.println("Enter section");
        String section = scanner.nextLine();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (name,rollNumber,standard,section) values (?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,roll);
        preparedStatement.setString(3,standard);
        preparedStatement.setString(4,section);
        preparedStatement.executeUpdate();
        getStudents.getStudents(connection);
    }
}
