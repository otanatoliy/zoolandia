package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPages {
    private WebDriver driver;


    public MainPages(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//div[@class=\"mb-login\"]" )
    public WebElement login;

    @FindBy(xpath ="//input[@class=\"form-control\"]" )
    public WebElement form;

    @FindBy(xpath = "//input[@value='Увійти']")
    public WebElement button;


    public void login(){login.click();}

    public void form(){form.sendKeys("test@gmail.com");}

    public void button(){button.click();}

}
