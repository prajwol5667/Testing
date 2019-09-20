package supportFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.DropDownControl;
import commonLibs.JavaScripExecutor;
import commonLibs.TextboxControl;
import commonLibs.WebElementControl;

public class BuyItem {
	
	@FindBy(tagName="Printed Dress")
	private WebElement printedDress;
	
	
	private WebElementControl element;
	private TextboxControl textbox;
	private DropDownControl dropdown;
	private JavaScripExecutor executor;
	
	public BuyItem(WebDriver Driver) {
		element = new WebElementControl();
		textbox = new TextboxControl();
		executor = new JavaScripExecutor();
		PageFactory.initElements(Driver, this);	
	}
	
	public void addtocard() throws Exception{
		executor.hoverAndClick(printedDress);
		Thread.sleep(6000);
	}
}
