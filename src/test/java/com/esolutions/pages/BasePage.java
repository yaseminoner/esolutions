package com.esolutions.pages;

import com.esolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='cmpbntyestxt']")
    public  WebElement cookies;

    @FindBy(xpath="//a[@title = 'SOFTWARE by e.solutions']")
    public WebElement softwareEsolutions;

}
