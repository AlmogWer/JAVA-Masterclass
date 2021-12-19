package DB;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "tstjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\almogw\\IdeaProjects\\JAVA-Masterclass\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\almogw\\IdeaProjects\\JAVA-Masterclass\\TestDB\\tstjava.db"); Statement statement = conn.createStatement()) {
//            statement.execute("create table contacts (name TEXT ,phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("create table if not exists " + TABLE_CONTACTS + " (" + COLUMN_NAME + " text, " + COLUMN_PHONE + " integer, " + COLUMN_EMAIL + " text" + ")");

            insertContact(statement, "Tim", 6545678, "tim@email.com");
            insertContact(statement, "Joe", 45632, "joe@email.com");
            insertContact(statement, "Jane", 4829484, "jane@email.com");
            insertContact(statement, "Fido", 9038, "dog@email.com");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUES('Tim',6545678, 'tim@email.com')");
//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUES('Joe',45632, 'joe@email.com')");
//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUES('Jane',4829484, 'jane@email.com')");
//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUES('Fido',9038, 'dog@email.com')");

            statement.execute("update " + TABLE_CONTACTS + " set " + COLUMN_PHONE + "=5566789" + " WHERE " + COLUMN_NAME + "='Jane'");
            statement.execute("delete from " + TABLE_CONTACTS + " where " + COLUMN_NAME + " ='Joe'");

//            statement.execute("insert into contacts (name,phone,email) " + "values ('Joe',45632,'joe@gmail.com')");
//            statement.execute("insert into contacts (name,phone,email) " + "values ('Jane',4829484,'Jane@somewhere.com')");
//            statement.execute("insert into contacts (name,phone,email) " + "values ('Fido',9038,'dog@email.com')");
//            statement.execute("UPDATE contacts set phone=5566789 where name='Jane'");
//            statement.execute("delete from contacts where name='Joe'");

//            statement.execute("select * from contacts ");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("Select * from " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) + " " + results.getString(COLUMN_EMAIL));
            }

            results.close();
            statement.close();
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " + COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUES('" + name + "'," + phone + ", '" + email + "')");
    }
}
