package org.testing.project.seleniumInterviewCodeExecution;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.Set;
public class GoogleSearchAndEnter {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().wait();

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));

        Actions action = new Actions(driver);

        action.click(searchBox).build().perform();
        Thread.sleep(2000);
        action.sendKeys(searchBox, "Automation Testing", Keys.ENTER).build().perform();
        Thread.sleep(3000);


        driver.quit();
    }
}
