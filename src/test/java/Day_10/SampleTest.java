package Day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver;
	ChromeOptions options;
	String url = "https://www.amazon.com/";
	//WebDriver driver1 = new ChromeDriver();
	
	@Test(priority =1)
	public void before_test()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\eclipse-workspace\\SDET102_Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");

		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
        driver.get(url);
	}	
	@Test(priority=2)
    public void test1()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Diamond Painting");
	}

}

