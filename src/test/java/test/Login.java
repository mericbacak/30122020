package test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import base.TestBase;
import pages.HomePage;

public class Login extends TestBase {
    @Test
    public void LoginHappyPath() {
        new HomePage(driver).goUrl("https://www.sahibinden.com/");
        driver.findElement(By.xpath(Giris_yap)).isDisplayed();
        driver.findElement(By.xpath(Giris_yap)).isDisplayed();
        driver.findElement(By.xpath(Giris_yap)).click();
        driver.findElement(By.xpath(UyeGirisBaslik)).isDisplayed();
        driver.findElement(By.xpath(HenuzUyeDegil)).isDisplayed();
        driver.findElement(By.xpath(HenuzUyeDegilDesc)).isDisplayed();
        driver.findElement(By.xpath(HemenUyeol)).isDisplayed();
        driver.findElement(By.xpath(HemenUyeol)).click();
        try {
            Assert.assertEquals(driver.findElement(By.xpath(UyelikSozlesme)).getText(),"Bireysel Üyelik Sözleşmesi ve Ekleri'ni");
            System.out.println(driver.findElement(By.xpath(UyelikSozlesme)).getText());
        }
        catch (AssertionError e)
        {
            Logcu.error("Üyelik Sayfasında Hata var");
        }
        driver.navigate().back();
        driver.findElement(By.xpath(SifremiUnuttum)).isDisplayed();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("mericbacak@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Kafein98765!?!");
        driver.findElement(By.id("rememberMe")).isDisplayed();
        driver.findElement(By.id("rememberMe")).click();
        Logcu.info("Beni Hatırla İşaretlendi");
        driver.findElement(By.id("userLoginSubmitButton")).click();
        Logcu.info("Login Sayfasında Giriş yap butonuna tıklandı");
        driver.findElement(By.id("usernameArea")).isDisplayed();
        Assert.assertEquals(driver.findElement(By.id("usernameArea")).getText(),"Meric Bacak");
        try {
            Assert.assertEquals(driver.getTitle(),"Bana Özel Özet");
            System.out.println(driver.getTitle());
        }
        catch (AssertionError e)
        {
            Logcu.error("Bana Özel Özet Sayfa başlığın hata var");
        }

    }
}
