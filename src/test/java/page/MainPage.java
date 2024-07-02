package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement searchString = $("#ooui-php-1"),

    welcomeTitle = $(".main-top-header").$("[title=Википедия]"),
            popupWelcomeTitle = $("[class=mwe-popups-container]"),
            mainHeaderPage = $("#firstHeading"),
            createItemButton = $("[class=main-cdx-button-link]"),
            sandboxButton = $("[class=mw-ui-button]"),
            searchButton = $("#searchButton"),
            searchResults = $(".mw-search-results");

    public void setSearchStringValue(String value) {
        searchString.setValue(value).pressEnter();

    }

    public void checksearchResults(String value) {
        searchResults.shouldHave(Condition.text(value));

    }


    public void welcomeTitleHover() {
        welcomeTitle.hover();
    }

    public void clickPopupWelcomeTitle() {
        popupWelcomeTitle.shouldBe(Condition.visible).click();
    }

    public void checkValueMainHeaderPage(String value) {
        mainHeaderPage.shouldBe(Condition.text(value));
    }

    public void clickCreateItemButton() {
        createItemButton.click();
    }

    public void clickSandboxButton() {
        sandboxButton.shouldBe(Condition.visible).click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

}



