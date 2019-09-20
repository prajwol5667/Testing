package commonLibsInterfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropDownControls {
	
	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception;
	public void selectViaValue(WebElement element, String value) throws Exception;
	public void selectViaIndex(WebElement element, int index) throws Exception;
	public boolean isMultiple(WebElement element) throws Exception;
	public List<WebElement> getAllOption(WebElement element) throws Exception;
	public List<WebElement> getAllSelectedOption(WebElement element) throws Exception;
	public WebElement getFirlstSelectedOption(WebElement element) throws Exception;

}
