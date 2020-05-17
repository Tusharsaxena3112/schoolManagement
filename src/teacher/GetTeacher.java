package teacher;

import java.sql.*;

public class GetTeacher {
    public void getTeachers(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM teachers");
        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+"      "+resultSet.getString("subject")+"      "+resultSet.getString("standard"));
        }
    }
}
