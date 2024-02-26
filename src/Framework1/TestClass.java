package Framework1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
		//Create object of POM class-I
		LoginClass Login;
		
		//Create object of POM class-II
		HomepageClass Home;
		
	     @BeforeClass
		public void OpenBrowser()
	    {
	    	 InilializeBrowser();	
	    	 Login=new LoginClass (driver);
	    	 Home=new HomepageClass(driver);	
	    }
	     
	     @BeforeMethod
	     public void LoginToApp() throws IOException 
	     {
	    	 Login.enterUsername(UtilityClass.getDataFromPF("UserName"));
	    	 Login.enterPassword(UtilityClass.getDataFromPF("Password"));
	    	 Login.clickLoginbutton();
	     }
	     
	     
	     @Test
	     public void verifyUserName() throws EncryptedDocumentException, IOException
	     {
	    	 String ActualUserName=Home.getUserName();
	    	 
	    	 String ExpectedUserName=UtilityClass.getDataFromExcelsheet(0, 0);
	    	 
	    	Assert.assertEquals(ActualUserName, ExpectedUserName);
	     }
	     
	     @AfterMethod
	     public void LogoutFromApp()
	     {
	    	 Home .ClickLogoutBtn();
	     }
	     
	     
	     @AfterClass
	     public void CloseBrowser()
	     {
	    	 driver.quit();
	     
	     }
	     
	

}
