package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

    private WebDriver driver;

    public ResultPage(WebDriver driver ){

        this.driver = driver;
    }

    public WebElement resultUsername () {
        return this.driver.findElement(By.xpath("//div[@class='centered form-results']//li[@id='_valueusername']"));
    }

    public WebElement resultPassword () {
        return this.driver.findElement(By.xpath("//div[@class='centered form-results']//li[@id='_valuepassword']"));
    }

    public WebElement resultComments () {
        return this.driver.findElement(By.xpath("//div[@class='centered form-results']//li[@id='_valuecomments']"));
    }
}
