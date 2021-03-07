package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleCaseStudyPage extends BasePage {

    @FindBy(xpath = "//div[@class='box logo']//span[@class='article-trade']")
    WebElement logoBoxElement;

    @FindBy(xpath = "//div[@class='box trade']//span[@class='article-trade']")
    WebElement tradeBoxElement;

    @FindBy(xpath = "//div[@class='box used-product']//span[@class='article-used-products']")
    WebElement usedProductBoxElement;

    public String getCompanyName() {
        return logoBoxElement.getText();
    }

    public String getTrade() {
        return tradeBoxElement.getText();
    }

    public String getUsedProduct() {
        return usedProductBoxElement.getText();
    }

}