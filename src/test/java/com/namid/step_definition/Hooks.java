package com.namid.step_definition;

/*
IN this we will be able to create "pre" and "post" conditions for ALL the SCENARIOS and even STEPS
 */

import com.namid.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


  // @Before //  (order=1)  // import the @Before from io.cucumber.java
    public void setupMethod(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");

    }

  //  @Before  (value = "@login", order = 2)
    public void login_scenario_before(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");

    }

    @After // after will be executed automatically after EVERY scenario in the project.
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()){

            byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }



        //System.out.println("--->@After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();
    }


  //  @BeforeStep
    public void setupStep(){
        System.out.println("----->@BeforeSTEP : Running before each step");
    }

  //  @AfterStep
    public void teardownStep(){
        System.out.println("----->@BAfterSTEP : Running after each step");
    }

}
