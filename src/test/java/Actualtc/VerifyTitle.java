package Actualtc;

import org.testng.Assert;
import org.testng.annotations.Test;

import vtigergeneric.Baseclass;



public class VerifyTitle extends Baseclass{
@Test
public void verifyTitlke() {
	String et="Swag Labs";
	String at=driver.getTitle();
	Assert.assertEquals(et,at,"both are not matching");
	
}
}
