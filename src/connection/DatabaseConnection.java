package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection = null;

    public Connection getConnection(){
        return connection;
    }

    public boolean attemptConnection() throws SQLException {
        boolean isConnected = false;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useLegacyDatetimeCode=false&serverTimezone=UTC","user","");
        if(connection!=null){
            isConnected = true;
        }
        return isConnected;
    }

    public boolean closeConnection() throws SQLException {
        boolean isClosed = false;
        if(getConnection()!=null){
            getConnection().close();
            isClosed = true;
        }
        return isClosed;
    }
}
