package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CalculatorPage extends ParentPage {

    String ID_NUMBER ="com.android.calculator2:id/digit_%s";
    //By BTN_NUMBER = By.id("com.android.calculator2:id/digit_%d");
    private By BTN_SUM = By.id("com.android.calculator2:id/op_add");
    private By BTN_SUBTRACT = By.id("com.android.calculator2:id/op_sub");
    private By BTN_MULTIPLY = By.id("com.android.calculator2:id/op_mul");
    private By BTN_DIVIDE = By.id("com.android.calculator2:id/op_div");
    private By BTN_RESULT = By.id("com.android.calculator2:id/eq");
    private By TXT_RESULT = By.id("com.android.calculator2:id/result");

    private By getBtnNumber(String number){ return By.id(String.format(ID_NUMBER, number)); }

    public CalculatorPage(AppiumDriver driver){
        super(driver);
    }

    public void ClickNumber(String a){
        ClickOnLocator(getBtnNumber(a));
    }

    public void ClickSum(){
        ClickOnLocator(BTN_SUM);
    }

    public void ClickSubtract(){ ClickOnLocator(BTN_SUBTRACT); }

    public void ClickMultiply(){ ClickOnLocator(BTN_MULTIPLY); }

    public void ClickDivide(){ ClickOnLocator(BTN_DIVIDE); }

    public void ClickResult(){
        ClickOnLocator(BTN_RESULT);
    }

    public boolean getResultNumber(String result){
        return GetResult(TXT_RESULT).equals(result);
    }

}
