package ADGMPageObject;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BasicUtility.BaseADGM;

public class HomeADGM extends BaseADGM
{

	 
public static void clicksidemenucontactstab () throws IOException, InterruptedException 
	{   
  log.info("Run clickcontact");
        BaseADGM.waitelement(clicksidemanucontactstab);
		WebElement Createfirstcontact =  driver.findElement(By.xpath(clicksidemanucontactstab));
		BaseADGM.clickButton(Createfirstcontact);
        
		
	} 

public static void Addnewcontact(String firstname, String lastname) throws IOException, InterruptedException 
{   
  log.info("Run Addnewcontact");
    
    BaseADGM.waitelement(newcontact);
	WebElement clicknewbutton =  driver.findElement(By.xpath(newcontact));
	BaseADGM.clickButton(clicknewbutton);

    BaseADGM.waitelement(firstnamepath);
	WebElement enterfirstname =  driver.findElement(By.xpath(firstnamepath));
	BaseADGM.type(enterfirstname, firstname);
	WebElement enterlastname =  driver.findElement(By.xpath(lastnamepath));
	BaseADGM.type(enterlastname, lastname);
  log.info("Entered Firstname- Rakib and Last Name- Ansar ");  
    
    BaseADGM.waitelement(salutationdropdownpath);
    WebElement salutationDropdown = driver.findElement(By.xpath(salutationdropdownpath)); 
    salutationDropdown.click();
    BaseADGM.waitelement(salutationtitlepath);
    WebElement salutationtitle = driver.findElement(By.xpath(salutationtitlepath)); 
    salutationtitle.click();
  log.info( "Selected salutationtitle Mr.");

    BaseADGM.waitelement(selectaccontpath);
	WebElement clickaccountname  = driver.findElement(By.xpath(selectaccontpath)); 
    clickaccountname.click();
    BaseADGM.waitelement(selectaccontnamepath);
    WebElement selectaccountname = driver.findElement(By.xpath(selectaccontnamepath)); 
    selectaccountname.click();
  log.info( "Selected Account ");

    WebElement clickonsave = driver.findElement(By.xpath(savebuttonpath)); 
    clickonsave.click();
  log.info( "Clicked on Save Button");

} 

public static void verifydata(String firstname, String Lastname  ) throws InterruptedException, EncryptedDocumentException, IOException
{
   log.info("Run verifydata");
    BaseADGM.waitelement("(//th[@tabindex='-1']//a[@data-refid='recordId'])[2]");
    WebElement clickonaddedcontact =  driver.findElement(By.xpath("(//th[@tabindex='-1']//a[@data-refid='recordId'])[2]"));
	BaseADGM.clickButton(clickonaddedcontact);
   log.info("clickonaddedcontact");

    BaseADGM.waitelement("//lightning-formatted-name[@slot='outputField']");

	WebElement username  =  driver.findElement(By.xpath("//lightning-formatted-name[@slot='outputField']"));
	String name = username.getText();
    String excelname = "Mr. " + firstname +" " + Lastname;
  
    System.out.println(name + excelname +"Match");
    String Dynamicpath = "(//th[@tabindex='-1']//a[@data-refid='recordId'])[@title='" + firstname +" " + Lastname +"']";
    System.out.println(Dynamicpath);
    
   


}

public static void createDynamicxpath(String firstname, String Lastname , String accountname  )
{
   log.info("Run createDynamicxpath");
    
    String Dynamicpath = contactxpathtemplate + firstname +" " + Lastname +"']"; 
    BaseADGM.waitelement(Dynamicpath);
    WebElement clickonaddedcontact =  driver.findElement(By.xpath(Dynamicpath));
	BaseADGM.clickButton(clickonaddedcontact);

}

public static void contactverifyaccountname(String firstname, String Lastname ,  String accountname)
{
	BaseADGM.waitelement(contactaccountname);
	WebElement Contactaccountname  =  driver.findElement(By.xpath(contactaccountname));
	String webaccountname = Contactaccountname.getText();
	String excelaccountname = "Open " + accountname  + " Preview";

	try {
        if(webaccountname.equals(excelaccountname)) {
            log.info("Verification for Account Name is Successful " + excelaccountname + " = " + webaccountname);

        } else {
            log.error("Verification Account Name  failed  " + excelaccountname + " =! " + webaccountname);
        	Assert.assertEquals(excelaccountname, webaccountname);
  
        }
    } catch (Exception e) { }
        
	}
public static void contactverifyusername(String firstname, String Lastname ,  String accountname)
{
	BaseADGM.waitelement(contactname);
	WebElement Contactname  =  driver.findElement(By.xpath(contactname));
	String webcontactname = Contactname.getText();
    String excelname = "Mr. " + firstname +" " + Lastname;
	try {
        if(webcontactname.equals(excelname)) {
            log.info("Verification for  UserName is Successful " + excelname + " = " + webcontactname);

        } else {
            log.error("Verification UserName failed  " + excelname + " =! " + webcontactname);
        	Assert.assertEquals(excelname, webcontactname);
        }
    } catch (Exception e) { }
        
	}
}
  

    

	






  
   
 

