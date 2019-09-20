package RunFile;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commonLibs.CommonDriver;
import supportFile.BuyItem;
import supportFile.Homepage;
import supportFile.Register;


public class BaseScenarios {
	
	CommonDriver cmnDriver;
	String url = "http://automationpractice.com/";
	Homepage homepage;
	Register register;
	BuyItem buy;
	
	
	@BeforeMethod
	public void setup() throws Exception{
		cmnDriver = new CommonDriver("chrome"); // choose chrome or firefox
		homepage = new Homepage(cmnDriver.getDriver());
		register = new Register(cmnDriver.getDriver());
		buy = new BuyItem(cmnDriver.getDriver());
		cmnDriver.openBrowser(url);
		
	}
	
	
	@AfterMethod
		public void close() throws Exception{
		cmnDriver.closeAllBrowser();
	}

}
