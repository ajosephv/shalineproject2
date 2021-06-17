package pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.ShalineAutomation.ChromeDriver;
import test.ShalineAutomation.WebDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver=new Chromedriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> win	=driver.getWindowHandles();
		Iterator<String> is	=win.iterator();
	String parent	=is.next();
	String child	=is.next();
	driver.switchTo().window(child);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	driver.findElement(By.cssSelector(".im-para.red")).getText();
	
	
	
		
		
	}

}
