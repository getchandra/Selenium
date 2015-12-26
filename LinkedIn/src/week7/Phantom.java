package week7;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phantom {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("phantomjs.binary.path", "./lib/phantomjs.exe");
		RemoteWebDriver driver = new PhantomJSDriver();
		
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/register.do?click=true");
		
		File snap = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File("C:\\images\\irctc1.jpeg"));
		
		
		
	}

}
