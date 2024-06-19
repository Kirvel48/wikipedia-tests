package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)

public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://ru.wikipedia.org/wiki")
    String getBaseUrl();

    @Key("browser.name")
    @DefaultValue("chrome")
    String getBrowserName();


    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String getRemoteUrl();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("version")
    @DefaultValue("113.0")
    String getBrowserVersion();

}