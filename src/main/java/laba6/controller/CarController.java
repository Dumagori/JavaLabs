package laba6.controller;

import com.github.javafaker.Faker;
import laba6.model.Car;

public class CarController {
    public Car createRandomCar() {
        Faker faker = new Faker();
        Car car = new Car();

        car.setBrand(faker.name().firstName());
        car.setReleseYear(faker.number().numberBetween(1960, 2020));
        car.setCost(faker.number().numberBetween(500000,10000000));

        return car;
    }
}
