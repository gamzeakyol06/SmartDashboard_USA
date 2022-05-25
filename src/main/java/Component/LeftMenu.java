package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LeftMenu {
    WebDriver driver;
    public LeftMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> span_Value(){
    List<WebElement> spans = driver.findElements(By.tagName("span"));return spans;}
    By comboboxusa = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[7]");
    public WebElement ComboboxUSA() {return driver.findElement(comboboxusa);}
    By usa401 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[7]/ul/li[1]");
    public WebElement USA401() {return driver.findElement(usa401);}
}