import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.className("login-btn")).click();
		driver.findElement(By.id("user_name")).sendKeys("maheh N C");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nc.maheshacs@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Giri$h@789");
		
	}
}
