package GridPractice;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		
		/*// Define desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//Chrome Options definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		
		
		
		
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		cap.setCapability("marionette", false);
		
		String hubUrl = "http://10.10.12.40:4444/wd/hub";
		//WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);// for chrome 
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap);// for firefox 
		
		
*/		
		
		
		/*FirefoxOptions firefoxOptions = new FirefoxOptions();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.merge(desiredcapabilities);
        capabilities.setPlatform(Platform.ANY);
        capabilities.setBrowserName("firefox");
        firefoxOptions.merge(capabilities);*/
		
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		//cap.setCapability("ignoreZoomSetting", true);
		cap.setPlatform(Platform.WINDOWS);
		
		cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.freecrm.com");
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true); 
			 

		
        String hubUrl = "http://10.10.12.40:4444/wd/hub";

        
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cap);
		
		//driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
