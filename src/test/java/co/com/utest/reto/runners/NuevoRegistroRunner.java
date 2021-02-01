package co.com.utest.reto.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/nuevoRegistro.feature",
        glue = {"co.com.utest.reto.stepdefinitions"})
//        plugin = {"json.target/cucumber_json/cucumber.json"})

public class NuevoRegistroRunner {
}
