package commonLibs;

import org.openqa.selenium.WebElement;

import commonLibsInterfaces.IWebElementControl;

public class WebElementControl implements IWebElementControl {

	@Override
	public void click(WebElement element) throws Exception {
		element.click();
		
	}

	@Override
	public String getText(WebElement element) throws Exception {
		return element.getText();
	}

	@Override
	public String getAttribute(WebElement element, String attributes) throws Exception {
		return element.getAttribute(attributes);
	}

	@Override
	public String getCssValue(WebElement element, String csspropertyName) throws Exception {
		return element.getCssValue(csspropertyName);
	}

	@Override
	public boolean isElementEnable(WebElement element) throws Exception {
		return element.isEnabled();
	}

	@Override
	public boolean isElementVisible(WebElement element) throws Exception {
		return element.isDisplayed();
	}

	@Override
	public boolean isElementSelected(WebElement element) throws Exception {
		return element.isSelected();
	}

}
