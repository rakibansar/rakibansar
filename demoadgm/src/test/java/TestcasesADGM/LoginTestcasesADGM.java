package TestcasesADGM;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ADGMPageObject.LoginADGM;

public class LoginTestcasesADGM extends LoginADGM
    
{

   @Parameters("weburl")
   @BeforeMethod
	public void launch(String weburl) throws IOException
	{
		browserlaunch();
		webURL(weburl);
		

		
	}
   @AfterMethod
	public void quit() throws IOException
	{
		driver.quit();   	
	}
	
   @Test 
   public static void loginSalesforce() throws IOException, InterruptedException
	{
	   log.info("=========================================Start loginSalesforce===========================================");
	   enterusername();
	   enterpassword();
	   clickloginbitton();
	   log.info("Successfully Login");
	   
	   
	}
	
}