import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static void main(String[] args) {
		// 
    WebDriver driver = new InternetExplorerDriver();
    driver.get("http://google.com");

	}

}
