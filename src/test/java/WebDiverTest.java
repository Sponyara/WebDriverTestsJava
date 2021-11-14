import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDiverTest {
    @Test
    public void main() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://nominex.io/ru");
        Thread.sleep(2000);
        WebElement searchInput = driver.findElement(By.cssSelector(".space-x-16 > sl-button:nth-child(1)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("sl-form.mt-20 > sl-input:nth-child(2)"));
        searchInput.click();
        searchInput.sendKeys("viteksilin@mail.ru");
        Thread.sleep(1500);
        searchInput = driver.findElement(By.cssSelector("#current-password"));
        searchInput.click();
        searchInput.sendKeys("Qw321645");
        Thread.sleep(1500);
        searchInput = driver.findElement(By.cssSelector("sl-button.w-full:nth-child(4)"));
        searchInput.click();
        Thread.sleep(4000);
        searchInput = driver.findElement(By.cssSelector("ul.flex > li:nth-child(2)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#tab-5"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#tab-panel-5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(3) > tr:nth-child(9) > td:nth-child(2)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("#tab-12"));
        searchInput.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
