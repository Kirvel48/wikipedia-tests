package tests.web;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

import page.LoginPageObject;

@Tag("Login")
@Tag("Web")
@DisplayName("Тесты авторизации")

public class LoginTests extends TestBase {
    LoginPageObject loginPageObject = new LoginPageObject();

    @Test
    @DisplayName("Авторизация учетной записи пользователя")
    @Owner("Тётушкин К.И.")

    public void loginTest() {
        step("Open main page", () -> open());
        step("Open login page", loginPageObject::openLoginPage);
        step("Set username", () -> loginPageObject.setUsername(userName));
        step("Set password", () -> loginPageObject.setPassword(password));
        step("Click login button", () -> {
            loginPageObject.clickLoginButton();
        });
        step("Check login success", () -> {
            loginPageObject.checkUserPage(userName);
        });


    }

    @Test
    @DisplayName("Выход из учетной записи")
    @Owner("Тётушкин К.И.")
    public void loginOuttest() {
        step("Open main page", () -> open());
        step("Open login page", loginPageObject::openLoginPage);
        step("Set username", () -> loginPageObject.setUsername(userName));
        step("Set password", () -> loginPageObject.setPassword(password));
        step("Click login button", loginPageObject::clickLoginButton);
        step("Logout", loginPageObject::logout);
        step("Chek logout", loginPageObject::checkLogout);

    }
}
