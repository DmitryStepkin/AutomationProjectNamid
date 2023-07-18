package com.namid.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions (
            plugin = {"pretty",
                    "html:target/reports.html",
                    "rerun:target/rerun.txt",
                   "json:target/cucumber.json",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "src/test/resources/features",
            glue = "com/namid/step_definition",
            dryRun = false,
            tags = "@B29G30-166",
            publish = true // generating a report with public link

    )

public class CukesRunner{

}


