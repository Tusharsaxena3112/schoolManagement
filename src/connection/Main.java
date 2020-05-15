package connection;

import feeStructures.GetFee;
import students.GetStudents;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        if (databaseConnection.attemptConnection()) {
            System.out.println("Connection Created Successfully");
        }
        GetStudents students = new GetStudents();
        students.getStudents(databaseConnection.getConnection());
        students.getStudent(databaseConnection.getConnection());

//        GetFee getFee = new GetFee();
//        getFee.getFee(databaseConnection.getConnection());
    }
}
