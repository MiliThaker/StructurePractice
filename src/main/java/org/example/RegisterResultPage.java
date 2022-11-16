package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//creating class to navigate driver to go on register page
public class RegisterResultPage extends Utils {
    //calling method to navigate to register page
    public void verifyUserIsRegisteredSuccsessfullyPage() {
        //land on user registered successfully page
        waitForUtlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 20);
      //printing true result
        String comment = getTextFromElement(By.className("result"));
        if(comment!="0"){
            Assert.assertEquals("Your registration completed",comment);
        }
        else {
            System.out.println("Registration failed");
        }
    }
}
