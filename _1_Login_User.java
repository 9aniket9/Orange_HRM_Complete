package ORANGE_HRM_COMPLETE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _1_Login_User {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
		username.click();
		username.sendKeys("Admin");
		WebElement password=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
		password.click();
		password.sendKeys("admin123");
		WebElement Login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		Login.click();
	}

}
