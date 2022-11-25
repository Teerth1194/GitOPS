package com.reqres.api.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configManager {

    private static configManager manager;
    private static final Properties prop = new Properties();

    private configManager() throws IOException {


        //InputStream inputstream = configManager.class.getClassLoader().getResourceAsStream("C:/Users/teerthp/Documents/Automation/Automation-Local/API_RestAssuredBDDApproach/resources/config.properties");

        FileInputStream inputstream = new FileInputStream(System.getProperty("user.dir")+"/resources/config.properties");
        prop.load(inputstream);

    }
    public static configManager getInstance(){
        if (manager==null){
            synchronized (configManager.class){
                try {
                    manager = new configManager();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return manager;
    }

    public String getstring(String key){
        return System.getProperty(key, prop.getProperty(key));
    }
}
