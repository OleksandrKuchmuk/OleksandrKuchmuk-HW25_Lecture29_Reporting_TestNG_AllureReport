package com.cursor.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties;

    static {
        try{
            properties =new Properties();
            InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream("test.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key){
        String systemProp = System.getProperty(key);
        if (systemProp!=null){
            return systemProp;
        }
        return properties.getProperty(key);
    }
}
