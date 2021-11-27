package Pages;

import ObjectsRepo.UrunPageObject;
import Utiliy.log;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrunPage extends AbstractPage{

    //WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public UrunPage(WebDriver driver) {
        super(driver);

    }

    public void ikinciSayfatikla() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(UrunPageObject.ikincisayfa));
        Thread.sleep(4000);
        String hakkimizdatext = driver.findElement(UrunPageObject.sayfalar).getText();
        log.info(hakkimizdatext);
        wait.until(ExpectedConditions.elementToBeClickable(UrunPageObject.ikincisayfa));
        WebElement ikinciSayfa = driver.findElement(UrunPageObject.ikincisayfa);
        ikinciSayfa.click();
        log.info("2.sayfa tıklanır.");

    }

    public void urunSec () throws InterruptedException {
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.elementToBeClickable(UrunPageObject.urun)).isDisplayed();
        WebElement urun = driver.findElement(UrunPageObject.urun);
        Actions actions = new Actions(driver);
        actions.moveToElement(urun).perform();

        wait.until(ExpectedConditions.elementToBeClickable(UrunPageObject.asdasd));
        WebElement ilkUrun = driver.findElement(UrunPageObject.asdasd);
        Actions actionss = new Actions(driver);
        actionss.moveToElement(ilkUrun);
        actions.click().build().perform();
        log.info("sepete ürün eklendi.");
        Thread.sleep(2000);
    }

    public String urunFiyatiAl() throws InterruptedException {
        String price = driver.findElement(UrunPageObject.prcie).getText();
        log.info(price);
        String urunAdi = driver.findElement(UrunPageObject.urunAdi).getText();
        log.info(urunAdi);
        Thread.sleep(2000);
        String srs = driver.findElement(UrunPageObject.srs).getText();
        log.info(srs);

        return price;

    }

    public void urunuSepeteEkle () throws InterruptedException {

        WebElement urunEkrani = driver.findElement(UrunPageObject.urunEkleekrani);
        Actions actionsssss = new Actions(driver);
        actionsssss.moveToElement(urunEkrani);
        actionsssss.click().build().perform();

        WebElement asd = driver.findElement(UrunPageObject.sepeteekleBtn);
        Actions actionssss = new Actions(driver);
        actionssss.moveToElement(asd);
        actionssss.click().build().perform();
        log.info("Çerezler popup kapatıldı.");
        actionssss.click().build().perform();
        log.info("sepete eklendi");

        Thread.sleep(2000);
    }

    public void sepetimEkraniAc(){

        //wait.until(ExpectedConditions.elementToBeClickable(UrunPageObject.sepetimBtn)).isDisplayed();
        WebElement sepetim = driver.findElement(UrunPageObject.sepetimBtn);
        Actions actionsss = new Actions(driver);
        actionsss.moveToElement(sepetim);
        //actionsss.click().build().perform();
        log.info("sepetim tolltip açıldı");

        WebElement sepeteGit = driver.findElement(UrunPageObject.sepetegit);
        Actions acti = new Actions(driver);
        acti.moveToElement(sepeteGit);
        acti.click().build().perform();
        log.info("sepete git tıklandı");

    }
}
