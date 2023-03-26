package PagesMethods;

import BaseTest.BaseTEST;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Methods extends BaseTEST {
    public void Navigate(String URL)
    {
        webdriver.get(URL);
    }

    public void ClickElementByID(String ID)
    {
        webdriver.findElement(By.id(ID)).click();
    }
    public void ClickElementByXpath(String Xpath)
    {
        webdriver.findElement(By.xpath(Xpath)).click();
    }
    public void SendKeysElementsByID(String ID,String key)
    {
        webdriver.findElement(By.id(ID)).sendKeys(key);
    }
    public void SendKeysElementsByXpath(String Xpath,String Key)
    {
        webdriver.findElement(By.xpath(Xpath)).sendKeys(Key);
    }
    public void ClickElementByXpathWithActions(String Xpath)
    {
        action.moveToElement(webdriver.findElement(By.xpath(Xpath))).click().perform();
    }
   public void driverSwitchNewTab(int tabNumber)
   {
       ArrayList<String> newTb = new ArrayList<String>(webdriver.getWindowHandles());
       webdriver.switchTo().window(newTb.get(tabNumber));
   }
}
