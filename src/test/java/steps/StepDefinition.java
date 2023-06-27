package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AddNewAccountPage;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBasePage;

public class StepDefinition extends TestBasePage{
	AddNewAccountPage addNewAccount;
	LoginPage loginPage;
	DatabasePage databasePage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		addNewAccount = PageFactory.initElements(driver, AddNewAccountPage.class);
		databasePage = new DatabasePage();
	}

	@Given ("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		takeScreenShot(driver);
	}
	
//	@When ("User inputs username as {string}")
//	public void user_inputs_username_as(String username)  {
//		loginPage.insertUsername(username);
//	}
//	
//	@When("User inputs password as {string}")
//	public void user_inputs_password_as(String password) {
//		loginPage.insertPassword(password);
//	}
//	
	
	
	@When("User inputs {string} from mysql database")
	public void user_inputs_from_mysql_database(String userData) {
	   switch (userData.toLowerCase()) {
	   	case "username":
	   		loginPage.insertUsername(databasePage.getDatafromSQL("username"));
	   		System.out.println("Username from DB: " + databasePage.getDatafromSQL("username"));
	   		break;
	   	case "password":
	   		loginPage.insertPassword(databasePage.getDatafromSQL("password"));
	   		System.out.println("Password from DB: " + databasePage.getDatafromSQL("password"));
	   		break;
	   	default:
	   		System.out.println("Login Data: " + userData + " not found!");
	   }
	
	}

	
	@When ("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignIn();
	}

	@Then("User will be on dashboard page")
	public void user_will_be_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);}
//		takeScreenShot(driver);
//	}
//	
//	
//	@Then ("User clicks on Bank and Cash")
//	public void user_clicks_on_Bank_and_Cash() {
//		addNewAccount.clickBankAndCash();
//	}
//	
//	@Then ("User clicks on New Account")
//	public void user_clicks_on_new_account() {
//		addNewAccount.clickNewCustomer();
//	}
//	@And ("User enters {string} as account_title on account page")
//	public void userEntersAccountTitle(String account_title) {
//		addNewAccount.addAccount(account_title);
//	}
//	@And ("User enters {string} as description on accounts page")
//	public void userEntersDescription(String description) {
//		addNewAccount.addDescription(description);
//		}
//	@And ("User enters {string} as initial Balance on accounts page")  
//	public void userEntersBalance(String balance) {
//		addNewAccount.addBalance(balance);
//	}
//	@And ("User enters {string} as account Number on accounts page")
//	public void userEntersAccountNumber(String account_number) {
//		addNewAccount.addAccountNumber(account_number);
//	}
//	
//	@And ("User enters {string} as contact Person on accounts page")
//	public void userEntersContactPerson(String contact_person) {
//		addNewAccount.addContactPerson(contact_person);
//	}
//	
//	@And ("User enters {string} as Phone number on accounts page")
//	public void userEnterContactNumber(String contact_number) {
//		addNewAccount.addContactNumber(contact_number);
//	}
//	@And ("User enters {string} as banking url on accounts page")  
//	public void userEnterBankURL(String banking_url) {
//		addNewAccount.addBankingUrl(banking_url);
//	}
//	@And ("User clicks on submit")
//	public void userClicksubmit() {
//		addNewAccount.clickSubmit();
//	}
//	@Then ("User should be able to validate account created successfully")
//	public void userCreatesAccountSuccessfully() {
//		String expectedTitle = "Account Created Successfully";
//		String actualTitle = "Account Created Successfully";
//		Assert.assertEquals(expectedTitle, actualTitle);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		takeScreenShot(driver);
//	}
//	
	
	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

