package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver chromeBrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Update\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();//help us download chrome exe automatically
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		return driver;
		}

}
