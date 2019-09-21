package supportFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.JavaScriptExecutor;
import commonLibs.WebElementControl;

public class Homepage {
	
	@FindBy(className="login")
	private WebElement Signin;
	
	@FindBy(xpath="//ul[@class='footer_links clearfix']/li")
	private WebElement navhome;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]")
	private WebElement Tshirt;
	
	
	private WebElementControl element;
	private JavaScriptExecutor executor;
	
	public Homepage(WebDriver Driver) {
		element = new WebElementControl();
		executor = new JavaScriptExecutor(Driver);
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
	}
	
	public void ScrollDown() throws Exception{
		Thread.sleep(2000);
		executor.scrollDown(0, 1000);	
	}
	
	public void ScrollUp() throws Exception{
		Thread.sleep(2000);
		executor.scrollDown(0, -1000);
	}
	
	public void NavigateTshirt() throws Exception{
		element.click(Tshirt);
	}
	
	
	
	

}
