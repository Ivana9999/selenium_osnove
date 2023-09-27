package d_26_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak2 {
    //    Napisati program koji:
//    Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//    Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika
//    element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI PETLJOM)
//    POMOC: Brisite elemente odozdo.
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://s.bootsnipp.com/iframe/Dq2X");
        Thread.sleep(1000);

        List<WebElement> element = driver.findElements(By.cssSelector(".col-md-12>div"));
        for (int i = element.size() - 1; i > 0; i--) {
            int prethodni = element.size();
            System.out.println(prethodni);
            element = driver.findElements(By.cssSelector(".alert>button"));

            if (prethodni - element.size() == 1) {
                System.out.println("Element je obrisan");
            } else {
                System.out.println("Element nije obrisan");


            }
        }
    }
}
