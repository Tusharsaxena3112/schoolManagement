package students;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class GetStudents {
    Scanner scanner = new Scanner(System.in);
    public void getStudents(Connection connection) throws SQLException {
        Statement statement=connection.createStatement();
        ResultSet resultset = statement.executeQuery("SELECT * FROM Students");
        System.out.println("Name"   +"      RollNumber");
        while(resultset.next()){
            System.out.print(resultset.getString("name")+"      ");
            System.out.println(resultset.getString("rollNumber"));
            System.out.println("-----------");
        }
    }
    public void getStudent(Connection connection) throws SQLException {
        System.out.println("Enter the name of the student");
        String name = scanner.nextLine();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from feeStructure where name=?");
        preparedStatement.setString(1,name);
        ResultSet resultSet =  preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("rollNumber")+"  "+resultSet.getString("name")+" "+resultSet.getString("due"));
        }
    }
}
