package pageobjects;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import test.ShalineAutomation.ChromeDriver;
import test.ShalineAutomation.WebDriver;
import test.ShalineAutomation.WebElement;

public class brokelinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		SoftAssert as=new SoftAssert();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List <WebElement>Links	=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(org.openqa.selenium.WebElement link;links)
		{
		String att	=link.getAttribute("href");
			URL u=new URL(att);
			HttpURLConnection hp=(HttpURLConnection)u.openConnection();
			hp.setRequestMethod("Head");
			hp.connect();
			hp.getResponseCode();
			
		}
		
	}
}
