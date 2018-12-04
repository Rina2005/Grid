package GridPractice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxGrid 
{

	
	
	public static void main(String[] args) throws MalformedURLException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		
		FirefoxBinary ffBinary = new FirefoxBinary(new File("C:\\Users\\rina.kumari\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		DesiredCapabilities cap=new DesiredCapabilities();
		FirefoxOptions f=new FirefoxOptions();
		cap.setCapability(f.FIREFOX_OPTIONS, f.setBinary(ffBinary));
		WebDriver driver = new FirefoxDriver(f);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
        
       
            
            
	}
}
