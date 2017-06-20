package com.seleniumtest;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by rongrong on 2017/6/16.
 */
public class Demo {
    public static void main(String[] args){
        //到指定安装目录下
        System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
//      //启动默认配置的Firefox，带插件
//        ProfilesIni allProfiles = new ProfilesIni();
//        FirefoxProfile firefoxProfile = allProfiles.getProfile("default-1462336392420");
//        WebDriver driver = new FirefoxDriver(firefoxProfile);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://10.33.48.190:8080/login");
        //等待时间
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //定位
//        driver.findElement(By.id("mykw")).sendKeys("selenium");
//        driver.findElement(By.name("wd")).sendKeys("java");
//        driver.findElement(By.className("s_ipt")).sendKeys("webdriver");
//        driver.findElement(By.tagName("input")).sendKeys("webdriver");
//        driver.findElement(By.linkText("新闻")).click();
//        driver.findElement(By.partialLinkText("地")).click();
//        driver.findElement(By.xpath(".//*[@id='mykw']")).sendKeys("input");
//        driver.findElement(By.cssSelector("#mykw")).sendKeys("css");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("login")).click();
        
    }
}

