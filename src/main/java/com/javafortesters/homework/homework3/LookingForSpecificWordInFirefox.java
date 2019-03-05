package com.javafortesters.homework.homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LookingForSpecificWordInFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\List_of_jar\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Hey!");
        textBox.submit();
    }
}
