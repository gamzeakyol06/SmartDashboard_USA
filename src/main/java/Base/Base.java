package Base;

import Component.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public final static String MAIN_PAGE_URL = "https://sf.eldor.com.tr/Dashboard/";

    public void beforemethod(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver(ops);
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get (MAIN_PAGE_URL);

    }
    public void loginmethod(){
        LoginPage login = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOfAllElements(login.Username()));
        login.Username().sendKeys("niso"+"\\"+"akyolg");
        wait.until(ExpectedConditions.visibilityOfAllElements(login.Password()));
        login.Password().sendKeys("Niso.2022!");
        wait.until(ExpectedConditions.visibilityOfAllElements(login.LoginButton()));
        login.LoginButton().click();
    }
    public void aftermethod(){
        driver.quit();
    }
}
