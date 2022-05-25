package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    By smartdashboard = By.xpath("//span[contains(text(),'SMART DASHBOARD')]");
    public WebElement SmartDashboard() {return driver.findElement(smartdashboard);}
    By username = By.xpath("//input[@id='UserName']");
    public WebElement Username() {return driver.findElement(username);}
    By password = By.xpath("//input[@id='Password']");
    public WebElement Password() {return driver.findElement(password);}
    By loginbttn = By.xpath("//button[contains(text(),'Log in')]");
    public WebElement LoginButton() {return driver.findElement(loginbttn);}
}
