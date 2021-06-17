package pageobjects;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.ShalineAutomation.ChromeDriver;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	Wait<WebDriver> w= new FluentWait <WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
	w.until(new Function<WebDriver, WebElement>(){

		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			
			
			if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
					{
				return (WebElement)driver.findElement(By.cssSelector("div[id='finish'] h4"));
					}
			
			else
			return null;
		}
		});
	
	System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
}}
