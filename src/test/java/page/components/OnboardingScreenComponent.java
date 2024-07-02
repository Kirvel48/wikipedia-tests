package page.components;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class OnboardingScreenComponent {

    @Step("Закрыть экран онбординга")
    public void closeOnboardingScreen() {
        Selenide.back();
    }
}
