package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.chromeBrowser();
	}
	
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userId=Excel.getData("Credentials", 0, 1);
		String pass=Excel.getData("Credentials", 1, 1);
		String pin=Excel.getData("Credentials", 2, 1);
		zerodhaLoginPage.enterUserId(userId);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		//Thread.sleep(2000);
		zerodhaLoginPage.enterPin(pin,driver);
		zerodhaLoginPage.clickOnContinue();
	}

}
