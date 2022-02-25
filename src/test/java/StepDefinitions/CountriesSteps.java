package StepDefinitions;

import POM.ToolbarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {

    ToolbarElements toolbarElements;

    @And("User create Country")
    public void user_create_country() {
        toolbarElements = new ToolbarElements();
        toolbarElements.navigateToCountriesPage();

    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {

    }

}
