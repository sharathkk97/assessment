package trello_assessment.com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import trello_assessment.com.utils.Base_Test;

public class AllTrelloTest extends Base_Test {
@Test()
public void LoginTest() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[.='Log in']")).click();
	driver.findElement(By.id("user")).sendKeys("saipranay.chaganty@qapitol.com");
	driver.findElement(By.id("login")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("password")).sendKeys("Qapitol@123");
	driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
	AllTrelloTest test = new AllTrelloTest();
	test.LogoutTest(driver);
}

public AllTrelloTest() {
}
public void LogoutTest(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//span[.='SC']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Log out']")).click();
	driver.findElement(By.xpath("//span[text()='Log out']")).click();
	Thread.sleep(5000);
}

}
