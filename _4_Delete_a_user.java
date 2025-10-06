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

public class _4_Delete_a_user {

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
		WebElement Sys_user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input)[2]")));
		Sys_user.click();
		Sys_user.sendKeys("OrangeHRM_New");
		WebElement Search = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Search'])[1]")));
		Search.click();
		WebElement Sys_Role = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div)[39]")));
		Sys_Role.click();
		Actions ac = new Actions(driver);
		for (int i = 1; i <= 1; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		WebElement Sys_emp_name = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type for hints...']")));
		Sys_emp_name.click();
		Sys_emp_name.sendKeys("a");
		Thread.sleep(5000);
		for (int i = 1; i <= 1; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.sendKeys(Keys.ENTER).perform();
		}

		WebElement Status = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div)[55]")));
		Status.click();
		for (int i = 1; i <= 1; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		search.click();
		WebElement Delete = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']")));
		Delete.click();
		WebElement AlertDelete=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")));
		AlertDelete.click();

	}

}
