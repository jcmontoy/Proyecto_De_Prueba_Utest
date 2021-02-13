package co.com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalPage extends PageObject {

    public static final Target LINK_JOIN_TODAY = Target.the("Link Join Today").located(By.linkText("Join Today"));

}
