package org.fasttrack.features.search;

import org.junit.Test;

import static org.fasttrack.utils.Constants.*;

public class CheckoutTest extends BaseTest{
    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(USER_EMAIL,USER_PASS);
        searchSteps.navigateToProductName(productName);
        cartSteps.addProductToCart();
//        checkoutSteps.
    }
}
