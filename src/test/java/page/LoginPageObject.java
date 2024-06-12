package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {
    SelenideElement loginPage = $("#pt-login"),
            usernameInput = $("#wpName1"),
            passworgInput = $("#wpPassword1"),
            loginButton = $("#wpLoginAttempt"),
            userPage = $("#pt-userpage"),
            logoutButton = $("#pt-logout"),
            logoutPage = $("#mw-content-text");

    public void openLoginPage() {
        loginPage.click();
    }

    public void setUsername(String value) {
        usernameInput.setValue(value);
    }

    public void setPassword(String value) {
        passworgInput.setValue(value);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void checkUserPage(String value) {
        userPage.shouldHave(Condition.text(value));
    }

    public void logout() {
        logoutButton.click();
    }

    public void checkLogout() {
        logoutPage.shouldHave(Condition.text("Вы завершили сеанс работы."));
    }
}