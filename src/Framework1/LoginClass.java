package Framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginClass 
{
	//POM Class-I
	
	
	//1.data members are declare globally with access level private by using @findby annotation
	
	@FindBy(xpath="//input[@name='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PSW;
	@FindBy(xpath="//input[@name='login']") private WebElement Loginbtn;
	
	
	//2.Initialize within constructor with access level public using pagefactory class
	
	public LoginClass (WebDriver driver)
	{
     PageFactory.initElements(driver,this);

	}

	//3.utilize variables within a method with access level public
	
	public void enterUsername(String User)
	{
		UN.sendKeys(User);
	}
	
	public void enterPassword(String Password) 
	{
		PSW.sendKeys(Password);
	}
	
	public void clickLoginbutton()
	{
		Loginbtn.click();
	}
	
}
