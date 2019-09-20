package RunFile;

import org.testng.annotations.Test;

public class ExecuteFile extends BaseScenarios{
	
	@Test()
	public void validSignup() throws Exception{
		//Case 1 : Register in website
		homepage.NavigateTosingin();
		Thread.sleep(3000);
		register.CutomerRegister();
		Thread.sleep(3000);
		
		//Case 2 : Buy 2 Items From 2 Different Categories, add them to card go to cart and then proceed checkout,choose check payment option
		homepage.NavigateHome();

		Thread.sleep(5000);
		buy.addtocard();
		
	}

}
