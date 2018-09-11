package Demo;

import java.io.IOException;

import PageObjectModel.myAccount;
import Resource.Base;

public class createAccount extends Base {
	
	public void SignUp() throws IOException  
	{
		driver =initializeDriver();
		myAccount myAcc= new myAccount(driver);
		myAcc.enterEmail().sendKeys("Ani.567@fakee.com");
		myAcc.createAccountSubmit().click();
	}

}
 