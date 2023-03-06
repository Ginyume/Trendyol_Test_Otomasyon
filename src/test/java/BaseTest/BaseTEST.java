package BaseTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class BaseTEST {
    public static WebDriver webdriver;
    public static Actions action;

    @BeforeAll
    public static void Startup()
    {
        ChromeOptions options=new ChromeOptions();
       // options.addArguments("headless");
        options.addArguments("disable-popup-blocking");
        options.addArguments("start-maximized");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webdriver=new ChromeDriver(options);
        action= new Actions(webdriver);
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterAll
    public static void Quit()
    {
        webdriver.close();
        webdriver.quit();
    }
    @Test
    public void Denem()
    {
        webdriver.get("https://www.trendyol.com/");
    }
}
