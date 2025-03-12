package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

    private WebDriver driver;
    public MyDriver(String browser){

        if ("chrome".equals(browser)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
