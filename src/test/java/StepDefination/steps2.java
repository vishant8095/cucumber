package StepDefination;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.home;
public class steps2 {
	WebDriver driver= new ChromeDriver();
	home hm=new home(driver);
	@Given("the user is on the amazon login page")
	public void the_user_is_on_the_amazon_login_page() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		hm.clciksign_btn();
	}
	@When("the user enters valid credential1{string}")
	public void the_user_enters_valid_credential_username(String string) {
		hm.setusername(string);
	}
	@When("the user click continue button")
	public void the_user_click_continue_button() {
       hm.clcikcont_btn();
	}
	@When("the user enters valid credential{string}")
	public void the_user_enters_valid_credential_password(String string) {
	hm.setpassword(string);
	}
	@Then("the user click on login button")
	public void the_user_click_on_login_button() {
      hm.clciklogin();
	}
	@Then("the user should see company log")
	public void the_user_should_see_company_log() throws InterruptedException {
     boolean status=   hm.validatelogo();
		Assert.assertEquals(status, true);
        Thread.sleep(2000);
        driver.quit();
	}
}
