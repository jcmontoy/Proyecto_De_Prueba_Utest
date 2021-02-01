package co.com.utest.reto.task;

import co.com.utest.reto.exceptions.StartException;
import co.com.utest.reto.userinterface.RegistroPage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matcher;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AbrirBrowser implements Task {

    private RegistroPage registroPage;

    @Override
    @Step("Open the browser")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(registroPage));
        actor.should(seeThat(the(RegistroPage.LINK_JOIN_TODAY, isVisible()).or(ComplaintWith(StartException.class, StartException.MESSAGE_PAGE_NOT_LOAD))));
    }

    private void the(Target linkJoinToday, Matcher<WebElementState> visible) {
    }

}
