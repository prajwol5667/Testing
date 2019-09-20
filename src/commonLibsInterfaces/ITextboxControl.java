package commonLibsInterfaces;

import org.openqa.selenium.WebElement;

public interface ITextboxControl {
	
	public void setText(WebElement element, String textToSet) throws Exception;
	
	public void clearText(WebElement element) throws Exception;

}
