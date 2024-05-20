package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPageObject {
    public static final SelenideElement searchString = $("#ooui-php-1");
    public static final SelenideElement pageTitle = $(".mw-page-title-main");
    public static final SelenideElement wellcomeTitle = $(".mw-headline").$("[title=Википедия]");
    public static final SelenideElement popupWellcomeTitle = $("[class=mwe-popups-container]");
    public static final SelenideElement mainHeaderPage = $("#firstHeading");
    public static final SelenideElement createItemButton = $("[class=main-cdx-button-link]");
    public static final SelenideElement sandboxButton = $("[class=mw-ui-button]");
    public static final SelenideElement searchButton = $("#searchButton");
    public static final SelenideElement searchResults =$(".mw-search-results");

    public static void setSearchStringValue(String value) {
        searchString.setValue(value).pressEnter();

    }
    public static void checksearchResults(String value) {
        searchResults.shouldHave(Condition.text(value));

    }

    public static void checkPageTitle(String value) {
        pageTitle.shouldHave(Condition.text(value));

    }

    public static void wellcomeTitleHover() {
        wellcomeTitle.hover();
    }

    public static void clickPopupWellcomeTitle() {
        popupWellcomeTitle.shouldBe(Condition.visible).click();
    }

    public static void checkValueMainHeaderPage(String value) {
        mainHeaderPage.shouldBe(Condition.text(value));
    }

    public static void clickCreateItemButton() {
        createItemButton.click();
    }

    public static void clickSandboxButton() {
        sandboxButton.shouldBe(Condition.visible).click();
    }
    public static void clickSearchButton(){
        searchButton.click();
    }

}



