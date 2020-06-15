import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDriver {
	public static WebDriver driver;

	public SetDriver(){
	File file = new File("C:\\Users\\Devil\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	driver = new ChromeDriver();
	}
}
