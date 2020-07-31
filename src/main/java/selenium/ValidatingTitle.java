package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidatingTitle {

	WebDriver driver;

	By title = By.xpath("//h1[@id='listingsTitle']");
	By Min = By.xpath("//input[@id='PriceMin_input']");
	By Max = By.xpath("//input[@id='PriceMax_input']");
	By applying = By.xpath("//input[@name='submit']");

	public ValidatingTitle(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getTitle() {

		return driver.findElement(title);
	}

	public WebElement selectMin() {

		return driver.findElement(Min);
	}

	public WebElement selectMax() {

		return driver.findElement(Max);
	}

	public selenium.THpageobject applyFilter() {

		driver.findElement(applying).click();
		THpageobject thp = new THpageobject(driver);
		return thp;
	}

}
