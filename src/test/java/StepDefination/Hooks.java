package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;

public class Hooks {
	
	WebDriver driver;
	
	//@After
	public void teardown()
	{
		driver.quit();
	}
	
	

}
