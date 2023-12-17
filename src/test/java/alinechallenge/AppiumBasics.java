package alinechallenge;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest{
	
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		

		//Native View - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='chainedView']")).click();	
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Slider - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='slider1']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Vertical Swiping - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='verticalSwipe']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Drag & Drop - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='dragAndDrop']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Double Tap - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='doubleTap']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Long Press - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='longPress']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Long Press Me']")).click();
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Photo View - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='photoView']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Web View - open ok
		//driver.findElement(By.className("android.widget.TextView")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='webView']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		

		
		
		
	}

}
