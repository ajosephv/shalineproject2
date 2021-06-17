package framework.E2etesting;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.landingpage;
import pageobjects.loginpage;
import resources.bclass;

public class testcases extends  bclass{
	public WebDriver driver;
	public static Logger log= Logger.getLogger(bclass.class.getName());
    @BeforeTest
    public void initialize() throws IOException
    {
    	driver=initializedriver();
    	driver.get(prop.getProperty("url"));
    }
	
	@Test
	
	public void basepagenavigation() throws IOException
	{
	
		landingpage lp=new landingpage(driver);
	lp.login().click();
	log.info("succesfully clicked");
	loginpage lop=new loginpage(driver);

	
	lop.email().sendKeys("shalinenew@gmail.com");
	lop.password().sendKeys("kasy@123");
	//compare the tetx from the actual value
	Assert.assertEquals(lp.title().getText(), "featured couses");
      lp.title().getText();
      log.info("title successfully verified");
	
}
	
	@AfterTest 
    public void teardown()
    
    {
		
		driver.close();
		
		
		
    }
}