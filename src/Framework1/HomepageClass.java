package Framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomepageClass
{
	//POM Class-II
	
	
		//1.data members are declare globally with access level private by using @findby annotation
		
		@FindBy(xpath="//input[@name='username_show']") private WebElement UserShow;
		@FindBy(xpath="//a[text()='Logout']") private WebElement Logoutbtn;
		
		
		
		//2.Initialize within constructor with access level public using pagefactory class
		public HomepageClass(WebDriver driver)
		{
         PageFactory.initElements(driver,this);

		}

		//3.utilize variables within a method with access level public
		
		public String getUserName()
		{
			String un=UserShow.getAttribute("Value");
			String[] name=un.split(" ");
			
			String a=name[0];
			String ActualUserName=name[1];
			return ActualUserName;
		}
		


		public void ClickLogoutBtn()
		{
			Logoutbtn.click();
		}
		

}
