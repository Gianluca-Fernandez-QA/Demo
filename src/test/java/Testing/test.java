package Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	String user = "0009";
	String pass = "0009";
	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\The_Demo_site\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void UserCreation() throws InterruptedException {
		driver.manage().window();
		driver.get("http://thedemosite.co.uk/addauser.php");
		fullscreen();
		WebElement target = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		target.sendKeys(user);
		WebElement target2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		target2.sendKeys(pass);
		WebElement target3 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		target3.click();
		fullscreen();
		Thread.sleep(12000);
		UserLogin();
	}
	
	
	public void UserLogin() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/login.php");
		fullscreen();
		WebElement target = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		target.sendKeys(user);
		WebElement target2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		target2.sendKeys(pass);
		WebElement target3 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		target3.click();
		fullscreen();
		Thread.sleep(12000);
		
	}
	
	public void fullscreen() {
		driver.manage().window().fullscreen();
	}

}
