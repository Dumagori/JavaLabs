package laba6.controller;

import com.github.javafaker.Faker;
import laba6.model.Car;

import java.util.Scanner;

public class CarController {
    public Car createRandomCar() {
        Faker faker = new Faker();
        Car car = new Car();

        car.setBrand(faker.name().firstName());
        car.setReleseYear(faker.number().numberBetween(1960, 2020));
        car.setCost(faker.number().numberBetween(500000,10000000));

        return car;
    }
    public Car createManualCar(){
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter brend: "); car.setBrand(scanner.next());
        System.out.print("Enter cost: "); car.setCost(scanner.nextInt());
        System.out.print("Enter relese year: "); car.setReleseYear(scanner.nextInt());

        return car;
    }
}
