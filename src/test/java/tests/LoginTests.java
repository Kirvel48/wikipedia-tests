package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

import page.LoginPageObject;


public class LoginTests extends TestBase {
    @Test
    @DisplayName("Авторизация учетной записи пользователя")
    @Tag("Login")
    void loginTest() {
        step("Open main page", () -> open());
        step("Open login page", LoginPageObject::openLoginPage);
        step("Set username", () -> LoginPageObject.setUsername(userName));
        step("Set password", () -> LoginPageObject.setPassword(password));
        step("Click login button", LoginPageObject::clickLoginButton);
        step("Check login success", () -> LoginPageObject.checkUserPage(userName));


    }

    @Test
    @DisplayName("Выход из учетной записи")
    @Tag("Login")
    void loginOuttest() {
        step("Open main page", () -> open());
        step("Open login page", LoginPageObject::openLoginPage);
        step("Set username", () -> LoginPageObject.setUsername(userName));
        step("Set password", () -> LoginPageObject.setPassword(password));
        step("Click login button", LoginPageObject::clickLoginButton);
        step("Logout", LoginPageObject::logout);
        step("Chek logout", LoginPageObject::checkLogout);

    }
}
