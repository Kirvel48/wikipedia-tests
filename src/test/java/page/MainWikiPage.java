package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class MainWikiPage {
    private final SelenideElement
            searchBar = $(accessibilityId("Search Wikipedia"));

    @Step("Нажатие на строку поиска")

    public void searchLineClick() {
        searchBar.click();

    }
}

