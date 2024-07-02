package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${envWeb}.properties"})
public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://ru.wikipedia.org/wiki")
    String getBaseUrl();

    @Key("browserName")
    @DefaultValue("chrome")
    String getBrowserName();


    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    String getRemoteUrl();


    @Key("version")
    @DefaultValue("113.0")
    String getBrowserVersion();

}