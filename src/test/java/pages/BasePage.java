package pages;

import driver.DriverContainer;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverContainer.getDriver(), this);
    }
}