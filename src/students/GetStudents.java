package students;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class GetStudents {
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
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from feeStructure where name=?");


    }
}
