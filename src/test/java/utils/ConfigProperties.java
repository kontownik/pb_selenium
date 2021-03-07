package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ConfigProperties {
    Properties properties = new Properties();

    public ConfigProperties() {
        loadProperties();
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

    private void loadProperties() {
        try (InputStream input = Objects.requireNonNull(getClass().getClassLoader().getResource("config.properties")).openStream()) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}