package p_26_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Zadatak4 {
//    Zadatak (dok ne stignemo do ovog zadatka izguglajte kako da selektujete vrednost u select elementu)
//    Napisati program koji ucitava stranicu https://www.ebay.com/ i bira kategoriju “Crafts”
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement element = driver.findElement(By.cssSelector("#gh-cat"));
        Select select = new Select(element);
        select.selectByVisibleText("Crafts");
        Thread.sleep(1000);

        driver.quit();
    }
}
