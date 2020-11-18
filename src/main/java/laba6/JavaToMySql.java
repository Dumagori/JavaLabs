package laba6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaToMySql {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://DESKTOP-LQ82JCS//SQLEXPRESS:3306/Работа_предприятий_автомобилестроения";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public JavaToMySql() {
        String query = "select Марка, Год_начала_выпуска, Цена_единицы from Об_автомобиле";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String brand = rs.getString(1);
                int releseYear = rs.getInt(2);
                int cost = rs.getInt(3);
                System.out.printf("brand: %d, relese year: %s, cost: %s %n", brand, releseYear, cost);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}
