package p_26_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak5 {
//    Napisati program koji ucitava stranicuhttps://demoqa.com/automation-practice-form
//    Na kraju programa proverite da li je element cekiran. Izguglajte kako mozemo da proverimo da li je element cekiran.
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form ");


        WebElement checkbox = driver.findElement((By.xpath("//label[text()='Sports']")));
        checkbox.click();
        Thread.sleep(1000);
        boolean isSelected = checkbox.isSelected();

        if (isSelected) {
            System.out.println("Checkbox is selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }
        Thread.sleep(1000);
      driver.quit();
    }
}
