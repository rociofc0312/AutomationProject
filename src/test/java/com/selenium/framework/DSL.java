package com.selenium.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class DSL {
    private AppiumDriver driver;

    public DSL(AppiumDriver driver) {
        this.driver = driver;
    }

    public void ClickOnLocator(By locator){
        driver.findElement(locator).click();
    }


    public String GetResult(By locator){
        String number = driver.findElement(locator).getText();
        return number;
    }
}
