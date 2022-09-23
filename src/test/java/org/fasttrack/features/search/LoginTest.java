package org.fasttrack.features.search;

import org.junit.Test;

import static org.fasttrack.utils.Constants.*;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(USER_EMAIL);
        loginSteps.setPassword(USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(USER_NAME);
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(USER_EMAIL);
        loginSteps.setPassword("12345a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}