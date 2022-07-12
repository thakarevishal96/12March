package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaHomePageTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		driver=Browser.chromeBrowser();
		//ZerodhaLoginPageTest zerodhaLoginPageTest=new ZerodhaLoginPageTest();
		//zerodhaLoginPageTest.loginTest();
	}
	
	@Test
	public void homePageTest() throws EncryptedDocumentException, IOException, InterruptedException {
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
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		String stockName=Excel.getData("Credentials", 4, 1);
		//Alert a=driver.switchTo().alert();
		//a.accept();
		Thread.sleep(2000);
		zerodhaHomePage.enterStockName(stockName);
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		WebElement stockDmart= driver.findElement(By.xpath("//li[@class='search-result-item selected']"));
		actions.moveToElement(stockDmart);
		//Thread.sleep(2000);
		//WebElement buy=driver.findElement(By.xpath("//button[@data-balloon='Buy']"));
		//actions.moveToElement(buy);
		//actions.click();
		actions.build().perform();
	}

}
