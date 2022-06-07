package tests.ui;

import org.junit.jupiter.api.Test;
import pages.MainPage;
import tests.TestBase;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    void openMainPageTest() {
        mainPage.openMainPageAndCheckTitle();
    }

}