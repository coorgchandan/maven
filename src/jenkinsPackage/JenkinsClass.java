package jenkinsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class JenkinsClass {
	
	ExtentReports e = new ExtentReports("./results/ExtentReports.html");
	@Test
	public void testA(){
		
		 ExtentTest t=e.startTest("test 1");
		 t.log(LogStatus.PASS, "hiiiiiiii");
		 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.google.com/");
			System.out.println("running test A");
			driver.quit();
			
		 e.endTest(t);
		 
		
		
		
		
		
	}
	
	@Test
	public void testB()
	{
		
		 ExtentTest t=e.startTest("test 1");
		 t.log(LogStatus.PASS, "BYEEEEEEEEEEEEEE");
		 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.google.com/");
			System.out.println("running test B");
			driver.quit();
			
		 e.endTest(t);
		 e.flush();
	}
}
