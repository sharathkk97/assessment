package trello_assessment.com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import trello_assessment.com.utils.Base_Test;

public class AllTrelloTest extends Base_Test {
@Test()
public void LoginTest() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[.='Log in']")).click();
	driver.findElement(By.id("user")).sendKeys("saipranay.chaganty@qapitol.com");
	Thread.sleep(2000);
	driver.findElement(By.id("login")).click();
	driver.findElement(By.id("password")).sendKeys("Qapitol@123");
	
	driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
	AllTrelloTest test = new AllTrelloTest();
	test.CreateBoard(driver);
	test.CreateListToDO(driver);
	test.CreateListDoing(driver);
	test.CreateListDone(driver);
	test.LogoutTest(driver);
}


public AllTrelloTest() {
}
public void CreateBoard(WebDriver driver) throws InterruptedException {
Thread.sleep(20000);
driver.findElement(By.xpath("//p[text()='Create']")).click();
driver.findElement(By.xpath("//button[@class='_3Qtx4lodxp9J0E']/span[text()='Create board']")).click();
driver.findElement(By.xpath("//input[@placeholder='Add board title']")).sendKeys("Goa Trip");
driver.findElement(By.xpath("//button[@class='_1q9gQWvu0bw9ph _3TTqkG5muwOzqZ _3Ik0JLsERwh6Ui']")).click();
}

public void CreateListToDO(WebDriver driver) throws InterruptedException {
	driver.findElement(By.name("name")).sendKeys("To Do");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//span[.='Add a card']")).click();
	driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']")).sendKeys("Shopping");
	driver.findElement(By.xpath("//input[@value='Add card']")).click();
	driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card?']")).sendKeys("Booking Tickets");
	driver.findElement(By.xpath("//input[@value='Add card']")).click();
	driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card?']")).sendKeys("Booking Hotels");
	driver.findElement(By.xpath("//input[@value='Add card']")).click();
	Thread.sleep(2000);
}

public void CreateListDoing(WebDriver driver) throws InterruptedException {
	driver.findElement(By.name("name")).sendKeys("Doing");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Add list']")).click();
	Actions act = new Actions(driver); 
	WebElement src= driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable' and contains(@href,'shopping')]"));	
	WebElement dest = driver.findElement(By.xpath("(//*[@class='open-card-composer js-open-card-composer'])[1]"));
	act.dragAndDrop(src,dest).perform();
	WebElement src1= driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable' and contains(@href,'booking-tickets')]"));
	WebElement dest1= driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']"));
	act.dragAndDrop(src1, dest1).perform();
	WebElement src2 = driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable' and contains(@href,'booking-hotels')]"));
	WebElement dest2 = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[1]"));
	act.dragAndDrop(src2, dest2).perform();
	Thread.sleep(3000);
}

public void CreateListDone(WebDriver driver) throws InterruptedException {
	driver.findElement(By.name("name")).sendKeys("Done");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Add list']")).click();
	Actions act = new Actions(driver); 
	WebElement from = driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable' and contains(@href,'shopping')]"));	
	WebElement to = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[2]"));
	act.dragAndDrop(from, to).perform();
	WebElement from1 = driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable' and contains(@href,'booking-tickets')]"));
	WebElement to1 = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[2]"));
	act.dragAndDrop(from1, to1).perform();
	WebElement from2 = driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable' and contains(@href,'booking-hotels')]"));
	WebElement to2 = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[2]"));
	act.dragAndDrop(from2, to2).perform();
	Thread.sleep(5000);
}

public void LogoutTest(WebDriver driver) throws InterruptedException {
	driver.findElement(By.xpath("//span[.='Show menu']")).click();
	driver.findElement(By.xpath("//a[.='?More']")).click();
	driver.findElement(By.xpath("//a[contains(.,'Close board')]")).click();
	driver.findElement(By.xpath("//input[@value='Close']")).click();
	driver.findElement(By.xpath("//a[contains(.,'Permanently delete board')]")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.xpath("//span[.='SC']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Log out']")).click();
	driver.findElement(By.xpath("//span[text()='Log out']")).click();
}

}
