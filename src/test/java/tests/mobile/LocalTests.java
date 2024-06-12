package tests.mobile;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;


@Tag("Mobile")

public class LocalTests extends TestBase {
    @Test
    @DisplayName("Проверка онбординг-экранов")
    void onBoardingPagesTest() {
       step("Проверить первый экран", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Проверить второй экран", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Проверить третий экран", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Проверить четвертый экран", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Data & Privacy"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
    }

    @Test
    @DisplayName("Проверка поиска")
    void openArticleTest() {
        step("Закрыть экран онбординга", Selenide::back);
        step("Ввод значения в поисковую строку", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");

        });
        step("Проверка поисковой выдачи  ", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0))
        );

    }

    @Test
    @DisplayName("Соответствие поисковой выдачи запросу")
    void searchPageTest() {
        step("Закрыть экран онбординга", Selenide::back);

        step("Ввод значения в поисковую строку", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Riesling");
        });
        step("Поисковая выдача соответсвует запросу", () ->
                $(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(text("Riesling")));

    }
}

