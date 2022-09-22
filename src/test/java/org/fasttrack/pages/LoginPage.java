package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.fasttrack.steps.serenity.BaseSteps;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/login/")
public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css = ".error-msg span")
   private WebElementFacade getErrorMessageElement;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass) {
        typeInto(passField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public String getErrorMessage(){
       return   getErrorMessageElement.getText();
    }

}
