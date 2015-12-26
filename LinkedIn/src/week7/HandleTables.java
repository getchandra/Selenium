package week7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleTables {
	
	public static void main(String[] args) {
		
		RemoteWebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/tables");
		
		WebElement table1 = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[1]"));
		
		System.out.println(table1.findElements(By.tagName("td")).size());
		
		List<WebElement> cells = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr[1]/td"));
		System.out.println(cells.get(2).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
