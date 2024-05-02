package ganarality;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverFileUtility11 {
	public void MaximizeBrowserwindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void MinimizeBrowserwindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void waitforpageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void handledropdwon(WebElement element,int index) {
		Select s =new Select(element);
		s.selectByIndex(index);
	}
	public void handledropdwon(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void handledropdwon(String visibleText,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);}
	//action class
	public void mouseOverAction(WebDriver driver,WebElement element) {
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions a =new Actions(driver);
		a.contextClick(element).perform();
	}
	public void DoubleClick(WebDriver driver,WebElement element) {
		Actions a =new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement srcele,WebElement destele) {
		Actions a =new Actions(driver);
		a.dragAndDrop(srcele, destele).perform();
	}
	
	public void getscreenshot(WebDriver driver, String scrname) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\prava\\OneDrive\\Desktop\\scrnshots\\"+scrname+".png");
		try {
			Files.copy(src, dest);

		}
		catch (Exception e) 
		{
			e.getStackTrace();
			
		}
		
	}



}
