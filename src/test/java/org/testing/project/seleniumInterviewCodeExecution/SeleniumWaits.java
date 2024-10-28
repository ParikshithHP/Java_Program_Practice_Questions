package org.testing.project.seleniumInterviewCodeExecution;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

public class SeleniumWaits {
    public static void main(String[] args){

        //implicit wait

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Explicit wait

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));

        //isselected uses boolean ot webelement
        Boolean radioButton = wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='radio']")));

        //Fluentwait

        FluentWait<WebDriver> fwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement ele = fwait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                WebElement btn = driver.findElement(By.xpath("//button"));
                return null;
            }
        });


    }
}
