package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    private SelenideElement
    title = $("#__next"),
    trackingbar = $("#barcode");
    //actions
    public MainPage openMainPageAndCheckTitle() {
        open("");
        title.shouldHave(text("Почта России"));
        return this;
    }
    public MainPage trackingFromMainPage(String barcode) {
         open("");
         trackingbar.setValue(barcode).pressEnter();
         $("#page-tracking").shouldHave(text(barcode));
         return this;
    }
    public MainPage leftManuBarMayBeOpenedAndClosed() {
        // TODO: add locators
         return this;
    }
}
