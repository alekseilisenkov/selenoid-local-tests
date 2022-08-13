package com.alexlis.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {

    private SelenideElement calendarFormWrapper = $("#dateOfBirthInput");

    public void setDate(String year, String month, String day) {
        calendarFormWrapper.click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $$(".react-datepicker__day").find(exactText(day)).click();
    }
}
