package com.alexlis.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityComponent {

    private SelenideElement stateWrapper = $("#state"),
            stateValueInput = $("#stateCity-wrapper"),
            cityWrapper = $("#city"),
            cityValueInput = $("#stateCity-wrapper");

    public void setState(String value) {
        stateWrapper.scrollTo().click();
        stateValueInput.$(byText(value)).click();
    }

    public void setCity(String value) {
        cityWrapper.click();
        cityValueInput.$(byText(value)).click();
    }
}
