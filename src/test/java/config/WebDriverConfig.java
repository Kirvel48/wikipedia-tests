package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
})
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


}