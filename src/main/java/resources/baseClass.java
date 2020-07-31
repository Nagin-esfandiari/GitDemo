package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass {

	public WebDriver driver;
	public Properties porp;

	public WebDriver startingBase() throws IOException {
		// TODO Auto-generated method stub

		porp = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Negin\\eclipse-workspace\\selenium\\src\\main\\java\\resources\\data.properties");
		porp.load(fis);
		System.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		porp.getProperty("url");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	public String getScreenShotPath(String testcaseName, WebDriver driver) throws IOException {

		TakesScreenshot td = (TakesScreenshot) driver;

		File source = td.getScreenshotAs(OutputType.FILE);

		String destinationPath = System.getProperty("user.dir") + "\\reports\\" + testcaseName + ".png";

		FileUtils.copyFile(source, new File(destinationPath));

		return destinationPath;

	}

}
