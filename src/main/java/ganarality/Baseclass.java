package ganarality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Pom.Swaglab.pomclasses.Loginpage;


public class Baseclass {
	public PropertyFIleUtility11 pu1=new PropertyFIleUtility11();
	public ExcelFileUtility eu1=new ExcelFileUtility();
	public JavaFileUtility ju=new JavaFileUtility();
	public WebDriverFileUtility11 wu=new WebDriverFileUtility11();
	public WebDriver driver=null;
	@BeforeSuite
	public void bsconfig() {
		System.out.println("===DB CONNECTION===");
	}
	@AfterSuite
	public void acconfig() {
		System.out.println("==DB DISCONNECTION===");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER=pu1.rfeadDataFromPropertyFile("browser");
		String URL=pu1.rfeadDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("edge driver is launched ");
		}else if(BROWSER.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
			System.out.println("chrome driver is launched");
		}else {
			System.out.println("invalid browser name");

		} 
				
		
		driver.get(URL);
		wu.MaximizeBrowserwindow(driver);
		wu.MinimizeBrowserwindow(driver);
		wu.getscreenshot(driver,"login");
	}
	@AfterClass
	public void terDown() {
		driver.quit();
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN=pu1.rfeadDataFromPropertyFile("uname");
		String PWD=pu1.rfeadDataFromPropertyFile("pswd");
		Loginpage lp=new Loginpage(driver);
		lp.LogintoApp(UN, PWD);
		wu.getscreenshot(driver, "Homepage");
	}
	@AfterMethod
	public void amconfig() {
		System.out.println("Logout from app");
	}

}
