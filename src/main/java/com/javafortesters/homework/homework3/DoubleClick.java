package com.javafortesters.homework.homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://api.jquery.com/dblclick/");

        WebElement element = driver.switchTo().frame(0).findElement(By.xpath("/html/body/div"));
        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
    }
}
