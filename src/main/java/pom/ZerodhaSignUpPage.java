package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
	@FindBy (xpath="(//a[text()='About'])[1]") private WebElement about;
	@FindBy (xpath="(//a[text()='Products'])[1]") private WebElement products;
	@FindBy (xpath="(//a[text()='Pricing'])[1]") private WebElement pricing;
	@FindBy (xpath="(//a[text()='Support'])[1]") private WebElement support;
	@FindBy (xpath="//div[@id='menu_btn']") private WebElement menu;
	@FindBy (xpath="//input[@id='user_mobile']") private WebElement mobileNumber;
	@FindBy (xpath="//button[@type='submit']") private WebElement submit;
	@FindBy (xpath="//a[text()='Want to open an NRI account?']") private WebElement nriAccount;
	
	public ZerodhaSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignUp() {
		signUp.click();
	}
	
	public void clickOnAbout() {
		about.click();
	}
	
	public void clickOnProducts() {
		products.click();
	}
	
	public void clickOnPricing() {
		pricing.click();
	}
	
	public void clickOnSupport() {
		support.click();
	}
	
	public void clickOnMenu() {
		menu.click();
	}
	
	public void enterMobileNumber(String number) {
		mobileNumber.sendKeys(number);
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	
	public void clickOnNriAcoount() {
		nriAccount.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
