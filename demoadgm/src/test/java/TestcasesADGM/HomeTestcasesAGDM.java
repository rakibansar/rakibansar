package TestcasesADGM;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ADGMPageObject.HomeADGM;
import BasicUtility.ReadXLSADGM;

public class HomeTestcasesAGDM extends HomeADGM
    
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

//   @Test (dataProviderClass = ReadXLSADGM.class,   dataProvider = "crendata")
//	public static void addnewcontacts(String firstname ,String lastname) throws IOException, InterruptedException
//	{
//	   LogADGM.startTestCase("addnewcontacts");
//		LoginTestcasesADGM.loginSF();
//		clicksidemenucontactstab();
//		Addnewcontact(firstname, lastname);
//	   LogADGM.endTestCase("New Contact saved successfully");
//	  
//	}
   
   @Test (dataProviderClass = ReadXLSADGM.class,   dataProvider = "crendata")
	public static void addnewcontacts( String firstname , String Lastname , String accountname) throws IOException, InterruptedException

	{  
	   log.info("================Start Test Case Mr. " + firstname+" "+Lastname+ "Excel contact verification================");
			LoginTestcasesADGM.loginSalesforce();
			clicksidemenucontactstab();
			createDynamicxpath(firstname , Lastname , accountname );
			contactverifyusername(firstname , Lastname , accountname );
			contactverifyaccountname(firstname , Lastname , accountname );
			
	   log.info("====End Test Case Verification ====");
	   

		 

}
}