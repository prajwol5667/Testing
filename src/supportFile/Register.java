package supportFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.DropDownControl;
import commonLibs.TextboxControl;
import commonLibs.WebElementControl;

public class Register {
	
	@FindBy(id="email_create")
	private WebElement EmailEnter;
	
	@FindBy(id="SubmitCreate")
	private WebElement CreateAcBtn;
	
	@FindBy(id="id_gender1")
	private WebElement Gender;
	
	@FindBy(id="customer_firstname")
	private WebElement FirstName;
	
	@FindBy(id="customer_lastname")
	private WebElement LastName;
	
	@FindBy(id="passwd")
	private WebElement Psw;
	
	@FindBy(id="days")
	private WebElement Day;
	
	@FindBy(id="months")
	private WebElement Month;
	
	@FindBy(id="years")
	private WebElement Year;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="firstname")
	private WebElement U_firstname;
	
	@FindBy(id="lastname")
	private WebElement U_lastname;
	
	@FindBy(id="postcode")
	private WebElement PostalCode;
	
	@FindBy(id="phone_mobile")
	private WebElement mobile;
	
	@FindBy(id="submitAccount")
	private WebElement Submit;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	private WebElementControl element;
	private TextboxControl textbox;
	private DropDownControl dropdown;
	
	public Register(WebDriver Driver) {
		element = new WebElementControl();
		textbox = new TextboxControl();
		dropdown = new DropDownControl();
		PageFactory.initElements(Driver, this);		
	}
	
	public void CutomerRegister() throws Exception {
		textbox.setText(EmailEnter, "prajwol" + System.currentTimeMillis()/20000 +"@gmail.com");
		element.click(CreateAcBtn);
		Thread.sleep(2000);
		element.click(Gender);
		textbox.setText(FirstName, "Prajwol");
		textbox.setText(LastName, "Shakya");
		textbox.setText(Psw, "Welcome1");
		dropdown.selectViaValue(Day, "5");
		dropdown.selectViaValue(Month,"4");
		dropdown.selectViaValue(Year, "1995");
		textbox.setText(U_firstname, "Prajwol");
		textbox.setText(U_lastname, "Shakya");
		textbox.setText(address, "Basantapur");
		textbox.setText(city, "Kathmandu");
		dropdown.selectViaValue(state, "5");
		textbox.setText(PostalCode, "00000");
		textbox.setText(mobile, "9849304516");
		element.click(Submit);
		
		
	}
	

}
