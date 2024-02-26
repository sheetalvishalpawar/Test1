package Framework1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	public WebDriver driver;
	
	public void InilializeBrowser()
	{
	
	    ChromeOptions co=new ChromeOptions();
		co.addArguments("--allow-remote-origine=*","ignore-certificate-errors");
		
	    driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	     
	}
	

}
