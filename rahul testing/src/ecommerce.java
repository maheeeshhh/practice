import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ecommerce {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();


driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
String [] itemsneeded= {"Tomato","Beetroot","Brocolli"};
int j=0;
List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']//h4[@class='product-name']"));
for( int i=0; i<products.size(); i++)
{
	String [] name= products.get(i).getText().split("-");
	String Formatedname= name[0].trim();
	List<String> itemsneededlist= Arrays.asList(itemsneeded);
	
	if(itemsneededlist.contains(Formatedname))
		Thread.sleep(1000);
	
	{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action'] //button")).get(i).click();
		if(j==itemsneeded.length)
		{
			break;
		}
		
	}
			
		
	
	
}




}
}
