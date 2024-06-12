package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPageObject {
    SelenideElement searchString = $("#ooui-php-1"),
            pageTitle = $(".mw-page-title-main"),
            wellcomeTitle = $(".mw-headline").$("[title=Википедия]"),
            popupWellcomeTitle = $("[class=mwe-popups-container]"),
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

    public void checkPageTitle(String value) {
        pageTitle.shouldHave(Condition.text(value));

    }

    public void wellcomeTitleHover() {
        wellcomeTitle.hover();
    }

    public void clickPopupWellcomeTitle() {
        popupWellcomeTitle.shouldBe(Condition.visible).click();
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



