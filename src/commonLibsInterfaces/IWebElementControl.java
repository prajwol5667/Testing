package commonLibsInterfaces;

import org.openqa.selenium.WebElement;

public interface IWebElementControl {
	
	public void click(WebElement element) throws Exception;
	
	public String getText(WebElement element) throws Exception;

	public String getAttribute(WebElement element, String attributes) throws Exception;
	
	public String getCssValue(WebElement element, String csspropertyName) throws Exception;
	
	public boolean isElementEnable(WebElement element) throws Exception;
	
	public boolean isElementVisible(WebElement element) throws Exception;
	
	public boolean isElementSelected(WebElement element) throws Exception;

}
