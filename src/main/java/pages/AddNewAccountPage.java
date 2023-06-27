package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage{

	WebDriver driver;
	
	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(), \"Bank & Cash\")]") WebElement BANK_AND_CASH_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), \"New Account\")]") WebElement NEW_CUSTOMER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]") WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"description\"]") WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"balance\"]") WebElement BALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account_number\"]") WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_person\"]") WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_phone\"]") WebElement CONTACT_PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id=\"ib_url\"]") WebElement BANKING_URL;
	@FindBy(how = How.XPATH, using = "//button[@class=\"btn btn-primary\"]") WebElement SUBMIT_BUTTON;
	@FindBy(how = How.XPATH, using = "//h5[text()=\"Add New Account\"]") WebElement ADD_NEW_ACCOUNT_PAGE;
	
	public void clickBankAndCash() {
		BANK_AND_CASH_FIELD.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickNewCustomer() {
		NEW_CUSTOMER_FIELD.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public void addAccount(String account_title) {
		ACCOUNT_TITLE_FIELD.sendKeys(account_title);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void addDescription(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addBalance(String balance) {
		BALANCE_FIELD.sendKeys(balance);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addAccountNumber(String account_number) {
		ACCOUNT_NUMBER_FIELD.sendKeys(account_number);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addContactPerson(String contact_person) {
		CONTACT_PERSON_FIELD.sendKeys(contact_person);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addContactNumber(String contact_number) {
		CONTACT_PHONE_FIELD.sendKeys(contact_number);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addBankingUrl(String banking_url) {
		BANKING_URL.sendKeys(banking_url);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickSubmit() {
		SUBMIT_BUTTON.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
	}
	public String getPageTitle() {
		return driver.getTitle();
	
	}
}

