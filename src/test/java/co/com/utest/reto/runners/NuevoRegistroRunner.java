package co.com.utest.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/nuevoRegistro.feature",
        glue = {"co.com.utest.reto.stepdefinitions"},
        plugin = {"json:target/cucumber_json/cucumber.json"},
        snippets = SnippetType.CAMELCASE
)

public class NuevoRegistroRunner {
}
