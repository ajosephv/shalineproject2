package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landingpage {

	
	
	
	public WebDriver driver;
	
	@FindBy(css="a[href*='sign_in']") 
	WebElement login;
	@FindBy(css="#content > div > div > h2")
	WebElement title;
	
	@FindBy(css="#content > div > div > h2")
	WebElement getnavigator;
	
	
	
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



         public WebElement login() {
		   return login;
	}
	

         public WebElement title() {
		   return title;
	}

         public WebElement getnavigator() {
		   return getnavigator;
	}
	
	
}
