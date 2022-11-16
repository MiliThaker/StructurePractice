package org.example;
//importing package to run class
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
//creating class to call all the usable class to run the programme
public class TestSuits extends BaseTest {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterResultPage registerResultPage=new RegisterResultPage();
//crating method calling all usable methods to run test case succsessfully
  @Test
    public void verifyUserShouldBrAbleToRegistreSuccsessfully(){
      //click on register button oh HomePage
        homePage.clickOnRegisterButtonAtHomePage();
        //verify boolean condition true to proceed to the next step
        registerPage.verifyUserIsOnRegisterPage();
        //entre registration details for users and click on register button to register
        registerPage.entreUsersDetails();
        // land on registration page and print the correct result
        registerResultPage.verifyUserIsRegisteredSuccsessfullyPage();
  }
}
