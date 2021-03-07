package driver;

import org.openqa.selenium.WebDriver;

public class DriverContainer {

    private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public synchronized static WebDriver getDriver() {
        return DRIVER_THREAD_LOCAL.get();
    }

    public synchronized static void setDriver(WebDriver driver) {
        DRIVER_THREAD_LOCAL.set(driver);
    }
}
