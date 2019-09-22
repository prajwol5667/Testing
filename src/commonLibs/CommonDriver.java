package commonLibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonLibsInterfaces.IDriver;

public class CommonDriver implements IDriver {
	
	private WebDriver Driver;
	private long pageLoadTimeout;
	private long elementDetectionTimeout;
	
	public CommonDriver(String broswerType) throws Exception{
		
		pageLoadTimeout = 301;
		elementDetectionTimeout = 101;
		
		broswerType = broswerType.trim(); //remove white space from the end
		
		switch(broswerType.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\THE PRO\\Downloads\\chromedriver_win32\\chromedriver.exe"); // Set your driver path
			Driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.19.0-win64\\geckodriver.exe"); // set your driver path
			Driver = new FirefoxDriver();
			break;
			
		default:
			throw new Exception("Invalid BroserType -" +broswerType);
		}
	}
	
	public WebDriver getDriver() {
		return Driver;
	}

	@Override
	public void openBrowser(String Url) throws Exception {
		Url = Url.trim();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
		Driver.get(Url);
		
	}

	@Override
	public void closeBrowser() throws Exception {
		Driver.close();
		
	}

	@Override
	public void closeAllBrowser() throws Exception {
		Driver.quit();
		
	}

	@Override
	public void setPageLoadTimeout(long pageLoadTimeout) throws Exception {
		this.pageLoadTimeout = pageLoadTimeout;
		
	}

	@Override
	public void setElementDetectionTimeout(long elementDetectionTimeout) throws Exception {
		this.elementDetectionTimeout = elementDetectionTimeout;
		
	}

	@Override
	public String getTitle() throws Exception {
		return Driver.getTitle();
	}

	@Override
	public String getPageSource() throws Exception {
		return Driver.getPageSource();
	}

	@Override
	public String getCurrentUrl() throws Exception {
		return Driver.getCurrentUrl();
	}

	@Override
	public void navigateTo(String Url) throws Exception {
		 Driver.navigate().to(Url);
		
	}

	@Override
	public void navigateRefresh() throws Exception {
		Driver.navigate().refresh();
		
	}

	@Override
	public void navigateForward() throws Exception {
		Driver.navigate().forward();
		
	}

	@Override
	public void navigateBack() throws Exception {
		Driver.navigate().back();
		
	}

}
