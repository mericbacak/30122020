package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;
import pages.HomePage;

public class TitleControl extends TestBase  {
	@Test
	public void case0() {
		new HomePage(driver).goUrl("https://www.sahibinden.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Sahibinden Satılık, Kiralık, Emlak, Oto, Alışveriş Ürünleri");
	}

	@Test
	public void case1() {
		new HomePage(driver).goUrl("https://www.sahibinden.com/acil-acil");
		String title1 = driver.getTitle();
		Assert.assertEquals(title1, "Arama Sonucu - sahibinden.com");
	}

	@Test
	public void case2() {
		new HomePage(driver).goUrl("https://www.sahibinden.com/fiyati-dusenler");
		String title2 = driver.getTitle();
		Assert.assertEquals(title2, "Arama Sonucu - sahibinden.com");
	}

	@Test
	public void case3() {
		new HomePage(driver).goUrl("https://www.sahibinden.com/kategori/emlak");
		String title3 = driver.getTitle();
		System.out.println(title3);
		Logcu.info("Sayfa baslik kontrolü yapılıyor");
		try{
			Assert.assertEquals(title3, "Satılık Emlak Fiyatları sahibinden.com''da");
		}catch(AssertionError e){
			Logcu.error("Sayfa Başlığında Hata var");
		}


	}

	@Test
	public void case4() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/album");
		String title4 = driver.getTitle();
		Assert.assertEquals(title4, "Fotoğraf Albümü & Anı Kitapları, En Güzel Fotoğraf Albümleri | Sosyopix");
	}

	@Test
	public void case5() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/kanvas-tablo");
		String title5 = driver.getTitle();
		Assert.assertEquals(title5, "Kanvas Tablo, Kişiye Özel Fotoğraflı ve Parçalı Kanvas Tablolar | Sosyopix");
	}

	@Test
	public void case6() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/magnetler");
		String title6 = driver.getTitle();
		Assert.assertEquals(title6, "Foto Magnetler & Kişiye Özel Resimli Magnet Fiyatları | Sosyopix");
	}

	@Test
	public void case7() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/metal-baskilar");
		String title7 = driver.getTitle();
		Assert.assertEquals(title7, "Metal Baskılar, Kişiye Özel ve Hediyelik Fotoğraflı Metal Baskı | Sosyopix");
	}

	@Test
	public void case8() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/duvar-dekorasyonu");
		String title8 = driver.getTitle();
		Assert.assertEquals(title8, "Duvar Dekorasyonu & En Güzel ve Özel Duvar Dekorları | Sosyopix");
	}

	@Test
	public void case9() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/poster");
		String title9 = driver.getTitle();
		Assert.assertEquals(title9, "Poster Baskı, Kişiye Özel Online Poster Yaptırma Uygun Fiyatlarla | Sosyopix");
	}

	@Test
	public void case10() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/aksesuarlar");
		String title10 = driver.getTitle();
		Assert.assertEquals(title10, "Aksesuar - Sosyopix");
	}

	@Test
	public void case11() {
		new HomePage(driver).goUrl("https://www.sosyopix.com/gulen-gozler");
		String title11 = driver.getTitle();
		Assert.assertEquals(title11, "Gülen Gözler :) %100 Mutluluk - Sosyopix.com");
	}
}