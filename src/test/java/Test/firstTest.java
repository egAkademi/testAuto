package Test;

import Pages.AnasayfaPage;
import Pages.SepetPage;
import Pages.UrunPage;
import Utiliy.log;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

    WebDriver driver = new ChromeDriver();
    AnasayfaPage anasayfaPage = new AnasayfaPage(driver);
    UrunPage urunPage = new UrunPage(driver);
    SepetPage sepetPage = new SepetPage(driver);
    @Test
    public void test() throws InterruptedException {

        anasayfaPage.urunBul();
        Thread.sleep(3000);
        urunPage.ikinciSayfatikla();
        urunPage.urunSec();

        String urunfiyat = urunPage.urunFiyatiAl();

        urunPage.urunuSepeteEkle();
        urunPage.sepetimEkraniAc();

        String sepetFiyat = sepetPage.sepetFiyatiAl();

        Assert.assertEquals(urunfiyat,sepetFiyat);
        log.info("Ürün fiyatı: " + urunfiyat + "sepetteki fiyatı: " + sepetFiyat + "kontrol başarılı");

        sepetPage.adetArtir();

        String amount=sepetPage.adetAmount();
        log.info(amount);
        String beklenenDeger = "2";
        Assert.assertEquals(beklenenDeger,amount);
        log.info("sepetteki ürün sayısı: " + beklenenDeger + "sepetteki ürün sayısı bir artırıldıktan sonra: " + amount + "kontrol başarılı");

        sepetPage.sepettenUrunSil();

        String sepetBosMsj = sepetPage.sepetBosTxtAl();
        String beklenenMsj = "Sepetinizde ürün bulunmamaktadır.";
        Assert.assertEquals(beklenenMsj,sepetBosMsj);
        log.info("beklenen mesaj: " + beklenenMsj + "ekrandaki mesaj " + sepetBosMsj + "kontrol başarılı");
    }
}
