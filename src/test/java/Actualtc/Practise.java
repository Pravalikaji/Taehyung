package Actualtc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise {
	@Test
	public void tc() {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.swaglabs.com");
		
	}
}
