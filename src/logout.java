import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
	public logout(WebDriver driver){
	WebDriver drvr = driver;
	drvr.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']")).click();
	drvr.findElement(By.linkText("Logout")).click();
	System.out.println("the person has been logged out");
}
	
}
