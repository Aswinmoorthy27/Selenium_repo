package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTest {

	public void js() throws InterruptedException {

		// driver
		ChromeDriver driver = new ChromeDriver();

		// maximize
		driver.manage().window().maximize();

		// Url
		driver.get("https://qavalidation.com/demo-form/");

		// Webelements
		WebElement fullname = driver.findElement(By.id("g4072-fullname"));
		WebElement Email = driver.findElement(By.id("g4072-email"));
		WebElement Phonenumber = driver.findElement(By.id("g4072-phonenumber"));
		WebElement Submit = driver.findElement(By.xpath("//button[text()='Submit!']"));
		WebElement Radioactive = driver.findElement(By.xpath("//input[@value='4']"));
		WebElement Checkbox = driver.findElement(By.xpath("//input[@value='Automation testing']"));

		// JS Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Aswin';", fullname);
		js.executeScript("arguments[0].value='Aswin.moorthy@gmail.com';", Email);
		js.executeScript("arguments[0].value='9789189002';", Phonenumber);
		
                //Using JS Clicking Radioactive button
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", Radioactive);
		
	        //Using JS Clicking Checkbox button
		Thread.sleep(2000);	
		js.executeScript("arguments[0].click()", Checkbox);
		
		// scroll down
		js.executeScript("window.scrollBy(0,850)", "");

		// Thread
		Thread.sleep(2000);
		// scroll up
		js.executeScript("window.scrollBy(-0,-850)", "");

		// again scroll down
		js.executeScript("window.scrollBy(0,850)", "");

		// submit
		js.executeScript("arguments[0].click()", Submit);

	}

	public static void main(String[] args) throws InterruptedException {
		JavascriptExecutorTest Calljs = new JavascriptExecutorTest();
		Calljs.js();

	}

}
