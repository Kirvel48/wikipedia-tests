package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NavigationBarPageObject {
    SelenideElement downloadPageButton = $("#coll-download-as-rl"),
            downloadButton = $("[class=oo-ui-labelElement-label]"),
            randomPageButton = $("#n-randompage"),
            navigationButton = $("#ca-view");

    public void clickDownloadPageButton() {
        downloadPageButton.click();
    }

    public void clickDownloadButton() {
        downloadButton.click();
    }

    public void clickRandomPageButton() {
        randomPageButton.click();
    }

    public void checkNavigationButton() {
        navigationButton.shouldBe(visible);
    }

}
