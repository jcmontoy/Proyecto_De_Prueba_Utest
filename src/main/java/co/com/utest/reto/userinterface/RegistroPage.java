package co.com.utest.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegistroPage extends PageObject {

    public static final Target LINK_JOIN_TODAY = Target.the("Link Join Today").located(By.linkText("Join Today"));
    public static final Target FIRST_NAME = Target.the("First Name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last Name").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("Email Address").located(By.id("email"));
    public static final Target MONTH = Target.the("Month").located(By.id("birthMonth"));
//    public static final Target DAY = Target.the("Day").located(By.("birthDay"));
    public static final Target YEAR = Target.the("Email Address").located(By.id("birthYear"));
    public static final Target LANGUAGES_SPOKEN = Target.the("Email Address").located(By.className("ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty"));
    public static final Target NEXT_lOCATION_BUTTON = Target.the("Next Button").located(By.linkText("Next: Location"));
}
