package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(


            //report//

            features = "src\\main\\resources\\myfeatures",
            glue = {"Definitionsofautomation",
                    "html:target/cucumber.html"
                    ,"json:target/cucumber.json"
                    ,"junit:target/cakes.xml"
                    ,"rerun: target/rerun.text"
            } ,
            tags = "@cucumber"

    )

    public class TestRunner extends AbstractTestNGCucumberTests {


    }

