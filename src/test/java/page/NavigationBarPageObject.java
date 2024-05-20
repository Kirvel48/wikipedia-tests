package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NavigationBarPageObject {
    public static final SelenideElement downloadPageButton = $("#coll-download-as-rl");
    public static final SelenideElement downloadButton = $("[class=oo-ui-labelElement-label]");
    public static final SelenideElement randomPageButton = $("#n-randompage");
    public static final SelenideElement navigationButton = $("#ca-view");
    public static void clickDownloadPageButton() {
        downloadPageButton.click();
    }

    public static void clickDownloadButton() {
        downloadButton.click();
    }

    public static void clickRandomPageButton() {
        randomPageButton.click();
    }

    public static void checkNavigationButton() {
        navigationButton.shouldBe(visible);
 }

}
