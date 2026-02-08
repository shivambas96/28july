package testingbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary {
	
	@Test
	public void LaunchUrl() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
	}

}
