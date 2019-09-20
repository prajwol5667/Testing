package commonLibs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibsInterfaces.IDropDownControls;

public class DropDownControl implements IDropDownControls {

	@Override
	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		
	}

	@Override
	public void selectViaValue(WebElement element, String value) throws Exception {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}

	@Override
	public void selectViaIndex(WebElement element, int index) throws Exception {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}

	@Override
	public boolean isMultiple(WebElement element) throws Exception {
		Select select = new Select(element);
		return select.isMultiple();
	}

	@Override
	public List<WebElement> getAllOption(WebElement element) throws Exception {
		Select select = new Select(element);
		return select.getOptions();
	}

	@Override
	public List<WebElement> getAllSelectedOption(WebElement element) throws Exception {
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	@Override
	public WebElement getFirlstSelectedOption(WebElement element) throws Exception {
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

}
