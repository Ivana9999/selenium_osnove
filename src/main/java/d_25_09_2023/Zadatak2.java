package d_25_09_2023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Zadatak2 {
//    Niz todo-a (niz stringova) koje treba da uneti. Niz je:
//    Visit Paris
//    Visit Prague
//    Visit London
//    Visit New York
//    Visit Belgrade
//    Maksimizirati prozor
//    Ucitati stranicu https://example.cypress.io/todo
//    Program petljom prolazi kroz niz todo-a i svaki unosi na stranicu
//    Nakon svakog unosa todo-a, unosi se enter. Koristan link
//    Nakon svih unosa proci petljom kroz svaki todo koji je na stranici i za svaki cekirati da je completed.
//    Cekanje od 5s
//    Zatvorite pretrazivac
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://example.cypress.io/todo");
        Thread.sleep(2000);

        ArrayList<String> toDo = new ArrayList<>();
        toDo.add("Visit Paris");
        toDo.add("Visit Prague");
        toDo.add("Visit London");
        toDo.add("Visit New York");
        toDo.add("Visit Belgrade");

        for (int i =0; i < toDo.size(); i++) {
            WebElement toBeDone = driver.findElement(By.className("new-todo"));
            toBeDone.clear();
            toBeDone.sendKeys(toDo.get(i));
           toBeDone.sendKeys(Keys.ENTER);
           Thread.sleep(1000);

        }
        List<WebElement> whatToDo = driver.findElements(By.cssSelector(".todo-list input[type='checkbox']"));
        for (int i = 0; i <whatToDo.size(); i++) {
            whatToDo.get(i).click();

            Thread.sleep(5000);

        }

driver.quit();
    }
}
