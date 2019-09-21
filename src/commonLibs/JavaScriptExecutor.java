package commonLibs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import commonLibsInterfaces.IJavaScriptExecutor;

public class JavaScriptExecutor implements IJavaScriptExecutor{
	
	private WebDriver Driver;
	public JavaScriptExecutor(WebDriver Driver) {
		this.Driver=Driver;
	}

	@Override
	public void executeJavaScript(String scriptToExecute) throws Exception {
		
		JavascriptExecutor jsEngine = (JavascriptExecutor)Driver;
		jsEngine.executeScript(scriptToExecute);
		
		
	}

	@Override
	public void scrollDown(int x, int y) throws Exception {
		JavascriptExecutor jsEngine = (JavascriptExecutor)Driver;
		String jsCommand = String.format("window.scrollBy(%d,%d)",x,y);
		jsEngine.executeScript(jsCommand);
		
	}

	@Override
	public String executeJavaScriptWithReturnValuew(String scriptToExecute) throws Exception {
		JavascriptExecutor jsEngine = (JavascriptExecutor)Driver;
		return jsEngine.executeScript(scriptToExecute).toString();
	}

	@Override
	public void executeAsyncJavaScript(String scriptToExecute, Object[] args) throws Exception {
		JavascriptExecutor jsEngine = (JavascriptExecutor)Driver;
		if(args == null) {
			jsEngine.executeScript(scriptToExecute);
		}
		else {
		jsEngine.executeAsyncScript(scriptToExecute,args);
		}
	}
	
	@Override
	public void ScrollinsideDiv(WebElement element) throws Exception {
		JavascriptExecutor jsEngine = (JavascriptExecutor)Driver;
		jsEngine.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}

	@Override
	public void hover(WebElement element) throws Exception {
		Actions act = new Actions(Driver);
		act.moveToElement(element).build().perform();
		
	}

}
