package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	@FindBy (xpath="//input[@id='userid']") private WebElement userId;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//img[@alt='Kite Android']") private WebElement playStore;
	@FindBy (xpath="//img[@alt='Kite iOS']") private WebElement appleStore;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement submit;
	@FindBy (xpath="//a[text()='Forgot 2FA?']") private WebElement forgot2fa;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnForgotLink() {
		forgot.click();
	}
	
	public void clickOnPlayStore() {
		playStore.click();
	}
	
	public void clickOnAppleStore() {
		appleStore.click();
	}
	
	public void clickOnSignup() {
		signUp.click();
	}
	
	public void enterPin(String pinNumber,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNumber);
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	
	public void clickOnForgot2Fa() {
		forgot2fa.click();
	}
	
	
	

}
