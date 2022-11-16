package org.example;
//importing By method
import org.openqa.selenium.By;
//importing assort method to provide evidence of test case pass or fail
import org.testng.Assert;
//creating class to register a user
public class RegisterPage extends Utils{
    // creating assort method to give result in boolean format
public void verifyUserIsOnRegisterPage(){
Assert.assertTrue(driver.getCurrentUrl().contains("register"));
}
//creating object to entre user's details to register
    public void entreUsersDetails(){
        driver.manage().window().fullscreen();
        clickOnElements(By.id("gender-female"));
        typeText(By.id("FirstName"),"Mili");
        typeText(By.id("LastName"),"Thaker");
        selectFromDropDownByIndex(By.name("DateOfBirthDay"),1);
        selectFromDropDownByValue(By.name("DateOfBirthMonth"),"1");
        selectFromDropDownByIndex(By.name("DateOfBirthYear"),1);
        typeText(By.id("Email"),"mili"+getTimeStamp()+"@gmail.com");
        typeText(By.id("Company"),"Thaker's");
        clickOnElements(By.xpath("//input[@type=\"checkbox\"]"));
        typeText(By.id("Password"),"Test@5636");
        typeText(By.id("ConfirmPassword"),"Test@5636");
        clickOnElements(By.id("register-button"));

    }

}
