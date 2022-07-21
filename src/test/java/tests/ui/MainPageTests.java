package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import tests.TestBase;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Открываем главную страницу")
    void openMainPageTest() {
        mainPage.openMainPageAndCheckTitle();
    }
    @Test
    @DisplayName("Проверяем трекер отправлений")
    void trackingFromMainPageTest() {
        mainPage.trackingFromMainPage("RW052656168KZ");
    }
}