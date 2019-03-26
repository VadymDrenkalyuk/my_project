package com.javafortesters.homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WUGLoginTest {
    public String url = "http://192.168.37.55";
    public WebDriver driver;
    public WebElement username;
    public WebElement password;
    public WebElement login;
    public String user;
    public String pass;
    public String userMenuXpath = "//span[text()='%s']/ancestor::a";
    public String logOutMenuItemXpath = "//span[text()='Log Out']/parent::a";


    public void loginToWUG(String user, String pass) {
        this.user = user;
        this.pass = pass;
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
    }

    public void loginToWUG(Keys user, String pass){
        this.user = user.toString();
        this.pass = pass;
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
    }

    public void loginToWUG(String user, Keys pass){
        this.user = user;
        this.pass = password.toString();
        username.sendKeys(user);
        password.sendKeys(pass);
        login.click();
    }

    public void waiterForLoginPage(){
        WebDriverWait waiter = new WebDriverWait(driver, 25);
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']"));
    }

    public void waiterForWugIsOpened(){
        WebDriverWait loginWaiter = new WebDriverWait(driver, 15);
        loginWaiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(userMenuXpath, "admin"))));
        driver.findElement(By.xpath(String.format(userMenuXpath, "admin")));
    }

    public void waiterForAlertDialog(){
        WebDriverWait alertDialog = new WebDriverWait(driver, 2);
        alertDialog.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div [@role='alertdialog']/descendant::div[starts-with(@id, 'message') and contains(@id, 'msg')]")));
        driver.findElement(By.xpath("//div [@role='alertdialog']/descendant::div[starts-with(@id, 'message') and contains(@id, 'msg')]"));
    }

    @BeforeMethod
    public void openWUGAndCreateElements() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);

        waiterForLoginPage();

        username = driver.findElement(By.xpath("//input[@name='username']"));
        password = driver.findElement(By.xpath("//input[@name='password']"));
        login = driver.findElement(By.xpath("//*[contains(text(), 'Log In')]"));
    }

    @AfterMethod
    public void logOutFromWUG() {
        try {
            driver.findElement(By.xpath(String.format(userMenuXpath, "admin"))).click();
            driver.findElement(By.xpath(logOutMenuItemXpath)).click();
            driver.close();
        } catch (NoSuchElementException e) {
            driver.close();
        }
    }


    @Test
    public void successfulLogin() {
        loginToWUG("admin", "admin");

        waiterForWugIsOpened();

        WebElement userPref = driver.findElement(By.xpath(String.format(userMenuXpath, "admin")));

        Assert.assertEquals(userPref.getText(), "admin", "User is not logged in");
    }

    @Test
    public void failLogin() {
        loginToWUG("admin", "password");

        waiterForAlertDialog();

        Assert.assertEquals(driver.findElement(By.xpath("//div [@role='alertdialog']/descendant::div[starts-with(@id, 'message') and contains(@id, 'msg')]")).getText(), "The user name or password provided could be incorrect.", "Wrong Error text");
    }

    @Test
    public void loginWithoutUsername() {
        loginToWUG(Keys.NULL, "admin");

        waiterForAlertDialog();

        Assert.assertEquals(driver.findElement(By.xpath("//div [@role='alertdialog']/descendant::div[starts-with(@id, 'message') and contains(@id, 'msg')]")).getText(), "Authentication failed.", "Wrong Error text");
    }

    @Test
    public void loginWithoutPassword() {
        loginToWUG("admin", Keys.NULL);

        waiterForAlertDialog();

        Assert.assertEquals(driver.findElement(By.xpath("//div [@role='alertdialog']/descendant::div[starts-with(@id, 'message') and contains(@id, 'msg')]")).getText(), "The user name or password provided could be incorrect.", "Wrong Error text");
    }
}

