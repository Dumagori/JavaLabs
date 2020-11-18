package laba6.controller;

import com.github.javafaker.Faker;
import laba6.model.Car;
import laba6.model.Specifications;

import java.util.Random;


public class SpecificationsController {
    public Specifications createRandomSpecifications() {
        Faker faker = new Faker();
        Specifications specifications = new Specifications();
        Random random = new Random();

        specifications.setPower(faker.number().numberBetween(100, 400));
        specifications.setMaxSpeed(faker.number().numberBetween(100, 200));
        specifications.setFuelСonsumption(random.nextDouble());

        return specifications;
    }
}
