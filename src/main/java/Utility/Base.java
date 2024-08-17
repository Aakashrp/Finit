package Utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base{

    public static WebDriver driver;
    public static String baseUrl;

    public static WebDriver initializeDriver() throws IOException {
        if (driver == null) {
            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("E:\\My Projects\\All Projects\\Finti_UI_TestAutomation\\src\\main\\resources\\URL.properties");
            properties.load(fis);

            baseUrl = properties.getProperty("baseUrl");

            WebDriverManager.chromedriver().driverVersion("127.0.6533.120").setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));

            // Open the base URL
            driver.get(baseUrl);
        }
        return driver;
    }

    // Close the WebDriver
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Set driver to null to indicate it has been closed
        }
    }

    // Accessor for the WebDriver instance
    public static WebDriver getDriver() {
        return driver;
    }
}
