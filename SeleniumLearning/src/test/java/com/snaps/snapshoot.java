package com.snaps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class snapshoot {

	public void snap() throws IOException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();

		File Source = driver.getScreenshotAs(OutputType.FILE);
		File Des = new File("./Snaps/screenshot.png");
		FileUtils.copyFile(Source, Des);

	}

	public static void main(String[] args) throws IOException {
		
		snapshoot snapcall=new snapshoot();
		snapcall.snap();
		

	}
}
