package com.alexlis.helpers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    public static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = lastName.toLowerCase(Locale.ROOT) + "@gmail.com",
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            address = faker.address().streetAddress();
}
