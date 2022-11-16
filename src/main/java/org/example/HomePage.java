package org.example;
//importing package to use By method
import org.openqa.selenium.By;
//creating class extending utils class to click on register button on home page
public class HomePage extends Utils{
// creating method to click on register button
    public void clickOnRegisterButtonAtHomePage(){
        clickOnElements(By.className("ico-register"));
    }
}
