package comdulcetapplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties = new Properties();

    public ConfigReader(String fileName) {
        try (FileInputStream input = new FileInputStream(fileName)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
