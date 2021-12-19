package DB;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\almogw\\IdeaProjects\\JAVA-Masterclass\\TestDB\\tstjava.db"); Statement statement = conn.createStatement()) {
//            statement.execute("create table contacts (name TEXT ,phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\almogw\\IdeaProjects\\JAVA-Masterclass\\TestDB\\tstjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("create table if not exists contacts" + " (name TEXT ,phone INTEGER, email TEXT)");

//            statement.execute("insert into contacts (name,phone,email) " + "values ('Joe',45632,'joe@gmail.com')");
//            statement.execute("insert into contacts (name,phone,email) " + "values ('Jane',4829484,'Jane@somewhere.com')");
//            statement.execute("insert into contacts (name,phone,email) " + "values ('Fido',9038,'dog@email.com')");
//            statement.execute("UPDATE contacts set phone=5566789 where name='Jane'");
//            statement.execute("delete from contacts where name='Joe'");

//            statement.execute("select * from contacts ");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("Select * from contacts");
            while (results.next()) {
                System.out.println(results.getString("name") + " " + results.getInt("phone") + " " + results.getString("email"));
            }

            results.close();

            statement.close();
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
