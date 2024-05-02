package Pom.Swaglab.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ganarality.Baseclass;

public class Loginpage extends Baseclass{
	@FindBy(xpath="//input[@type='text']")private WebElement untxt;
	@FindBy(xpath="//input[@type='password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@type='submit']")private WebElement logbtn;
	public Loginpage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLogbtn() {
		return logbtn;
	}
	//business library
	public void LogintoApp(String un,String pwd) {
		untxt.sendKeys(un);
		pwdtxt.sendKeys(pwd);
		logbtn.click();
	}

}
