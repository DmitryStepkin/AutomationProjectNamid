package com.namid.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //  create a private constructor to remove access to this object
    private Driver(){}

    /*
    We make the WebDriver, because we want to close access from outside the class
    We are making it static, because we will use it in a static method
     */
    private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();

    /*
    Create a reusable utility method which will return thr same driver instance once we call it.
    If an instance doesn't exist, it will create first, and then it will always return same instance
     */

    public static WebDriver getDriver(){

        if (driverPool.get()==null){
            /*
            we will read our browser type from configuration.properties file
            This wa, we can control which browser is opened from outside our code
             */
            String browserType=ConfigurationReader.getProperty("browser");
            /*
            Depending on the browserType returned from the configuration.properties
            switch statement will determine the "case", and open the matching browser.
             */

            switch (browserType){
                case  "chrome":
                    //     WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    //  WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "headless-chrome":
                    // WebDriverManager.chromedriver().setup();
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("--headless=new");
                    driverPool.set(new ChromeDriver(option));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }
        }

        return driverPool.get();

    }
    public static void closeDriver(){
        if(driverPool.get()!=null){
            /*
            this line will terminate (kill) the current existing driver completely. It will not exist going forward.
             */
            driverPool.get().quit();
            /*
            we assign the value back to "null"
             */
            driverPool.remove();
        }
    }
}




