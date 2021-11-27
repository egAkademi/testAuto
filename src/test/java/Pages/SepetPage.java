package Pages;

import ObjectsRepo.SepetObject;
import Utiliy.log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SepetPage extends AbstractPage{

    public SepetPage(WebDriver driver) {
        super(driver);
    }

    public String sepetFiyatiAl() throws InterruptedException {

        String sepetFiyati = driver.findElement(SepetObject.sepetFiyatitxt).getText();
        log.info(sepetFiyati);
        return sepetFiyati;
        //Assert.assertEquals(sepetFiyati,fiyat,"kontrol başarısız");
    }

    public void adetArtir () throws InterruptedException {
        Select se = new Select(driver.findElement(SepetObject.drpdwnAdet));
        se.selectByValue("2");
        Thread.sleep(2000);
//        WebElement sadf = driver.findElement(SepetObject.bos);
//        sadf.click();
    }

    public String adetAmount(){

        Select select = new Select(driver.findElement(SepetObject.adetAmount));
        String amount = select.getFirstSelectedOption().getText();
        return amount;
    }

    public void sepettenUrunSil(){

        WebElement sil = driver.findElement(SepetObject.silBtn);
        sil.click();
        log.info("silindi.");

    }

    public String sepetBosTxtAl (){

        String msj = driver.findElement(SepetObject.sepetBostxt).getText();
        return msj;

    }
}
