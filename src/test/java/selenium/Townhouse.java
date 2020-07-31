package selenium;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.baseClass;

public class Townhouse extends baseClass {
	

	@BeforeTest
	public void initialize() throws IOException {
		driver = startingBase();
		driver.get(porp.getProperty("url"));
	}

	@Test
	public void filters() throws InterruptedException {

		ValidatingTitle vt = new ValidatingTitle(driver);
		vt.selectMin().sendKeys("1200");
		vt.selectMax().sendKeys("2000");
	    Thread.sleep(3000);
		THpageobject thp = vt.applyFilter();
		 Thread.sleep(3000);
		thp.login().click();
		thp.getUser().sendKeys("hello");
		thp.getPassword().sendKeys("24235");
		thp.submiting().click();

	}

	@AfterTest
	public void exit() {
		driver.close();
	}
}
