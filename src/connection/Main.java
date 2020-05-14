package connection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        System.out.println(databaseConnection.attemptConnection());
    }
}
