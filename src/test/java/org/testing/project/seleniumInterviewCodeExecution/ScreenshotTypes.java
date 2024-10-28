package org.testing.project.seleniumInterviewCodeExecution;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import static java.sql.DriverManager.getDriver;

public class ScreenshotTypes {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        //1
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot,new File("c://folder/screenshot.jpg"));

        //2 Using javascript executor
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] sc = ts.getScreenshotAs(OutputType.BYTES);

        //3 Scroll and click using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", elementtxt);
//        js.executeScript("arguments[0].click();", elementtxt);



        driver.quit();
    }
}
