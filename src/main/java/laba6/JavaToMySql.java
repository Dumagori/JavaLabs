package laba6;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class JavaToMySql {

    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/carshistory?useSSL=false";
    static final String USER = "root";
    static final String PASSWORD = "root";
    private Connection conn = null;

    public void connect() {
        try {
            this.conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void closeConnection() {
        try {
            this.conn.close();
            System.out.println("Closed the connection.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

