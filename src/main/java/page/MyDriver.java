package page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

class MyDriver {
    static WebDriver webDriver = null;

    public MyDriver() {

    }

    public static synchronized WebDriver init() {
        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--ignore-certificate-errors");
            options.setExperimentalOption("w3c", false);
//            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            webDriver = new ChromeDriver(options);
        }
        return webDriver;
    }
}
