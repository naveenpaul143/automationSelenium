package com.CkTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlow {

    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://cashkaro.com");
        WebElement logo = d.findElement(By.xpath("//img[@title='CashKaro']"));
         System.out.println("Login flow successfully ....");

    }
}
