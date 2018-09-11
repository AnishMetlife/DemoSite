package Demo;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LandingPage;
import PageObjectModel.myAccount;
import Resource.Base;

public class homePage extends Base{

@Test	
public void HomePageNavigation() throws IOException
{
	driver =initializeDriver();
    driver.get("http://automationpractice.com/index.php");
    LandingPage home = new LandingPage(driver);
    home.gotoLogin().click();
    myAccount myAcc= new myAccount(driver);
	myAcc.enterEmail().sendKeys("Ani.567@fakee.com");
	myAcc.createAccountSubmit().click();
}

    
 
}
