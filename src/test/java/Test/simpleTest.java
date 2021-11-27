package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleTest {

    @Test
    public void ilkTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Opening web application
        driver.get("https://www.gittigidiyor.com/");


        driver.findElement(By.cssSelector("[data-cy='header-search-input']")).sendKeys("bilgisayar");
        driver.findElement(By.cssSelector("[data-cy='search-find-button']")).click();
    }

}
