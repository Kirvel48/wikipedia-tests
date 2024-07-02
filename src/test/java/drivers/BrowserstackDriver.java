package drivers;

import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.codeborne.selenide.WebDriverProvider;


import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackDriver implements WebDriverProvider {
    protected static BrowserstackConfig browserstackConfig = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", browserstackConfig.getUsername());
        caps.setCapability("browserstack.key", browserstackConfig.getAuthkey());

        caps.setCapability("app", browserstackConfig.getApp());

        caps.setCapability("device", browserstackConfig.getDevice());
        caps.setCapability("os_version", browserstackConfig.getPlatformVersion());

        caps.setCapability("project", "BrowserStack Sample");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");

        try {
            return new RemoteWebDriver(
                    new URL(browserstackConfig.getUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
