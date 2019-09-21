package supportFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.DropDownControl;
import commonLibs.JavaScriptExecutor;
import commonLibs.TextboxControl;
import commonLibs.WebElementControl;

public class BuyItem {
	
	@FindBy(tagName="Printed Dress")
	private WebElement printedDress;
	
	@FindBy(xpath="//div[@id=\"center_column\"]//ul[@class=\"product_list grid row\"]/li[1]")
	private WebElement Item;
	
	@FindBy(xpath="//div[@id=\"center_column\"]//ul[@class=\"product_list grid row\"]/li[1]//div[@class=\"right-block\"]//div[@class=\"button-container\"]/a[1]")
	private WebElement AddtocartItem;
	
	@FindBy(xpath="//div[@class=\"layer_cart_cart col-xs-12 col-md-6\"]//div[4]/span")
	private WebElement CountinueShoping;
	
	@FindBy(xpath="//div[@class=\"layer_cart_cart col-xs-12 col-md-6\"]//div[4]/a/span")
	private WebElement checkout;
	
	@FindBy(xpath="//p[@class=\"cart_navigation clearfix\"]/a/span")
	private WebElement proceedCheckout;
	
	@FindBy(xpath="//p[@class=\"cart_navigation clearfix\"]/button/span")
	private WebElement preceedCheckout2;
	
	@FindBy(xpath="//span[@id=\"total_price\"]")
	private WebElement TotalAmount;
	
	@FindBy(id="cgv")
	private WebElement Terms;
	
	@FindBy(className="bankwire")
	private WebElement PaymentMethod;
	
	@FindBy(xpath="//p[@id='cart_navigation']/button/span")
	private WebElement Confirm;
	
	private WebElementControl element;
	private TextboxControl textbox;
	private DropDownControl dropdown;
	private JavaScriptExecutor executor;
	
	public BuyItem(WebDriver Driver) {
		element = new WebElementControl();
		textbox = new TextboxControl();
		executor = new JavaScriptExecutor(Driver);
		PageFactory.initElements(Driver, this);	
	}
	
	public void addtocardFirstItem() throws Exception{  //add to cart first item
		executor.hover(Item);   //hover over the iteam
		Thread.sleep(1000);
		element.click(AddtocartItem);  //click to add to cart
		Thread.sleep(1000);
		element.click(CountinueShoping);
	}
	
	public void addtocardSecondItem() throws Exception{ // add to cart second item
		executor.hover(Item);  //hover over the iteam
		Thread.sleep(1000);
		element.click(AddtocartItem);  //click to add to cart
	}
	
	public void Checkout() throws Exception{ // checkout items
		element.click(checkout);  // click on checkout
		Thread.sleep(1000);
		element.click(proceedCheckout);   //click on proceed button
		element.click(preceedCheckout2);  //click on proceed button
		element.click(Terms); 				//terms checked 
		element.click(preceedCheckout2);  //click on proceed button
		element.click(PaymentMethod);     //Selected payment method
		element.click(Confirm);	// confirm order
		System.out.println("Checkout success ");
	}
}
