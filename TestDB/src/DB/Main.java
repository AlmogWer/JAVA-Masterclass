package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\almogw\\IdeaProjects\\JAVA-Masterclass\\TestDB\\tstjava.db"); Statement statement = conn.createStatement()) {
//            statement.execute("create table contacts (name TEXT ,phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\almogw\\IdeaProjects\\JAVA-Masterclass\\TestDB\\tstjava.db");
            Statement statement = conn.createStatement();
            statement.execute("create table contacts (name TEXT ,phone INTEGER, email TEXT)");

            statement.close();
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
