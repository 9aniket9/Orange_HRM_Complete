package ORANGE_HRM_COMPLETE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _2_Add_a_User {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement username = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
		username.click();
		username.sendKeys("Admin");
		WebElement password = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
		password.click();
		password.sendKeys("admin123");
		WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		Login.click();
		WebElement Admin = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Admin']")));
		Admin.click();
		WebElement Add = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']")));
		Add.click();
		WebElement UserRole = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'-- Select --')])[1]")));
		UserRole.click();
		Actions ac = new Actions(driver);
		for (int i = 1; i <= 1; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		WebElement Status = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'-- Select --')])[1]")));
		Status.click();
		for (int i = 1; i <= 1; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		WebElement Username=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@autocomplete='off'])[1]")));
		Username.click();
		Username.sendKeys("OrangeHRM_New");
		WebElement Password=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='password'])[1]")));
		Password.click();
		Password.sendKeys("OrangeHRM123");
		WebElement ConfirmPass=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='password'])[2]")));
		ConfirmPass.click();
		ConfirmPass.sendKeys("OrangeHRM123");
		WebElement EmployeeName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type for hints...']")));
		EmployeeName.click();
		EmployeeName.sendKeys("a");
		Thread.sleep(5000);
		for (int i = 1; i <= 1; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		WebElement Save=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Save'])[1]")));
		Save.click();
		
		
		
		
	}
}
