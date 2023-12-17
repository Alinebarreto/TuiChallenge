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
		

		
		
			//tap In Middle Of Screen
				//Scenario: User tap in the middle of the screen
		    		//Given I login to vodqa application using valid credentials
		    		//When I tap in the middle of the screen
		    		//Then I am able to move from "Samples List" page to next page

		
		//Native View - 
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='chainedView']")).click();	
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Slider - 
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='slider1']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Vertical Swiping - 
		//Scroll
			//Scenario: Validating scroll functionality using 2 points
				//Given I logged to vodqa application using valid credentials
		    	//When I scroll from one to another element point on the vertical swiping screen
		    	//Then Element text "Appium" should be visible
		
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='verticalSwipe']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		
		
		//Drag & Drop -
		  //Scenario: Validate that user is able to drag and drop
		    //Given I login to vodqa application using valid credentials
		    //When I drag the circle object to the drop target
		    //Then I am able to view "Circle dropped" message

		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='dragAndDrop']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Double Tap -
			//Scenario: Validate that user is able to double tap on an element
				//Given I login to vodqa application using valid credentials
				//When I double click on 'Double Tap Me'
		    	//Then I should be able see the message: 'Double tap successful!'
		
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='doubleTap']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Long Press - 
			//Scenario: Validate that user is able to long press on an element
		    	//Given I login to vodqa application using valid credentials
				//When I long press on element
		    	//Then long pressed popup 'you pressed me hard :P' should be visible

		
		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='longPress']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Long Press Me']")).click();
	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Photo View - open ok
		  	//Scenario: Validate that user is able to pinch and zoom on particular element
				//Given I login to vodqa application using valid credentials
				//Then I should be able to pinch and zoom in on an element
				//And I should be able to pinch and zoom out on an element

		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='photoView']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
		//Web View - open ok
		  	//Scenario: Validate context switching between native and web view context
				//Given I login to vodqa application using valid credentials
				//Then I am able to view hacker news login button inside webView section
		    	//And I am able to view section header by navigating inside native view section

		driver.findElement(By.className("android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='webView']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Back']")).click();
		
	
		
		
	}

}
