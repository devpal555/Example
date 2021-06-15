package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(1000);
		driver.findElement(By.id("//*[@id=\'fromCity\']")).clear();
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("//input[@value='Delhi']")).sendKeys("mum");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Delhi']")).sendKeys(Keys.ENTER);*/
		}

}
