package base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver getDriver(String browser) {

		browser = (browser == null) ? "CHROME" : browser;

		switch (browser) {
		case "IE":
			WebDriverManager.iedriver().setup();
			return new InternetExplorerDriver();
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case "CHROME":
		default:
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}
	}
}