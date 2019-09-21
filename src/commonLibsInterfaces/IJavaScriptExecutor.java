package commonLibsInterfaces;

import org.openqa.selenium.WebElement;

public interface IJavaScriptExecutor {
	
	public void executeJavaScript(String scriptToExecute) throws Exception;
	
	public void scrollDown(int x, int y) throws Exception;
	
	public String executeJavaScriptWithReturnValuew(String scriptToExecute) throws Exception;
	
	public void executeAsyncJavaScript(String scriptToExecute, Object[] args) throws Exception;
	
	public void ScrollinsideDiv(WebElement element) throws Exception;
	
	public void hover(WebElement element) throws Exception; 

	
	
}
