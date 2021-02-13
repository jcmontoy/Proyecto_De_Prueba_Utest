package co.com.utest.reto.task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.utest.reto.exceptions.StartException;
import co.com.utest.reto.userinterface.PrincipalPage;
import co.com.utest.reto.userinterface.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class AbrirBrowser implements Task {

    private RegistroPage registroPage;

    @Override
    @Step("Open the browser")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(registroPage));
        actor.should(seeThat(the(PrincipalPage.LINK_JOIN_TODAY), isVisible()).orComplainWith(StartException.class, StartException.MESSAGE_PAGE_NOT_LOAD));
    }
}
