package org.fasttrack.features.search;

import org.junit.Test;

import static org.fasttrack.utils.Constants.*;


public class CartTest extends BaseTest {

        @Test
        public void loginAndAddToCartTest(){
            loginSteps.doLogin(USER_EMAIL,USER_PASS);
            searchSteps.navigateToProductName(productName);
            cartSteps.addProductToCart();
        }
    }

