package com.javafortesters.homework.homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LookingForSpecificWordInChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\List_of_jar\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("SoftServe");
        textBox.submit();
    }
}
