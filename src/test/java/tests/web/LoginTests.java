package tests.web;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

import page.LoginPage;

@Tag("Login")
@Tag("Web")
@DisplayName("Тесты авторизации")

public class LoginTests extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Авторизация учетной записи пользователя")
    @Owner("Тётушкин К.И.")

    public void loginTest() {
        step("Open main page", () -> open());
        step("Open login page", loginPage::openLoginPage);
        step("Set username", () -> loginPage.setUsername(userName));
        step("Set password", () -> loginPage.setPassword(password));
        step("Click login button", () ->
                loginPage.clickLoginButton());
        step("Check login success", () ->
                loginPage.checkUserPage(userName));


    }

    @Test
    @DisplayName("Выход из учетной записи")
    @Owner("Тётушкин К.И.")
    public void loginOuttest() {
        step("Open main page", () -> open());
        step("Open login page", loginPage::openLoginPage);
        step("Set username", () -> loginPage.setUsername(userName));
        step("Set password", () -> loginPage.setPassword(password));
        step("Click login button", loginPage::clickLoginButton);
        step("Logout", loginPage::logout);
        step("Chek logout", loginPage::checkLogout);

    }
}
