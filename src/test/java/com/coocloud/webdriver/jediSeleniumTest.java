package com.coocloud.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by coocloud on 11/12/2015.
 */
public class jediSeleniumTest {

    @Test
    public void firstRandomTest(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.allkpop.com");
        Assert.assertTrue("The title should contain allkpop", driver.getTitle().contains("allkpop"));
        driver.close();
        driver.quit();
    }

    @Test
    public void secondRandomTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.org");
        WebElement downloadTab = driver.findElement(By.id("menu_download"));
        WebElement downloadLink = downloadTab.findElement(By.tagName("a"));
        downloadLink.click();
        Assert.assertTrue("The title should contain Downloads", driver.getTitle().contains("Downloads"));
        //Assert.assertEquals("Downloads", driver.getTitle());
        driver.close();
        driver.quit();
    }
}
