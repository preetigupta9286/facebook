package facebook.base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import facebook.utilities.Utilities;

public class Facebook_BaseClass {
	
public static WebDriver driver;	
public static Properties prop;
public static Utilities util;
public  static EventFiringWebDriver e_driver;

public Facebook_BaseClass() {
	try{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\surbh\\eclipse-workspace\\facebook\\src\\main\\java\\facebook\\properties\\properties");  
		prop.load(ip);
		}
		catch(FileNotFoundException e) { //two exception can be found.  1)file not found
		e.printStackTrace();
		}
		catch(IOException e)   //2)cant read input/output
		{e.printStackTrace();
		}}
	    public static void initialization(){
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")){
		System.setProperty("webdrive.chrome.driver","C:/Users/surbh/Downloads/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\surbh\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
//		e_driver = new EventFiringWebDriver(driver);
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.register(eventListener);
//		driver = e_driver;
		
		try {
			util.takeScreenshotAtEndOfTest();
		} catch (IOException e) {
			e.printStackTrace();}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(util.page_load, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(util.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
		
}