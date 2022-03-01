package StepDefinitions;

import POM.DialogContentElements;
import POM.ToolbarElements;
import io.cucumber.java.en.Then;

public class FeesSteps {

    ToolbarElements toolbarElements;
    DialogContentElements dialogContentElements;

    @Then("User create Fee {string} and {string} and {string} and {string}")
    public void user_create_fee_and_and_and(String name, String code, String intCode, String priority) {
        toolbarElements = new ToolbarElements();
        dialogContentElements = new DialogContentElements();
        toolbarElements.navigateToFeesPage();
        dialogContentElements.createFee(name, code, intCode, priority);
    }

}
