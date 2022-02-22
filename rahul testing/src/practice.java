import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Mahesh N C");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("nc.nageshacs@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("naaagu$h!@");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("1/07/1991");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		
		
	}

}
