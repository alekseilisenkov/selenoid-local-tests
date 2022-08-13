package com.alexlis.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String registrationFormUrl = "https://demoqa.com/automation-practice-form";

    public CalendarComponent calendar = new CalendarComponent();
    public StateAndCityComponent stateAndCity = new StateAndCityComponent();

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderCheckbox = $("#genterWrapper"),
            phoneNumberInput = $("#userNumber"),
            subjectWrapper = $("#subjectsInput"),
            hobbiesCheckbox = $("#hobbiesWrapper"),
            uploadPictureWrapper = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            submitBtn = $("#submit"),
            resultsTable = $(".table-responsive");

    public RegistrationPage openPage() {
        open(registrationFormUrl);
        return this;
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage chooseGender(String value) {
        genderCheckbox.$(byText(value)).click();
        return this;
    }

    public RegistrationPage typePhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirthdayDate(String year, String month, String day) {
        calendar.setDate(year, month, day);
        return this;
    }

    public RegistrationPage chooseSubject(String value) {
        subjectWrapper.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesCheckbox.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        uploadPictureWrapper.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage typeAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        stateAndCity.setState(value);
        return this;
    }

    public RegistrationPage setCity(String value) {
        stateAndCity.setCity(value);
        return this;
    }

    public void submitForm() {
        submitBtn.click();
    }

    public RegistrationPage checkResultsValue(String key, String value) {
        resultsTable.$(byText(key))
                .parent().shouldHave(text(value));
        return this;
    }
}
