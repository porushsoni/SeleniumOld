import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClassExample {

	public static String browser = "chrome";
	public static WebDriver driver;
	
	public static void main(String[] args) {

		if (browser.equals("chrome"))
		    {
		driver = new ChromeDriver();	
		    }
		else if (browser.equals("firefox"))
		    {
		driver = new FirefoxDriver();	
		    }
		
     //   System.setProperty("webdriver.gecko.driver","D:\\Test Automation\\Selenium\\Way2Automation\\Executables\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		/*driver.close();
		driver.quit();
		*/
		
		
		

		
		
	                                       }

                             }
