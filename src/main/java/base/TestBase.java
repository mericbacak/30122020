package base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	final static Logger log = Logger.getLogger(TestBase.class);
	public String baseUrl="https://www.sahibinden.com/";
	public static WebDriver driver;
	public Logger Logcu= LogManager.getLogger(getClass().getName());
	//variables
	public static final String Giris_yap="//a[@title='Giriş Yap']";
	public static final String Uyeol="//a[@title='Üye Ol']";
	public static final String UyeGirisBaslik="//h3[text()='Üye Girişi']";
	public static final String SifremiUnuttum="//a[text()='Şifremi Unuttum']";
	public static final String HenuzUyeDegil="//h3[text()='Henüz Üye Değil Misiniz?']";
	public static final String HenuzUyeDegilDesc="//p[text()='Üyelerimize özel hizmetlerimizden faydalanabilmek için üye olun.']";
	public static final String HemenUyeol="//a[text()='Hemen Üye Ol']";
	public static final String UyelikSozlesme="//a[contains (text(), 'Bireysel Üyelik Sözleşmesi ve Ekleri')]";

	@BeforeClass
	public void setup() {
		driver = DriverFactory.getDriver("CHROME");
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
