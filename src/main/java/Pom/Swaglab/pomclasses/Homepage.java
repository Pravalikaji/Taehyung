package Pom.Swaglab.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ganarality.Baseclass;

public class Homepage extends Baseclass {
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement backpacktxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement tshirttxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement bikelighttxt;
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement jackettxx;
	public  Homepage (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getBackpacktxt() {
		return backpacktxt;
	}
	public WebElement getTshirttxt() {
		return tshirttxt;
	}
	public WebElement getBikelighttxt() {
		return bikelighttxt;
	}
	public WebElement getJackettxx() {
		return jackettxx;
	}
	public void backPack() {
		backpacktxt.click();
	}
	public void tShirt() {
			tshirttxt.click();
}
	public void bikeLight() {
		bikelighttxt.click();
	}public void jacket() {
		jackettxx.click();
	}

}
