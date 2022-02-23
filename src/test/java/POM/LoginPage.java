package POM;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePOM {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    

}
