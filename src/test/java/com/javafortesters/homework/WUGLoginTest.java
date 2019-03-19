package com.javafortesters.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WUGLoginTest {

    public String url = "http://192.168.37.55";

    @Test
    public void successfulLogin() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebDriverWait waiter = new WebDriverWait(driver, 15);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']"));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.id("textfield-1020-inputEl"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"button-1022-btnEl\"]"));

        username.sendKeys("admin");
        password.sendKeys("admin");
        login.click();

        WebDriverWait loginWaiter = new WebDriverWait(driver, 15);
        loginWaiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='button-1074-btnInnerEl']")));
        driver.findElement(By.xpath("//span[@id='button-1074-btnInnerEl']"));

        WebElement userPref = driver.findElement(By.xpath("//span[@id='button-1074-btnInnerEl']"));

        Assert.assertEquals(userPref.getText(), "admin", "User is not logged in");

        driver.close();
    }

    @Test (dependsOnMethods={"successfulLogin"})
    public void failLogin(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebDriverWait waiter = new WebDriverWait(driver, 15);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']"));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.id("textfield-1020-inputEl"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"button-1022-btnEl\"]"));

        username.sendKeys("admin");
        password.sendKeys("password");
        login.click();

        WebDriverWait alertDialog = new WebDriverWait(driver, 2);
        alertDialog.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"messagebox-1001\"]")));
        driver.findElement(By.xpath("//*[@id=\"messagebox-1001\"]"));

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"messagebox-1001-msg\"]")).getText(), "The user name or password provided could be incorrect.", "Wrong Error text");

        driver.close();
    }

    @Test (dependsOnMethods={"failLogin"})
    public void loginWithoutUsername(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebDriverWait waiter = new WebDriverWait(driver, 15);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']"));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.id("textfield-1020-inputEl"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"button-1022-btnEl\"]"));

        username.sendKeys(Keys.NULL);
        password.sendKeys("password");
        login.click();

        WebDriverWait alertDialog = new WebDriverWait(driver, 2);
        alertDialog.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"messagebox-1001\"]")));
        driver.findElement(By.xpath("//*[@id=\"messagebox-1001\"]"));

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"messagebox-1001-msg\"]")).getText(), "Authentication failed.", "Wrong Error text");

        driver.close();
    }

    @Test (dependsOnMethods={"loginWithoutUsername"})
    public void loginWithoutPassword(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebDriverWait waiter = new WebDriverWait(driver, 15);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']"));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.id("textfield-1020-inputEl"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"button-1022-btnEl\"]"));

        username.sendKeys("admin");
        password.sendKeys(Keys.NULL);
        login.click();

        WebDriverWait alertDialog = new WebDriverWait(driver, 2);
        alertDialog.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"messagebox-1001\"]")));
        driver.findElement(By.xpath("//*[@id=\"messagebox-1001\"]"));

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"messagebox-1001-msg\"]")).getText(), "The user name or password provided could be incorrect.", "Wrong Error text");

        driver.close();
    }
}
