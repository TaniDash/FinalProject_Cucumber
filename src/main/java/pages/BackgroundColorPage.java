package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.Color;


public class BackgroundColorPage {

	WebDriver driver;
	 
	public BackgroundColorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//button[text()='Set SkyBlue Background']") WebElement SetSkyBlueBackgroundElement;
	@FindBy(how=How.XPATH, using="//button[text()='Set White Background']") WebElement SetWhiteBackgroundElement;
	@FindBy(how=How.XPATH, using="//body[@style='background-color: skyblue;']") WebElement skyBlueBackgroundColorElement;
	@FindBy(how=How.XPATH, using="//body[@style='background-color: white;']") WebElement whiteBackgroundColorElement;
	
	
	
	public void checkSetSkyBlueButton() {
		boolean b= SetSkyBlueBackgroundElement.isDisplayed();
		Assert.assertEquals("The button doesn't exist!", true, b);
	}
	
	public void checkSetWhiteButton() {
		boolean b= SetWhiteBackgroundElement.isDisplayed();
		Assert.assertEquals("The button doesn't exist!", true, b);
	}
	
	
	public void clickSetSkyBLueBackgroundButton() {
		SetSkyBlueBackgroundElement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void clickSetWhiteBackgroundButton() {
		SetWhiteBackgroundElement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void checkSkyBlueBackGroundColor() {
		String expectedColor = "#87ceeb";
		String bodycolor= skyBlueBackgroundColorElement.getCssValue("background-color");
		System.out.println(bodycolor);
		
		String hexColor= Color.fromString(bodycolor).asHex();
		String actualColor= hexColor;
		System.out.println(hexColor);
		
		Assert.assertEquals(expectedColor, actualColor );
		
	}
	
	public void checkWhiteBackGroundColor() {
		String expectedColor = "#ffffff";
		String bodycolor= whiteBackgroundColorElement.getCssValue("background-color");
		System.out.println(bodycolor);
		
		String hexColor= Color.fromString(bodycolor).asHex();
		String actualColor= hexColor;
		System.out.println(hexColor);
		
		Assert.assertEquals(expectedColor, actualColor );
		
//		String Locator= driver.findElement(By.tagName("body")).getCssValue("background-color: white");
		
//		rgba(255, 255, 255, 1)
//#ffffff
		
	}
	
	
}



