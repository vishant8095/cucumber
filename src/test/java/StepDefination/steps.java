package StepDefination;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*public class steps {
	WebDriver driver= new ChromeDriver();
	@Given("the user is on the amazon login page")
	public void the_user_is_on_the_amazon_login_page() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
	}
	@When("the user enters valid credential1{string}")
	public void the_user_enters_valid_credential_username(String string) {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
	}
	@When("the user click continue button")
	public void the_user_click_continue_button() {
       driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	@When("the user enters valid credential{string}")
	public void the_user_enters_valid_credential_password(String string) {
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(string);
	}
	@Then("the user click on login button")
	public void the_user_click_on_login_button() {
      driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
	@Then("the user should see company log")
	public void the_user_should_see_company_log() throws InterruptedException {
        boolean status=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
        Assert.assertEquals(status, true);
        Thread.sleep(2000);
        driver.quit();
	}
}
*/