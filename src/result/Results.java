package result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
        statement.executeQuery("SELECT * FROM result ORDER BY percent DESC");

    }
}
