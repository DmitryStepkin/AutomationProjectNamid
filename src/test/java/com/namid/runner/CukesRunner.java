package com.namid.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions (
            plugin = {"pretty",
                    "html:target/reports.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "src/test/resources/features",
            glue = "com/namid/step_definitions",
            dryRun = false,
            tags = "",
            publish = true // generating a report with public link
            //, monochrome=true  --> works with pretty plugin
    )

public class CukesRunner{

}

