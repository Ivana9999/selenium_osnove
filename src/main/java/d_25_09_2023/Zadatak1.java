package d_25_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
//    Maksimizirati prozor
//    Ucitati stranicu https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//    Prijavite se na sistem
//    Username: Admin
//    Password: admin123
//    Cekanje od 5s
//    U input za pretragu iz navigacije unesite tekst Me
//    Kliknite na prvi rezultat pretrage (to ce biti Time)
//    Cekanje od 1s
//    Kliknite u headeru na svog avatara (to ce biti na ime: Paul Collings)
//    Klinkite na logout
//    Cekanje od 5s
//    Zatvorite pretrazivac
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

       WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
       username.clear();
       username.sendKeys("Admin");


       WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
       password.clear();
       password.sendKeys("admin123");


        WebElement login = driver.findElement(By.xpath("//button['submit']"));
        login.click();
       Thread.sleep(5000);


        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search.sendKeys("Me");
        WebElement time = driver.findElement(By.cssSelector("ul.oxd-main-menu>li:nth-child(1)"));
        time.click();
        Thread.sleep(1000);

        WebElement avatar = driver.findElement(By.className("oxd-userdropdown-name"));
        avatar.click();

        WebElement logout = driver.findElement(By.cssSelector("ul.oxd-dropdown-menu>li:last-child"));
         logout.click();
         Thread.sleep(5000);

         driver.quit();


    }
}
