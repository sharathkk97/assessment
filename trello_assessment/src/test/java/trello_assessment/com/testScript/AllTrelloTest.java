package trello_assessment.com.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import trello_assessment.com.utils.Base_Test;

public class AllTrelloTest extends Base_Test {
@Test(priority = -1)
public void LoginTest() {
	driver.findElement(By.id(null)).click();;
	System.out.println("Hello Trello");
}

}
