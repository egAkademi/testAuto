package Pages;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public AbstractPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, GetData.DEFAULT_WAIT);
        DOMConfigurator.configure("src/test/resources/Log4j.xml");


    }

}
