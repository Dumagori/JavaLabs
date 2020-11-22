package laba6.controller;

import java.sql.*;

public class ReadController {
    public ReadController() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/carbase?useSSL=false";
        String userName = "root";
        String password = "01101999g400S";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {

            System.out.println("We`re connected!");

            System.out.println("id\t|\tBrand\t|\tCost\t|\tRelese year");
            System.out.println("----------------------------");

            ResultSet resultSet = statement.executeQuery("select * from car");
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt(1) + "\t|\t" +
                                resultSet.getString(2) + "\t|\t" +
                                resultSet.getInt(3) + "\t|\t" +
                                resultSet.getInt(4));
                System.out.println("----------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
