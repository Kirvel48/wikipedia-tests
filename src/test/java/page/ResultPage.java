package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class ResultPage {
    private final SelenideElement
            result = $(id("org.wikipedia.alpha:id/page_list_item_title"));
    private final ElementsCollection
            results = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Поисковая выдача соответствует запросу")
    public void checkResult(String value) {
        result.shouldHave(Condition.text(value));

    }

    @Step("Проверка поисковой выдачи")
    public void checkSizeResult(int value) {
        results.shouldHave(sizeGreaterThan(value));
    }
}
