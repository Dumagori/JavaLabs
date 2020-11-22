package laba6.controller;

import laba6.controller.CarController;
import laba6.model.Car;

import java.sql.*;
import java.util.Scanner;

public class WriteToBase {
    public WriteToBase() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/carbase?useSSL=false";
        String userName = "root";
        String password = "01101999g400S";
        Class.forName("com.mysql.jdbc.Driver");


        CarController carController = new CarController();
        System.out.print("Do you have your car information or you want to use random? [1 | 2]: ");
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        switch (scanner.nextInt()){
            case 1:
                car = carController.createManualCar();
                break;
            case 2:
                car = carController.createRandomCar();
                break;
        }

        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                Statement statement = connection.createStatement()){

            statement.executeUpdate("insert into car (brand, cost, releseYear) value(" +
                    "'"+car.getBrand().toString()+"', "+car.getCost()+", "+car.getReleseYear()+")");

            System.out.println("The write successfully done!");
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

}
