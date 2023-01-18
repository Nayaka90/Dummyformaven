package testscript;

import org.testng.annotations.Test;

public class ConfigureExamples {
	@Test
	public void test2() {
		String url = System.getProperty("url");
		String browser=System.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
		
		
	}

}
