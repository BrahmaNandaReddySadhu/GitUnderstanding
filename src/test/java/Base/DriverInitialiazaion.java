package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialiazaion {
    public static WebDriver driver;
    public static WebDriver driverInitialiazation(String browserName){
        switch (browserName){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
            default:
                driver = new EdgeDriver();
        }
        return driver;
    }
}
