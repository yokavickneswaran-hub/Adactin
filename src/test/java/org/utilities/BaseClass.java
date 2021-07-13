package org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

//	public static void loadUrl(String url) {
//		driver.get("https://adactinhotelapp.com/index.php");
//	}
	public void launch(String Url) {

		driver.get(Url);
	}

	public static void applyWaitToAllLocators() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void btnclick(WebElement element) {
		element.click();
	}

	public static void CloseBrowser() {
		driver.quit();
	}

	public static void urlAssertionForvalidLogin() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("check the url", url.contains("SearchHotel"));
	}

	public static void urlAssertionForInvalidLogin() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("check the url ", url.contains("index"));
	}

	public static void takesnap(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\yogav\\eclipse-workspace\\Adactin\\src\\test\\resources\\NewReport\\"+ filename +".png");
		FileUtils.copyFile(src, dest);
		
	}

}

//
//public static void urlAssertionForvalidLogin() {
//	WebElement afterlogin = driver.findElement(By.id("username_show"));
//	Assert.assertTrue("check the data ", afterlogin.isDisplayed());
//}
//
//public static void urlAssertionForInvalidLogin(WebElement element) {
//	WebElement invalid = driver.findElement(By.xpath("(//div[@class='auth_error'])"));
//	Assert.assertTrue("check the data ", invalid.isDisplayed());
//
//}