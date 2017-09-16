package googletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
 public  WebDriver wd;
	@Test 
	public  void takescreenshot() throws IOException
	{
	wd=new FirefoxDriver();
	 wd.get("https://www.google.co.in/");
	File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\seleniumworkspace1\\googletest\\screenshot\\gogle.jpg"));
	
	}
}
