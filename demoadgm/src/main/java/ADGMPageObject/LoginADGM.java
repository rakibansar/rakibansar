package ADGMPageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasicUtility.BaseADGM;

/**
 * Hello world!
 *
 */
public class LoginADGM extends BaseADGM
{
    public static void enterusername() throws IOException 
	{   
		WebElement Username =  driver.findElement(By.xpath(usernamepath));
		BaseADGM.type(Username, username);	} 
    
    public static void enterpassword() throws IOException 
  	{   
  		WebElement Password =  driver.findElement(By.xpath(passwordpath));
  		BaseADGM.type(Password, password);
  	} 
  	
	public static void clickloginbitton() throws IOException, InterruptedException 
	{   WebElement loginbtton =  driver.findElement(By.xpath(loginbuttonpath));
		clickButton(loginbtton);	
		Thread.sleep(2000);
	}
	
	
	  	
	
	
}
