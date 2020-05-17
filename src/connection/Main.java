package connection;

import feeStructures.GetFee;
import registration.Registrations;
import result.Results;
import students.GetStudents;
import teacher.GetTeacher;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        if (databaseConnection.attemptConnection()) {
           // System.out.println("Connection Created Successfully");
        }
        //GetStudents students = new GetStudents();
        //students.getStudents(databaseConnection.getConnection());
//        students.getStudent(databaseConnection.getConnection());

        //Registrations registrations = new Registrations();
        //registrations.register(databaseConnection.getConnection());
//
//
//        GetFee getFee = new GetFee();
//        getFee.getFee(databaseConnection.getConnection());

//        GetTeacher getTeacher = new GetTeacher();
//        getTeacher.getTeachers(databaseConnection.getConnection());
        Results results = new Results();
        results.enterResult(databaseConnection.getConnection());
    }
}
