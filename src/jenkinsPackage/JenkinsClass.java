package jenkinsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsClass {
	
	@Test
	public void testA(){
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("running test A");
		driver.quit();
		
		
	}

}
