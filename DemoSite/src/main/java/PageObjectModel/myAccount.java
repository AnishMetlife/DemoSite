package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myAccount {
public WebDriver driver;
	
	By email = By.cssSelector("input[id='email_create']");
	By createAccount = By.cssSelector("button[id='SubmitCreate']");
	
	
	public myAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver; 
	}

	public WebElement enterEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement createAccountSubmit()
	{
		return driver.findElement(createAccount);
	}
	

}
