import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommpra1 {
@SuppressWarnings("deprecation")
public static <webElement> void main(String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	

	String[] itemNeeded = {"Cucumber", "Beetroot","Brocolli","Tomato"};
	int j=0;
	
	List<WebElement> products= driver.findElements(By.xpath("//div[@class='product']//h4[@class='product-name']"));
	for (int i=0; i<products.size(); i++)
	{
		String[] name = products.get(i).getText().split("-");
		String FormatedName = name[0].trim();
		List<String> itemneedlist  = Arrays.asList(itemNeeded);
		if (itemneedlist.contains(FormatedName))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action'] //button")).get(i).click();
			if ( j== itemNeeded.length)
			{
				break;
			}
				
		}
			
	}
	driver.findElement(By.xpath("//a[@class='cart-icon']//img")).click();
	driver.findElement(By.xpath("//div[@class='action-block']//button")).click();

	driver.findElement(By.xpath("//div[@class='promoWrapper']//input")).sendKeys("mahesh");
	driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.cssSelector("span.promoinfo")).getText());
	driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	
}
	
}

