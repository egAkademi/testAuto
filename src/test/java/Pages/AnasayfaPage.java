package Pages;

import ObjectsRepo.AnasayfaObject;
import Utiliy.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AnasayfaPage {

    WebDriver driver;
    public AnasayfaPage(WebDriver driver){
        this.driver=driver;
    }

    public void urunBul(){
        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/");
        WebElement searchText = driver.findElement(AnasayfaObject.searchText);
        searchText.sendKeys("bilgisayar");
        WebElement btnBul = driver.findElement(AnasayfaObject.bulBtn);
        btnBul.click();
        log.info("sdsad");

        //driver.findElement(By.cssSelector("[data-cy='header-search-input']")).sendKeys("bilgisayar");
        //driver.findElement(By.cssSelector("[data-cy='search-find-button']")).click();
    }


}
