package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TestExample {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		//List<WebElement>links=driver.findElements(By.tagName("a"));
		
		//@FindBy(xpath="//input[@type='submit']")
		 //String text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")).getText();
		
		WebElement act=driver.findElement(By.xpath("//span[text()='My Account']"));
		act.click();
		Thread.sleep(5000);
		WebElement lgn=driver.findElement(By.xpath("//a[text()='Login']"));
		lgn.click();
		
				//@FindBy(xpath="//span[text()='My Account']")  
		


	}


}
