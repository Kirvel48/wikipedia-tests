package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${envMobile}.properties"
})
public interface BrowserstackConfig extends Config {
    @Key("userName")
    String getUsername();

    @Key("authKey")
    String getAuthkey();


    @Key("url")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getUrl();

    @Key("device")
    @DefaultValue("Samsung Galaxy S22 Ultra")
    String getDevice();

    @Key("platformVersion")
    @DefaultValue("12.0")
    String getPlatformVersion();

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();
}
