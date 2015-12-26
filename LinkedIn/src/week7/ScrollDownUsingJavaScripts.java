package week7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollDownUsingJavaScripts {
	
	public static void main(String[] args) {
		
		RemoteWebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, 1500);");
		
		System.out.println(driver.getCapabilities().getBrowserName());
		System.out.println(driver.getCapabilities().getVersion());
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@ng-click='loadNextPage(m)']")));
		
		
		Dimension dim = new Dimension(200, 400);
		driver.manage().window().setSize(dim);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
