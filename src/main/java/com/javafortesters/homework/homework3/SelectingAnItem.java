package com.javafortesters.homework.homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAnItem {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/gu/contact/");

        Select selDr = new Select(driver.findElements(By.name("security")).get(0));
        selDr.selectByVisibleText("Search");
      }
}
