package feeStructures;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetFee {
    public void getFee(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM feeStructure");
        System.out.println("RollNumber  "+" Name"+"     Dues");
        while(resultSet.next()){
            System.out.print(resultSet.getString("rollNumber")+"        ");
            System.out.print(resultSet.getString("name")+"      ");
            System.out.println(resultSet.getString("due"));
        }
    }

}
