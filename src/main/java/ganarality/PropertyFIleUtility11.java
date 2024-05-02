package ganarality;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFIleUtility11 {
	public String rfeadDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fisp=new FileInputStream("C:\\Users\\prava\\eclipse-workspace\\HybridframeWork\\src\\test\\resources\\labs.properties");
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty( key);
		
	}

}
