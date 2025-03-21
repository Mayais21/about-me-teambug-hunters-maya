import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {
    private WebDriver driver;

    @Test
    public void start() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
 

        //1. open browser
        driver = new ChromeDriver();

        //2 INPUT SELENIUM DEMO URL
        driver.get("https://selenium-blog.herokuapp.com/");
        Thread.sleep(10000);
        //3 MAXIMISE PAGE
        driver.manage().window().maximize();
        //4 click on signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        //5 input username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Mayaisb");
        //6 input email on email field
        driver.findElement(By.id("user_email")).sendKeys("mayais2@gmail.com");
        //7 input password in password field
        driver.findElement(By.id("user_password")).sendKeys("passy21");
        //8 login
        driver.findElement(By.id("submit")).click();
        Thread.sleep(10000);
        //9 click on the user on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //10 search for an element and confirm if it is present
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/a")).click();
        // 11 log out
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
    }

    @AfterTest
    public void closeBrowser() {
        //QUIT THE BROWSER
        driver.quit();
    }
}


