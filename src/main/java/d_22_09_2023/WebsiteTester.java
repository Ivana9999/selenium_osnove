package d_22_09_2023;
gti
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WebsiteTester {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ArrayList<String> urls = new ArrayList<>();
        urls.add("https://www.google.com/");
        urls.add("https://www.facebook.com/");
        urls.add("https://www.youtube.com/");
        urls.add("https://www.ebay.com/");
        urls.add("https://www.katalon.com/");

for (String url : urls) {
    driver.get(url);

    Thread.sleep(1000);
}
driver.quit();

    }
}