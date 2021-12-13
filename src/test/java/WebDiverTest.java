import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDiverTest {
    @Test
    public void main() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("https://nominex.io/ru");
        WebElement searchInput = driver.findElement(By.cssSelector(".space-x-16 > sl-button:nth-child(1)"));
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("sl-form.mt-20 > sl-input:nth-child(2)"));
        searchInput.click();
        searchInput.sendKeys("viteksilin@mail.ru");
        searchInput = driver.findElement(By.cssSelector("#current-password"));
        searchInput.click();
        searchInput.sendKeys("Qw321645");
        searchInput = driver.findElement(By.cssSelector("sl-button.w-full:nth-child(4)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("ul.flex > li:nth-child(2)"));
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("div.overflow-hidden:nth-child(2) > div:nth-child(1) > sl-dropdown:nth-child(3) > sl-button:nth-child(1)"));
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("div.overflow-hidden:nth-child(2) > div:nth-child(1) > sl-dropdown:nth-child(3) > sl-menu:nth-child(2) > sl-menu-item:nth-child(1)"));
        searchInput.click();
        Thread.sleep(2000);
        searchInput = driver.findElement(By.cssSelector("tr.ve-table-body-tr:nth-child(8) > td:nth-child(2)"));
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#tab-6"));
        searchInput.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
