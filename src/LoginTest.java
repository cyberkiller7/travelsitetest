import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest{
	public LoginTest(WebDriver driver) throws InterruptedException{
		String mail = SignUpTest.mail;
		String pass = SignUpTest.password;
		WebDriver drvr = driver;
		drvr.findElement(By.name("username")).sendKeys(mail);
		drvr.findElement(By.name("password")).sendKeys(pass);
		drvr.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']")).click();
		System.out.println("Login done");
		//Thread.sleep(1500);
		BookingTest obj = new BookingTest(driver);
		Thread.sleep(3000);
		logout obj1 = new logout(driver);
		driver.close();
	}
}
