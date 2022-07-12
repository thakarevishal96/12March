package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaSignUpPage;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhSignUpTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.chromeBrowser();
		String signup=driver.getWindowHandle();
		System.out.println(signup);
	}
	
	@Test
	public void signUpTest() throws EncryptedDocumentException, IOException {
		ZerodhaSignUpPage zerodhaSignUpPage=new ZerodhaSignUpPage(driver);
		zerodhaSignUpPage.clickOnSignUp();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String>v=handle.iterator();
		String handle1=v.next();
		System.out.println(handle1);
		String handle2=v.next();
		System.out.println(handle2);
		driver.switchTo().window(handle2);
		String mobileNumber=Excel.getData("Credentials", 3, 1);
		zerodhaSignUpPage.enterMobileNumber(mobileNumber);
		zerodhaSignUpPage.clickOnContinue();
		
	}
	public void scrrenshot() throws IOException {
		ScreenShot.takesScreenshot(driver, "Zerodha");
	}
	

}
