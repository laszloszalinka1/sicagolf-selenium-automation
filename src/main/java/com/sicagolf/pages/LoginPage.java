package com.sicagolf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sicagolf.pages.base.BasePage;

public class LoginPage extends BasePage {
    private By userInput = By.xpath("//*[@type='email']");
    private By passwordInput = By.xpath("//*[@type='password']");
    private By loginButton = By.xpath("//*[@type='submit']");
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @Override
    public boolean isPageLoaded() {
        return find(userInput).isDisplayed();
    }
    public LoginPage typeEmail(String email){
        type(userInput, email);
        return this;
    }
    public LoginPage typePassword(String password){
        type(passwordInput, password);
        return this;
    }
    public DashboardPage clickLogin() {
    click(loginButton);
    return new DashboardPage(driver); // Te lleva a la siguiente página
}
    
}
