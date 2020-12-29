package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage {
	final static Logger logger = Logger.getLogger(HomePage.class);
	public static final String GirisYap="//a[@title='Giriş Yap']";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage goUrl(String url) {
		driver.get(url);
		logger.info("Opening Sahibinden");
		return this;
	}
}
