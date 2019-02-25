package com.selenium.framework;

import com.selenium.page.CalculatorPage;
import com.selenium.page.MainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class ParentScenario {
    private AppiumDriver driver;
    private WebDriver driver2;
    protected static MainPage mainPage;
    protected static CalculatorPage calculatorPage;

    public void startBrowser(){
        //for windows
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions chromeOptions = new ChromeOptions();

        try{
            driver2 = new ChromeDriver();
        } catch (Exception e) {
            System.out.println("Excepción al momento de inicializar el driver");
        }

        //instancias de paginas
        mainPage = new MainPage(driver);

    }

    public void startAndroid(){
        String url = "http://localhost:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");

        try{
            driver = new AndroidDriver<MobileElement>(new URL(url), cap);
        } catch (Exception e) {
            System.out.println("Excepción al momento de inicializar el driver");
        }
        calculatorPage = new CalculatorPage(driver);
    }

    protected void navigateTo(String url){
        driver2.navigate().to(url);
    }

    protected void closeWebDriver(){
        driver2.quit();
    }

    protected void closeMobileDriver(){
        driver.quit();
    }
}
