package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeTextElement;

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }
}
