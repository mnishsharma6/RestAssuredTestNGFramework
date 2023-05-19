package com.spotify.oauth2.utils;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;

public class FakerUtils {
    @Step
    public static String generateName(){
        Faker faker = new Faker();
        return "Playlist " + faker.regexify("[A-Za-z0-9]{10}");
    }

    @Step
    public static String generateDescription(){
        Faker faker = new Faker();
        return "Description " + faker.regexify("[A-Za-z0-9]{20}");
    }
}
