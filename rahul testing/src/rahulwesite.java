import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulwesite {
 public static void main(String[]args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/#/index");
	 driver.findElement(By.className("theme-btn")).click();
	 driver.findElement(By.id("user_name")).sendKeys("Mahesh N C");
	 driver.findElement(By.name("email")).sendKeys("maheshacs@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("Giri$h@234");
	 driver.findElement(By.cssSelector("input[name='allow_marketing_emails']")).click();
	 driver.findElement(By.cssSelector("input[class='button btn-primary col-10-xs p-v-2-xs p-h-5-xs m-v-3-xs']")).click();
	 
 } 
	}
