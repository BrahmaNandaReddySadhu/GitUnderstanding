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
                break;
            case "edge":
                driver= new EdgeDriver();
                break;
            default:
                System.out.println("supported browsers are chrome,firefox,edge");
        }
        return driver;
    }
}
