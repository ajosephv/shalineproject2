package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bclass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException	
	{
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aarun\\eclipse-workspaceArun1\\E2etesting\\src\\main\\java\\resources\\data");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		prop.getProperty("url");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	     if(browsername.equals("IE"))

	     {
	    //	 WebDriverManager.iedriver().setup();
	 		//driver=new ieDriver();
	     }
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	     
	     
	     
	     
	}
	}


