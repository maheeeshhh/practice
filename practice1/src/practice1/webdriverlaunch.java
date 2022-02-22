package practice1;

public class webdriverlaunch {
public static void main(String[]args) {
	System.getProperty("webdriver.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
}
}
