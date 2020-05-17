package result;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class Results {
    Scanner scanner = new Scanner(System.in);
    public void enterResult(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO result (name,percent) values (?,?)");
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter percent:");
        String percent  = scanner.nextLine();
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,percent);
        preparedStatement.executeUpdate();
    }

    public void getRankings(Connection connection) throws SQLException {
        Statement statement  = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM result ORDER BY percent DESC");
        while(resultSet.next()){
            System.out.println(resultSet.getString("percent")+"     "+resultSet.getString("name"));
        }
    }
}
