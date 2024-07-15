package BasicUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseADGM extends PropertyADGM{
	
    public static Logger log = LogManager.getLogger("BaseADGM");
    
	public static void browserlaunch() throws IOException 
	{ 
		   readdata();
//		   System.setProperty("WebDriver.chrome.driver", "C\\Users\\Rakib Ansar\\eclipse\\chromedriver.exe");
//	       WebDriver driver = new ChromeDriver();
//	       WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
           driver = new ChromeDriver();
		   driver.manage().window().maximize();
		}
	
	@BeforeSuite()
	public void logConfig() throws IOException {
		ExtentManagerADGM.setExtent();

	}
	@AfterSuite()
	public void Aftersuite() {
		ExtentManagerADGM.endReport();
	}
	
	
	public static void webURL(String weburl) throws IOException 
	{  
//	Log.startTestCase("launched browser " + weburl);
		driver.get(weburl);
		System.out.println("WEB URL  =  " + "|"+weburl+"|");
		
		}
//	public static void webURL( String URL ) throws IOException 
//	{   Log.startTestCase("launched browser " + URL);
//		driver.get(URL);
//		System.out.println("WEB url " + URL);
//		}
	
	
	
//	Driver wait 
	public static void waitelement(String path)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));

	}
	
	
	public static void fluentWait(WebDriver driver,WebElement element, int timeOut) {
	    Wait<WebDriver> wait = null;
	    try {
	        wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(20))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.click();
	    }catch(Exception e) {
	    }
	}

//	Dropdown handling
	public static void dropdownhandling()
	{
		WebElement dropdown = driver.findElement(By.xpath("//*[@formcontrolname='department']"));
		Select Drop =new Select(dropdown);
		Drop.selectByVisibleText("Gynecology");
	}
//	Switch frame
	public static void switchf()

	{
    driver.switchTo().frame(driver.findElement(By.xpath("")));
 
	}
	
	
//	Click on element 
	public static void clickButton(WebElement buttonElement) {
		
	    try {
	        if(buttonElement.isDisplayed() && buttonElement.isEnabled()) {
	            String buttontext = buttonElement.getText();

	            buttonElement.click();
	            System.out.println(buttontext + "  clicked successfully" );
	        } else {
	            System.out.println( "Button is not visible or enabled " + buttonElement);
	        }
	    } catch (Exception e) {
	    }
	}

	public static  boolean type(WebElement ele, String text ) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value " + text);
			} else {
				System.out.println("Unable to enter value " +  text);
			}

		}
		return flag;
	}

	
	public boolean selectBySendkeys(String value,WebElement ele) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Select value from the DropDown");		
			} else {
				System.out.println("Not Selected value from the DropDown");
				// throw new ElementNotFoundException("", "", "")
			}
		}
	}

	{
	
//	public static void scheduleconsultationbutton()
//	{
//		waitelement(Scheduleconsultationpath);
//
//		WebElement  scheduleconsultation = driver.findElement(By.xpath(Scheduleconsultationpath));
//		scheduleconsultation.click();
//	}
//	
//	public static void searchpatientname(String patientname)
//	{
//		WebElement  searchpatient = driver.findElement(By.xpath(Searchpatientpath));
//		searchpatient.sendKeys(patientname);
//	}
	
//	public static void clickonpatient()
//	{
//		waitelement(PatientIDpath);
//		WebElement  searchpatientID = driver.findElement(By.xpath(PatientIDpath));
//		searchpatientID.click();
//	}
//	
//	public static void selectdepartment() throws InterruptedException
//	{
//        Thread.sleep(3000);
//		WebElement  department = driver.findElement(By.xpath(selectdepartmentpath));
//		department.click();
//
//		WebElement  selectgy = driver.findElement(By.xpath(selectdepartmentspeciality));
//		selectgy.click();
//	}
//	
//	public static void selectdoctordropdown() throws InterruptedException
//	{
//        Thread.sleep(3000);
//		WebElement  doctordropdown = driver.findElement(By.xpath(selectdoctorpath));
//		doctordropdown.click();
//	
//		WebElement  selectdoctor = driver.findElement(By.xpath(selectdoctorbyname));
//		selectdoctor.click();
//	}
//	public static void bookappointmentbutt () throws InterruptedException
//	{
//        Thread.sleep(3000);
//
//		WebElement  bookappointmentbutt = driver.findElement(By.xpath(bookappointmentbutton));
//		bookappointmentbutt.click();
//	}
//	public static void selectappointmenttype ()
//	{
//		waitelement(appointmenttypecheckbox);
//
//		WebElement  appointmenttype = driver.findElement(By.xpath(appointmenttypecheckbox));
//		appointmenttype.click();
//	}
//	
//	public static void Afterbookingdone()
//	{
//		waitelement(afterbokkingdoneconfirmation);
//
//		WebElement  doneclick = driver.findElement(By.xpath(afterbokkingdoneconfirmation));
//		doneclick.click();
	}
	
	//ScreenShot
	
	
	public static String screenShot( String filename) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + filename + "_"  + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
		
	}
	

	
	
}


	

