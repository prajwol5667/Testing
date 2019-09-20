package supportFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.JavaScripExecutor;
import commonLibs.WebElementControl;

public class Homepage {
	
	@FindBy(className="login")
	private WebElement Signin;
	
	@FindBy(xpath="//ul[@class='footer_links clearfix']/li")
	private WebElement navhome;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]")
	private WebElement Dresses;
	
	private WebElementControl element;
	private JavaScripExecutor executor;
	
	public Homepage(WebDriver Driver) {
		element = new WebElementControl();
		executor = new JavaScripExecutor();
		PageFactory.initElements(Driver, this);	
	}


	public void NavigateTosingin() throws Exception {
		element.click(Signin);
		
	}
	
	public void NavigateHome() throws Exception{
		element.click(navhome);
	}
	
	public void NavigateDress() throws Exception{
		element.click(Dresses);
		Thread.sleep(4000);
		executor.scrollDown(0, 50);	
	}
	
	
	

}
