package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.TopBar;

public class HomePage extends BasePage {

    @FindBy(id = "cookie_action_close_header")
    WebElement acceptCookieButton;

    TopBar topBar = new TopBar();

    public TopBar getTopBar() {
        return topBar;
    }

    public HomePage acceptCookie() {
        acceptCookieButton.click();
        return this;
    }
}