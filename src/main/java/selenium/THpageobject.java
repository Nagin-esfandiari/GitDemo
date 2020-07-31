package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class THpageobject {

	WebDriver driver;
	
	//
	
	@FindBy(xpath="//a[@id='login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='Username']")
	WebElement username;
	
	@FindBy(xpath=("//input[@id='Password']"))
	 WebElement password;
	
	@FindBy(xpath=("//button[@class='btn-primary withanimation']"))
	 WebElement submit;


	public THpageobject(WebDriver driver) {
		this.driver=driver;
	  PageFactory.initElements(driver, this);
	}
	

	
	
	public WebElement login() {
		
		return login;
	}
	
	public WebElement getUser() {
		
		return username;
	}
	public WebElement getPassword() {
		
		return password;
	}
	public WebElement submiting() {
		
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
}
