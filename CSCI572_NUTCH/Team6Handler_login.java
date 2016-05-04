package org.apache.nutch.protocol.interactiveselenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class Team6Handler_login implements InteractiveSeleniumHandler {

	public void processDriver(WebDriver driver) 
	{
     
        //Handler for Login
        System.out.println(driver.getCurrentUrl());
        
        System.out.println("handler called team 6");
        
        if(driver.getCurrentUrl().equals("http://www.academy.com/"))
        {
            System.out.println("team 6- http://www.academy.com");
            
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            
            driver.findElement(By.id("level-six")).click();
            
            WebElement emailButton= driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1"));
            emailButton.clear();
            emailButton.sendKeys("shrutimundra.20@gmail.com");
            
            WebElement passButton= driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1"));
            passButton.clear();
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.arguntrader.com/"))
        {
            WebElement emailButton= driver.findElement(By.id("username"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir4");
            
            WebElement passButton= driver.findElement(By.id("password"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.armslist.com/"))
        {
            WebElement loginButton= driver.findElement(By.linkText("Login"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.id("email"));
            
            emailButton.clear();
            
            emailButton.sendKeys("shrutimundra.20@gmail.com");
            
            WebElement passButton= driver.findElement(By.id("password"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.buyusedguns.net/"))
        {
            WebElement loginButton= driver.findElement(By.linkText("Login"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.name("username"));
            
            emailButton.clear();
            
            emailButton.sendKeys("irteam6");
            
            WebElement passButton= driver.findElement(By.name("password"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.cheaperthandirt.com/"))
        {
            
            WebElement loginButton= driver.findElement(By.linkText("Sign In"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.id("ctl00_ContentPlaceHolderTopLevel_txtEmail"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir@gmail.com");
            
            WebElement passButton= driver.findElement(By.id("ctl00_ContentPlaceHolderTopLevel_txtPassword"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.freeclassifieds.com/"))
        {
            
            WebElement loginButton= driver.findElement(By.id("Button1"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.id("phMain_txtEmail"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir@gmail.com");
            
            WebElement passButton= driver.findElement(By.id("phMain_txtPassword"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://freegunclassifieds.com/"))
        {
            
            
            WebElement loginButton= driver.findElement(By.id("login_open"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.id("email"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir@gmail.com");
            
            WebElement passButton= driver.findElement(By.id("password"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.gandermountain.com/"))
        {
            
            
            WebElement loginButton= driver.findElement(By.xpath("//*[@class = 'top-level']"));
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.id("header-login-email"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir@gmail.com");
            
            WebElement passButton= driver.findElement(By.name("password"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
        }
        else if(driver.getCurrentUrl().equals("http://www.gunauction.com/"))
        {
            
            //gunauction.com
            
            WebElement loginButton= driver.findElement(By.className("login-window"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.name("EMail"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir@gmail.com");
            
            WebElement passButton= driver.findElement(By.name("Password1"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
            
        }
        else if(driver.getCurrentUrl().equals("http://www.gunlistings.org/"))
        {
            
            //gunlistings.org
            
            WebElement loginButton= driver.findElement(By.linkText("Login"));
            
            loginButton.click();
            
            WebElement emailButton= driver.findElement(By.name("email_login"));
            
            emailButton.clear();
            
            emailButton.sendKeys("team6ir@gmail.com");
            
            WebElement passButton= driver.findElement(By.name("password"));
            
            passButton.clear();
            
            passButton.sendKeys("sgpsteam6\n");
            
            
        }
    }
    

    public boolean shouldProcessURL(String URL) {
        return true;
    }

}
