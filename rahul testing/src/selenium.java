import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[]args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		
	WebDriver driver =	new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
			}

}
