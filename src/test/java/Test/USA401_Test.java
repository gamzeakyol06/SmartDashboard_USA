package Test;

import Base.Base;
import Component.LeftMenu;
import Component.USALines;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class USA401_Test extends Base {
    @BeforeSuite
    public void beforemethod(){
        super.beforemethod();
        super.loginmethod();
    }

    @Test(priority = 1)
    public void APL_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {
            leftmenu.ComboboxUSA().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.USA401()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(usalines.title().getText() + " Daily");
            Thread.sleep(2000);
            actions.moveToElement(usalines.TabAPL()).click().build().perform();

            System.out.println(usalines.TabAPL().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 2)
    public void ASL_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {

            System.out.println(usalines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabASL()).click().build().perform();

            System.out.println(usalines.TabASL().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 3)
    public void IML_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {

            System.out.println(usalines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabIML()).click().build().perform();

            System.out.println(usalines.TabIML().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 4)
    public void COL_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {

            System.out.println(usalines.title().getText() + " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabCOL()).click().build().perform();

            System.out.println(usalines.TabCOL().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production " + totalproduction + "\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            } else {
                System.out.println("Production is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("fail");
        }
    }

    @Test (priority = 5)
    public void APL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(usalines.title().getText() + " Weekly");
            Thread.sleep(2000);
            usalines.PeriodFilter().click();
            Thread.sleep(2000);
            usalines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabAPL()).click().build().perform();

            System.out.println(usalines.TabAPL().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 6)
    public void ASL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(usalines.title().getText() + " Weekly");
            Thread.sleep(2000);
            usalines.PeriodFilter().click();
            Thread.sleep(2000);
            usalines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabASL()).click().build().perform();

            System.out.println(usalines.TabASL().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 7)
    public void IML_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(usalines.title().getText() + " Weekly");
            Thread.sleep(2000);
            usalines.PeriodFilter().click();
            Thread.sleep(2000);
            usalines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabIML()).click().build().perform();

            System.out.println(usalines.TabIML().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 8)
    public void COL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        USALines usalines = new USALines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(usalines.title().getText() + " Weekly");
            Thread.sleep(2000);
            usalines.PeriodFilter().click();
            Thread.sleep(2000);
            usalines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(usalines.TabCOL()).click().build().perform();

            System.out.println(usalines.TabCOL().getText());
            System.out.println("OEE " + usalines.ValueOEE().getText());
            System.out.println("Availability " + usalines.ValueAvailability().getText());
            System.out.println("Performance " + usalines.ValuePerformance().getText());
            System.out.println("Quality " + usalines.ValueQuality().getText());

            System.out.println("Total Production " + usalines.TotalProduction().getText());
            System.out.println("Defect " + usalines.Defect().getText());
            System.out.println("PPM " + usalines.PPM().getText());
            System.out.println("Breakdowns " + usalines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(usalines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }

    @AfterTest
    public void aftertest(){
        super.aftermethod();
    }
}
