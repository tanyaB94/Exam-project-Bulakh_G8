package libs;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {
    public static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    public static ConfigHiddenProperties hiddenConfigProperties = ConfigFactory.create(ConfigHiddenProperties.class);

}
