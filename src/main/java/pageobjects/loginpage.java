package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {

	
	
	
	public WebDriver driver;
	
	@FindBy(css="[type='email']")
	WebElement email;
	
	@FindBy(id="['user_password']")
	WebElement password;
	
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



         public WebElement email() {
		   return email;
	}
         public WebElement password() {
  		   return password;
  	}
	
	
	
	
}
