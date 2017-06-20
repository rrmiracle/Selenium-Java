package com.seleniumtest;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by rongrong on 2017/6/20.
 */
public class Glxss_Live {
    public static void main(String[] args) {
        //到指定安装目录下
        System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver\\chromedriver.exe");
        ChromeOptions o = new ChromeOptions();
        o.addArguments("disable-extensions");
        o.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(o);
        driver.manage().window().maximize();
        driver.get("http://10.33.48.190:8080");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[2]/div[2]/span[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.findElement(By.id("player_id3")).click();
        driver.findElement(By.xpath(".//*[@id='play']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("Glxss5");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("start_live")).click();
    }
}
