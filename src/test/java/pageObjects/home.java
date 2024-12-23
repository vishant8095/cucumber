package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement signbuton;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement text_username;
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_btn;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement text_pasword;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginbtn;
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement logo;
	public void clciksign_btn()
	{
		signbuton.click();
	}
	public void setusername(String Username)
	{
		text_username.sendKeys(Username);
	}
	public void clcikcont_btn()
	{
		continue_btn.click();	
	}
	public void setpassword(String pasword)
	{
		text_pasword.sendKeys(pasword);
	}
	public void clciklogin()
	{
		loginbtn.click();
	}
	public boolean validatelogo()
	{
		boolean status=logo.isDisplayed();
		return status;
	}
	public home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
