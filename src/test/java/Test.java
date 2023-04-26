import Base.DriverInitialiazaion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    @org.testng.annotations.Test
    public void TestGoogle() throws InterruptedException {
        WebDriver driver = DriverInitialiazaion.driverInitialiazation("chrome");
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Brahmananda reddy", Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }

    @org.testng.annotations.Test
    public void testFaceBook() throws InterruptedException {
        WebDriver driver = DriverInitialiazaion.driverInitialiazation("chrome");
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Brahmananda reddy", Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
