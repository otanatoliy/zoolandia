package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMainPage {
    private WebDriver driver;

    public NewMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
