package Basefile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basefile {

	 static public ChromeDriver driver;
	
	@BeforeSuite
	public void test1()
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void launch()
	{
		driver.get("https://dev.globalu.com");
	}
	
	
	public static WebElement waitForElementToBeClickable(WebElement webelement, WebDriver driver, int seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));
		return element;

	}

	public static WebElement waitForElementToBeVisible(WebElement webelement, WebDriver driver, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webelement));
		return element;
	}
	public static List<WebElement> waitForElementToBeVisible1(List<WebElement> ele, WebDriver driver2, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		List<WebElement> element = wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		return element;
		
	}
	
	public static List<WebElement> waitForElementsWithText(WebDriver driver, String searchText, int seconds) {
	    WebDriverWait wait = new WebDriverWait(driver, seconds);
	    return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='" + searchText + "']")));
	}
	
	public void mousehower(WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();//when we need to perform sigle actions then used .perform
		
		
	}
	public void scrollPage(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }
	
	public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	public void clickGetHiddenBehind(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);	
	}
}
