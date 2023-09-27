package d_26_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.Scanner;

public class Zadatak1 {
//    Napisati program koji:
//    Ucitava stranicu https://demoqa.com/automation-practice-form
//    Popunjava formu sta stranice. Korisnik unosi podatke sa tastature za popunu forme.
//    (za vezbanje) Probajte da unese i datum. Sa datumom se radi isto kao i sa obicnim inputom sa sendKeys.
//    Klik na submit
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     driver.get(" https://demoqa.com/automation-practice-form");
     Thread.sleep(1000);

        Scanner s = new Scanner(System.in);
        System.out.println("First Name: ");
        driver.findElement(By.id("firstName")).sendKeys(s.next());
        System.out.println( "Last Name: ");
        driver.findElement(By.id("lastName")).sendKeys(s.next());
        System.out.println( "Email: ");
        driver.findElement(By.id("userEmail")).sendKeys(s.next());
        System.out.println( "Gender (Male/Female/Other): ");
        String gender = s.next();
        driver.findElement(By.xpath("//label[text()='" + gender + "']" )).click();
        System.out.println("Mobile phone: ");
        driver.findElement(By.id("userNumber")).sendKeys(s.next());
        System.out.println("Date Of Birth: ");
        String dateBirth = s.next();
        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();
        System.out.println("Subject: ");
        driver.findElement(By.id("subjectsInput")).sendKeys(s.next());
        System.out.println("Hobbies (Sports/Music/Reading): ");
        String hobby = s.next();
        driver.findElement(By.xpath("//label[text()= '" + hobby + "']")).click();
        System.out.println("Current Address: ");
        driver.findElement(By.id("currentAddress")).sendKeys(s.next());

        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);


        driver.quit();

    }
}

