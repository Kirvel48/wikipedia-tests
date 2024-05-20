package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {
    public static final SelenideElement loginPage = $("#pt-login");
    public static final SelenideElement usernameInput = $("#wpName1");
    public static final SelenideElement passworgInput = $("#wpPassword1");
    public static final SelenideElement loginButton = $("#wpLoginAttempt");
    public static final SelenideElement userPage = $("#pt-userpage");
    public static final SelenideElement logoutButton =$("#pt-logout");
    public static final SelenideElement logoutPage = $("#mw-content-text");

    public static void openLoginPage() {
        loginPage.click();
    }

    public static void setUsername(String value) {
        usernameInput.setValue(value);
    }

    public static void setPassword(String value) {
        passworgInput.setValue(value);
    }
    public static void clickLoginButton(){
        loginButton.click();
    }
    public static void checkUserPage(String value){
        userPage.shouldHave(Condition.text(value));
    }
    public static void logout(){
        logoutButton.click();
    }
    public static void checkLogout(){
        logoutPage.shouldHave(Condition.text("Вы завершили сеанс работы."));
    }
}