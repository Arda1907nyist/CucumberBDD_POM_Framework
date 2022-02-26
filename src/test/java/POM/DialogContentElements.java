package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM{

    public DialogContentElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement nameSearchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitDeleteButton;

    @FindBy(xpath = "//td[text()='2']")
    private WebElement secondDataInList;

    public void createCountry() {
        addButton.click();
        nameInput.sendKeys("HalitCountry123");
        codeInput.sendKeys("456789");
        saveButton.click();
    }

    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
    }

    public void editCountry() throws InterruptedException {
        nameSearchInput.sendKeys("HalitCountry123");
        waitUntilElementVisibleAndClickableThenClick(searchButton);
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(editButton);
        nameInput.clear();
        nameInput.sendKeys("UpdatedHalitCountry123");
        saveButton.click();
    }

    public void deleteCountry() throws InterruptedException {
        nameSearchInput.sendKeys("UpdatedHalitCountry123");
        waitUntilElementVisibleAndClickableThenClick(searchButton);
        Thread.sleep(700);
        waitUntilElementVisibleAndClickableThenClick(deleteButton);
        waitUntilElementVisibleAndClickableThenClick(submitDeleteButton);
    }

}
