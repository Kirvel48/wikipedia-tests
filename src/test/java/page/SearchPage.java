package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {
    private final SelenideElement
            searchLine = $(id("org.wikipedia.alpha:id/search_src_text"));
@Step("Ввод значения в поисковую строку")
    public void searchLineSendKeys(String value) {
        searchLine.sendKeys(value);

    }
}

