package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPro {

    static Properties prop;

    static FileInputStream input;

    public static String getProperty(String key) {
        prop = new Properties();
        try {
//            input = new FileInputStream(propertiesFileLocation + propertiesFileName);
            input = new FileInputStream("src/test/java/TestConfig/TestData.properties");
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }
}
