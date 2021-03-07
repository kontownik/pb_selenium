package runner;

import driver.DriverContainer;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SingleCaseStudyPage;
import utils.ConfigProperties;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

public class TestRunner {

    ConfigProperties config = new ConfigProperties();
    Logger logger = Logger.getLogger("Logger");

    @BeforeSuite
    void beforeSuite() {
        WebDriver driver = DriverFactory.create();
        DriverContainer.setDriver(driver);
    }

    @AfterSuite
    void afterSuite() {
        DriverContainer.getDriver().quit();
    }

    @Test
    void exampleTest() {
        SingleCaseStudyPage fcaPage;
        DriverContainer.getDriver().get(config.getValue("base_url"));
        fcaPage = new HomePage().acceptCookie().getTopBar().openCaseStudies().openFCA();
        String companyName = fcaPage.getCompanyName();
        String trade = fcaPage.getTrade();
        String usedProduct = fcaPage.getUsedProduct();
        assertEquals(companyName, "Fiat Chrysler Automobiles");
        assertEquals(trade, "Przemysł samochodowy");
        assertEquals(usedProduct, "IoT & AR");
        logger.info(String.format("Company name: '%s', Trade: '%s', Used Product:'%s'", companyName, trade, usedProduct));
    }
}