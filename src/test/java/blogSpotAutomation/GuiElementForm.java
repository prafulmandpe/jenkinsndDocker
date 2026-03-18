package blogSpotAutomation;

import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuiElementForm {

	
	WebDriver driver;
	@Given("user is at BlogSpot Automation page")
	public void driverinit() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origin=*");
	 driver = new ChromeDriver(option);
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("user enters the name as {string}")
	public void user_enters_the_name_as(String string) {
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(string);
	}
	@When("user enters the email as {string}")
	public void user_enters_the_email_as(String string) {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
	}
	@When("user enter the phoneNumber as {string}")
	public void user_enter_the_phone_number_as(String string) {
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(string);
	}
	@When("user enters the address as {string}")
	public void user_enters_the_address_as(String string) {
	    driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(string);
	}
	
	@When("user selects green color")
	public void user_selects_green_color() {
	    WebElement colorDD = driver.findElement(By.xpath("//select[@id='colors']"));
	    Select s = new Select(colorDD);
	    s.selectByValue("green");
	}
	@When("user selects Dog")
	public void user_selects_dog() {
	   WebElement animalsDD = driver.findElement(By.xpath("//select[@id='animals']"));
	   Select s = new Select(animalsDD);
	   s.selectByValue("dog");
	}
	
	@When("user select the gender as male")
	public void user_select_the_gender_as_male() {
	   driver.findElement(By.xpath("//input[@id='male']")).click();
	}
	@When("user select the days as monday and wednesday")
	public void user_select_the_days_as_monday_and_wednesday() {
	    driver.findElement(By.xpath("//input[@id='monday']")).click();
	    driver.findElement(By.xpath("//input[@id='wednesday']")).click();
	}
	@When("user select China from the dropdown")
	public void user_select_china_from_the_dropdown() {
		 WebElement dropDownMenu = driver.findElement(By.xpath("//select[@id='country']"));
	    Select s = new Select(dropDownMenu);
	    s.selectByValue("germany");
	}
	
	
	@AfterMethod
	@Then("user close the Browser")
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}


