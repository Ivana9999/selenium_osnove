package p_26_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak2 {
//    Napisti program koji:
//    Ucitava stranicu https://s.bootsnipp.com/iframe/z80en
//    Hvata sve elemente prve kolone i stampa tekst svakog elementa. Kako da od nekog elementa procitamo tekst imate na sledecem linku
//    Ceka 1s
//    Hvata sve elemente prvog reda i stampa tekst svakog elementa
//    Ceka 5s
//    Zatvara pretrazivac
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://s.bootsnipp.com/iframe/z80en");



         List<WebElement> prvaKolona = driver.findElements(By.cssSelector("#lorem > table > tbody > td:nth-child(1) > td:nth-child(1)"));

         for (int i = 0; i < prvaKolona.size(); i++) {
             prvaKolona.get(i).getText();
             Thread.sleep(1000);
         }

          List<WebElement> tabela = driver.findElements(By.cssSelector("#lorem > table > tbody > td:nth-child(1) > tr:nth-child(1) td"));
        for (int i = 0; i < tabela.size(); i++) {
            prvaKolona.get(i).getText();
            Thread.sleep(5000);
        }
      driver.quit();
    }
}
