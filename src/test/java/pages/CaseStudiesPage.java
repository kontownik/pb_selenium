package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseStudiesPage extends BasePage {

    @FindBy(xpath = "//a[@class='post-title' and @href='https://ttpsc.com/pl/casestudy/fca/']")
    WebElement fcaLink;

    public SingleCaseStudyPage openFCA() {
        fcaLink.click();
        return new SingleCaseStudyPage();
    }

}