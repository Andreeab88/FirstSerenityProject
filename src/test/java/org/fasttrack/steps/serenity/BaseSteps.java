package org.fasttrack.steps.serenity;

import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.AccountPage;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.LoginPage;
import org.fasttrack.pages.SearchResultsPage;

public class BaseSteps extends ScenarioSteps {

    protected LoginPage loginPage;
    protected AccountPage accountPage;

    protected HomePage homePage;

    protected SearchResultsPage searchResultsPage;

}