package com.javafortesters.homework.homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");

        WebElement source = driver.switchTo().frame(0).findElement(By.xpath("//*[@id=\"draggable\"]"));
        driver.switchTo().defaultContent();
        WebElement target = driver.switchTo().frame(0).findElement(By.xpath("/html/body"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(source, target).perform();
    }
}
