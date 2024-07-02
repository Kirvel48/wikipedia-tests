package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${envMobile}.properties"
})

public interface LocalConfig extends Config {

    @Key("deviceName")
    @DefaultValue("Pixel 4 API 30")
    String getDeviceName();

    @Key("platformVersion")
    @DefaultValue("11.0")
    String getPlatformVersion();

    @Key("url")
    @DefaultValue("http://localhost:4723/wd/hub")
    String getUrl();
}
