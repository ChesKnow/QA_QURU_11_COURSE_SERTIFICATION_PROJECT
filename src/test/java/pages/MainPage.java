package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    //locators
    private SelenideElement
    title = $("#__next");
    //actions
    public MainPage openMainPageAndCheckTitle() {
        open("");
        title.shouldHave(text("Почта России"));
        return this;
    }
    public MainPage leftManuBarMayBeOpenedAndClosed() {
        // TODO: 08.06.2022 locators 
        return this;
    }
    public MainPage trackingBarWorks() {
        // TODO: 08.06.2022 locators 
        return this;
    }
    public MainPage postingBarWorks() {
        // TODO: 08.06.2022 locators 
        return this;
    }
    public  MainPage loginButtonRedirectToLoginPage() {
        // TODO: 08.06.2022 locators 
        return this;
    }
}
