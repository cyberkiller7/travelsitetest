import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpTest {
	public static String mail="rj123553@gmail.com";
	public static String password = "123456778";
	public static WebDriver driver;
	public SignUpTest() throws InterruptedException{
		SetDriver obj = new SetDriver();
		driver= obj.driver;
		driver.navigate().to("https://phptravels.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("raj");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("sharma");
		WebElement mobileNumber = driver.findElement(By.name("phone"));
		mobileNumber.sendKeys("8055");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("8055");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("55444");
		WebElement confirmPassword = driver.findElement(By.name("confirmpassword"));
		confirmPassword.sendKeys("805566");
		driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")).click();
		Thread.sleep(500);
		if(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed()){
			System.out.println("Regex validator is working fine");
			this.SignUpPassTest();
		}
		Thread.sleep(1000);
	}
	
	void SignUpPassTest() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("raj");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.clear();
		lastName.sendKeys("sharma");
		WebElement mobileNumber = driver.findElement(By.name("phone"));
		mobileNumber.clear();
		mobileNumber.sendKeys("8052449900");
		WebElement email = driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys(mail);
		WebElement pass = driver.findElement(By.name("password"));
		pass.clear();
		pass.sendKeys(password);
		WebElement confirmPassword = driver.findElement(By.name("confirmpassword"));
		confirmPassword.clear();
		confirmPassword.sendKeys(password);
		driver.findElement(By.xpath("//div[8]")).click();
		Thread.sleep(3000);
		logout obj2 = new logout(driver);
		LoginTest obj1 = new LoginTest(driver);
	}
}
