package StepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Pom.Amazon;

import io.cucumber.java.en.*;

public class AmazonStepDefinition {
	
	public WebDriver driver;
	public Amazon Amz;
	
	@Given("The brower is launched")
	public void the_brower_is_launched() {
		  System.setProperty("webdriver.chrome.driver","../BDDCUCUMBER/Drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	    Amz = new Amazon(driver);
	}

	@Given("The Apllication is loaded")
	public void the_apllication_is_loaded() {
		driver.get("https://www.amazon.in/");
	}

	@When("The user click on SignIn button")
	public void the_user_click_on_sign_in_button() throws InterruptedException {
	    Amz.clickSignIn();
	    Thread.sleep(2000);
	}

	@When("The user Enters the valid user name")
	public void the_user_enters_the_valid_user_name() {
	   Amz.setEmail("kanuparthichandrasekharreddy7@gmail.com");
	}

	@When("The user click on continue button")
	public void the_user_click_on_continue_button() throws InterruptedException {
	    Amz.clickOnContinue();
	    Thread.sleep(2000);
	}

	@When("The user Enter the valid password")
	public void the_user_enter_the_valid_password() {
	   Amz.setPassword("9966051900");
	}

	@When("The user Click on Login button")
	public void the_user_click_on_login_button() {
	   Amz.signIn().click();
	   Actions act=new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]")));
	   act.perform();
	}
	@Then("The user mouse over on the Account&List")
	public void the_user_mouse_over_on_the_account_list() {
		Actions act=new Actions(driver);
		   act.moveToElement(Amz.mouseOverOnAccountAndList());
		   act.perform();
	}

	@Then("The User Click On Your Account")
	public void the_user_click_on_your_account() {
	    Amz.clickOnYourAccount();
	}

	@Then("The User Click On Your Address")
	public void the_user_click_on_your_address() throws InterruptedException {
	    Amz.clickYourAddress();
		Thread.sleep(3000);
	}

	@Then("The User Click On Add Address")
	public void the_user_click_on_add_address() throws InterruptedException {
	   Amz.clicOnAddAddress();
	   Amz.sendFullName("QA engineer");
	   Amz.sendMobileNum("7449061657");
	   Thread.sleep(2000);
	   Amz.sendPinCode("560025");
	   Amz.sendCompanyAddress("5th Floor, Prestige Solitaire, TRUGlobal Software");
	   Thread.sleep(2000);
	   Amz.sendArea("Brunton Rd");
	   Amz.sendLandMark("Ashok Nagar");
	   Amz.clickOnAddressType();
	   Thread.sleep(2000);
	   Amz.clickOnOffice();
	   Thread.sleep(3000);
	   Amz.clickAddressAdd();
	   Thread.sleep(5000);

	}
	@When("The User Search the Product")
	public void the_user_search_the_product() throws InterruptedException {
		   String parent = driver.getWindowHandle();
		   Thread.sleep(3000);
		   String a = "Google Pixel 6";
	 Amz.sendSearchProduct(a.toLowerCase());
	   Thread.sleep(2000);
	 Amz.clickOnSearchSubmit();
	   Thread.sleep(2000);
	   Amz.searchMobile();
	   Thread.sleep(5000);
		Set<String> totalWindows =  driver.getWindowHandles();
		for(String childwindow : totalWindows) {
			if(!parent.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}
		}

	}

	@When("add the Product into Cart")
	public void add_the_product_into_cart() throws InterruptedException {
	 Amz.clickOnBuyNow();
	   Thread.sleep(3000);

	}

	@When("add Address to Deliver the Product")
	public void add_address_to_deliver_the_product() {
	    Amz.selectDeliveryToThisAddress();
	}

}
