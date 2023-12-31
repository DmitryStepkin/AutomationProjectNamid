package com.namid.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1 Create the Properties Object (create object)
    // make it "private", so we are limiting access to the object
    // "static" is to make sure its created amd loaded before everything else

    private static Properties properties=new Properties();

    static {

        try {
            //2 Open file using FileInputStream (open file)
            FileInputStream file=new FileInputStream("Configuration.properties");
            //3 Load the "properties" object with "file" (load properties)
            properties.load(file);

            // close file in the memory
            file.close();
        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!!");
            e.printStackTrace();
        }
    }
    // create a utility method to use the object to read
    //4 use "properties" object to read from file (read properties)

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
