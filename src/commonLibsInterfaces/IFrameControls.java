package commonLibsInterfaces;

import org.openqa.selenium.WebElement;

public interface IFrameControls {
	
	public void switchToFrame(String frameID) throws Exception;
	
	public void switchToFrame(WebElement element) throws Exception;
	
	public void switchToFrame(int index) throws Exception;
	
	public void switchToDefaultContent() throws Exception;
}
