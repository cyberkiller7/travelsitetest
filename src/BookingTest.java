import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingTest {
	public BookingTest(WebDriver driver) throws InterruptedException{
		driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner header.header-main.header-mobile-menu.with-absolute-navbar:nth-child(1) div.header-nav div.container-fluid div.navbar-wrapper div.navbar.navbar-expand-lg div.collapse.navbar-collapse.o2.fe nav.main-nav-menu.main-menu-nav.navbar-arrow ul.main-nav:nth-child(1) li:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).sendKeys("delhi");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.select2-drop.select2-display-none.select2-with-searchbox.select2-drop-active ul.select2-results li.select2-results-dept-0.select2-result.select2-result-unselectable.select2-result-with-children ul.select2-result-sub li.select2-results-dept-1.select2-result.select2-result-selectable.select2-highlighted:nth-child(1) > div.select2-result-label")).click();
		Thread.sleep(500);
		driver.findElement(By.name("checkin")).clear();
		driver.findElement(By.name("checkin")).sendKeys("20-06-2020");
		driver.findElement(By.name("checkout")).clear();
		driver.findElement(By.name("checkout")).sendKeys("21-06-2020");
		driver.findElement(By.name("children")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/button[1]")).click();
		System.out.println("search functionality is working");
	}
}
