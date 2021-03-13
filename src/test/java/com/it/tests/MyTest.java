package com.it.tests;

import com.it.common.Constants;
import com.it.pages.BasePage;
import com.it.pages.DashboardPage;
import com.it.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.it.common.Constants.BASE_URL;

//using Selenium and PageFactory

public class MyTest extends BasePage{
    @Test
    public void test() throws InterruptedException {
        LoginPage loinPage = new LoginPage();
        loinPage.login("ittest2", "337774a");
        DashboardPage dashboardPage = new DashboardPage();
        Thread.sleep(2000);
        Assert.assertEquals(dashboardPage.getMailUser(),"ittest2@i.ua");
        //driver.quit();
    }
}
