package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	
	@FindBy(xpath="//input[@icon='search']") private WebElement searchStocks;
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement dashboard;
	@FindBy(xpath="//span[text()='Orders']") private WebElement orders;
	@FindBy(xpath="//span[text()='Holdings']") private WebElement holdings;
	@FindBy(xpath="//span[text()='Positions']") private WebElement positions;
	@FindBy(xpath="//span[text()='Funds']") private WebElement funds;
	@FindBy(xpath="//span[text()='Apps']") private WebElement apps;
	@FindBy(xpath="//span[text()='OKP335']") private WebElement userInfo;
	@FindBy(xpath="(//span[text()='View statement'])[1]") private WebElement viewStatement;
	
	
	public ZerodhaHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterStockName(String stock) {
		searchStocks.sendKeys(stock);
	}
	public void clickOnDashboard() {
		dashboard.click();
	}
	public void clickOnOrders() {
		orders.click();
	}
	public void clickOnHoldings() {
		holdings.click();
	}
	public void clickOnPositions() {
		positions.click();
	}
	public void clickOnFunds() {
		funds.click();
	}
	public void clickOnApps() {
		apps.click();
	}
	public void clickOnUserInfo() {
		userInfo.click();
	}
	public void clickOnViewStatments() {
		viewStatement.click();
	}
	
	
	
	
	
	
	
	
	

}
