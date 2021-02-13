package co.com.utest.reto.stepdefinitions;

import co.com.utest.reto.model.CuartoRegistroModel;
import co.com.utest.reto.model.PrimerRegistroModel;
import co.com.utest.reto.model.SegundoRegistroModel;
import co.com.utest.reto.model.TercerRegistroModel;
import co.com.utest.reto.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.equalTo;

public class NuevoRegistroStepDefinition {

    private Actor user = Actor.named("actor");

    @Managed(uniqueSession = true)
    private WebDriver herBrowser;

    @Steps
    AbrirBrowser abrirBrowser;

    @Before
    public void setUp() {

        user.can(BrowseTheWeb.with(herBrowser));
    }


    @Given("^me quiero registrar en la pagina de uTest$")
    public void meQuieroRegistrarEnLaPaginaDeUTest() {
        user.wasAbleTo(abrirBrowser);
    }

    @When("^ingreso los datos del primer registro$")
    public void ingresoLosDatosDelPrimerRegistro(List<PrimerRegistroModel> datosPrimerRegistro) {
        PrimerRegistroModel datosRegistrosObtenidos = datosPrimerRegistro.get(0);
        //user.abilityTo(IngresarPrimerRegistro.deLos(datosRegistrosObtenidos));
    }

    @When("^ingreso los datos del segundo registro$")
    public void ingresoLosDatosDelSegundoRegistro(List<SegundoRegistroModel> datosSegundoRegistro) {
        SegundoRegistroModel datosRegistrosObtenidos = datosSegundoRegistro.get(0);
        //user.abilityTo(IngresarSegundoRegistro.deLos(datosRegistrosObtenidos));
    }

    @When("^ingreso los datos del tercer registro$")
    public void ingresoLosDatosDelTercerRegistro(List<TercerRegistroModel> datosTercerRegistro) {
        TercerRegistroModel datosRegistrosObtenidos = datosTercerRegistro.get(0);
        //user.abilityTo(IngresarTercerRegistro.deLos(datosRegistrosObtenidos));
    }

    @When("^ingreso los datos del cuarto registro$")
    public void ingresoLosDatosDelCuartoRegistro(List<CuartoRegistroModel> datosCuartoRegistro) {
        CuartoRegistroModel datosRegistrosObtenidos = datosCuartoRegistro.get(0);
        //user.abilityTo(IngresarCuartoRegistro.deLos(datosRegistrosObtenidos));

    }

    @Then("^verifico que el mensaje del registro sea: \"([^\"]*)\"$")
    public void verificoQueElMensajeDelRegistroSea(String resultadoEsperado) {
        //user.should(GivenWhenThen.seeThat(ResultadoDelRegistro.is(), equalTo(resultadoEsperado)));
        //Pattern pattern = Pattern.compile("New A/c. ID: [^0-9]*.+");
        //user.should(GivenWhenThen.seeThat(ResultadoDelRegistro.is(), equalTo(pattern.matcher(resultadoEsperado).matches())));
    }

}
