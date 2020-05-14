package students;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetStudents {
    public void getStudents(Connection connection) throws SQLException {
        Statement statement=connection.createStatement();
        ResultSet resultset = statement.executeQuery("SELECT * FROM Students");
        while(resultset.next()){
            System.out.print(resultset.getString("name")+" ");
            System.out.println(resultset.getString("rollNumber"));
            System.out.println("-----------");
        }
    }
}
