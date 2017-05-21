package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CLass1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("ankit03");
		driver.findElement(By.name("txtPassword")).sendKeys("abcd1234");
		driver.findElement(By.name("Submit")).click();
	}
}
