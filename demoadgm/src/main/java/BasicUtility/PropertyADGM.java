package BasicUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyADGM extends VariablesADGM {
	
	public static void readdata() throws IOException {	
	
	
	Properties url = new Properties();
	FileInputStream urlInput = new FileInputStream("C:\\Users\\Rakib Ansar\\eclipse-project\\demoadgm\\src\\main\\java\\BasicUtility\\URL.Properties");
	url.load(urlInput);
	
	Properties locator = new Properties();
	FileInputStream locatorInput = new FileInputStream("C:\\Users\\Rakib Ansar\\eclipse-project\\demoadgm\\src\\main\\java\\BasicUtility\\Locators.properties");
	locator.load(locatorInput);
	
	
//	Login Salesforce 
	username = url.getProperty("username");
	usernamepath = locator.getProperty("usernamepath");

	password = url.getProperty("password");
	passwordpath = locator.getProperty("passwordpath");

	loginbuttonpath = locator.getProperty("loginbuttonpath");
//	Login Salesforce 

	
//	Create contact 
	clicksidemanucontactstab = locator.getProperty("clicksidemanucontactstab");
	contactxpathtemplate = locator.getProperty("contactxpathtemplate");
	
	contactname = locator.getProperty("contactname");
	contactaccountname = locator.getProperty("contactaccountname");
	
	
	
//	  Add New contact
	newcontact = locator.getProperty("newcontact");
//	  fill New contactdetails
	salutationdropdownpath = locator.getProperty("salutationdropdownpath");
	salutationtitlepath = locator.getProperty("salutationtitlepath");
	firstnamepath = locator.getProperty("firstnamepath");
	lastnamepath = locator.getProperty("lastnamepath");
	selectaccontpath = locator.getProperty("selectaccontpath");
	selectaccontnamepath = locator.getProperty("selectaccontnamepath");
	savebuttonpath = locator.getProperty("savebuttonpath");
//	  fill New contactdetails

//	Create contact 


	

	


	
	

//	Password = url.getProperty("Password");
//	searchpatientname = url.getProperty("searchpatientname");
//
////Login
//	Loginpath = locator.getProperty("Loginpath");
//	Emailpath = locator.getProperty("Emailpath");
//	Passpath = locator.getProperty("Passpath");
//	Loginbuttonpath = locator.getProperty("Loginbuttonpath");
//
////schedule consultation 
//	Scheduleconsultationpath = locator.getProperty("Scheduleconsultationpath");
//	Searchpatientpath = locator.getProperty("Searchpatientpath");
//	PatientIDpath = locator.getProperty("PatientIDpath");
//	selectdepartmentpath = locator.getProperty("selectdepartmentpath");
//	selectdepartmentspeciality = locator.getProperty("selectdepartmentspeciality");
//	selectdoctorpath = locator.getProperty("selectdoctorpath");
//	selectdoctorbyname = locator.getProperty("selectdoctorbyname");
//	bookappointmentbutton = locator.getProperty("bookappointmentbutton");
//	appointmenttypecheckbox = locator.getProperty("appointmenttypecheckbox");
//	afterbokkingdoneconfirmation = locator.getProperty("afterbokkingdoneconfirmation");

	
	
	
	
	

	}
}
