import io.qameta.allure.testng.AllureTestNg;
import org.example.pages.MainPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners({AllureTestNg.class})
public class Zoo {

    private WebDriver driver;
    private MainPages mainPages;
    private WebDriverWait wait;

    @BeforeTest
    void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://zoolandia.com.ua/ua/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        mainPages = new MainPages(driver);
    }
    @Test
    public void zooTest(){

        mainPages.login();

        mainPages.form();

        mainPages.button();

    }

}
