package co.com.utest.reto.task;

import co.com.utest.reto.model.PrimerRegistroModel;
import co.com.utest.reto.userinterface.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPrimerRegistro implements Task {

    private PrimerRegistroModel primerRegistroModel;

    public IngresarPrimerRegistro(PrimerRegistroModel primerRegistroModel) {
        this.primerRegistroModel = primerRegistroModel;
    }

    @Override
    @Step("Ingresar datos del primer registro")

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroPage.LINK_JOIN_TODAY));
        actor.attemptsTo(Enter.theValue(primerRegistroModel.getFirstName()).into(RegistroPage.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(primerRegistroModel.getLastName()).into(RegistroPage.LAST_NAME));
        actor.attemptsTo(Enter.theValue(primerRegistroModel.getEmailAddress()).into(RegistroPage.EMAIL_ADDRESS));

    }

    public static IngresarPrimerRegistro deLos(PrimerRegistroModel primerRegistroModel) {
        return instrumented(IngresarPrimerRegistro.class, primerRegistroModel);
    }
}
