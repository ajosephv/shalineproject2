package framework.E2etesting;

import static org.testng.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.logging.*;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobjects.landingpage;
import pageobjects.loginpage;
import resources.bclass;

public class validatenavigator extends  bclass{
	public WebDriver driver;
	public static Logger log= Logger.getLogger(bclass.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializedriver();
		driver.get(prop.getProperty("browser"));
		log.info("driver is succesfully initialised");
	}
	
	@Test
	
	public void basepagenavigation() throws IOException
	{
	
	landingpage lp=new landingpage(driver);
	lp.login().click();
	log.info("clicked login succesfully");
	Assert.assertEquals(lp.title().getText(), "featured couses");
      lp.title().getText();
      Assert.assertTrue(lp.getnavigator().isDisplayed());
      log.info("succesfully validated text message");
	}
      
	@AfterTest 
    public void teardown()
    
    {
		
		driver.close();
		
		
		
    }
}