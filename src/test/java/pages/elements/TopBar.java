package pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.CaseStudiesPage;

public class TopBar extends BasePage {

    @FindBy(id = "menu-item-116")
    WebElement caseStudiesButton;

    public CaseStudiesPage openCaseStudies() {
        caseStudiesButton.click();
        return new CaseStudiesPage();
    }
}