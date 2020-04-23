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
        return this.driver.findElement(By.xpath("//li[@id='_valueusername']"));
    }

    public WebElement resultPassword () {
        return this.driver.findElement(By.xpath("//li[@id='_valuepassword']"));
    }

    public WebElement resultComments () {
        return this.driver.findElement(By.xpath("//li[@id='_valuecomments']"));
    }

    public WebElement resultCheckBox () {
        return this.driver.findElement(By.xpath("//li[@id='_valuecheckboxes0']"));
    }

    public WebElement resultRadioval () {
        return this.driver.findElement(By.xpath("//li[@id='_valuesradioval']"));
    }

    public WebElement resultMultipleSelect () {
        return this.driver.findElement(By.xpath("//li[@id='_valuemultipleselect0']"));
    }

    public WebElement resultDropdown () {
        return this.driver.findElement(By.xpath("//li[@id='_valuedropdown']"));
    }

    public WebElement resultSubmit () {
        return this.driver.findElement(By.xpath("//li[@id=_valuesubmitbutton']"));
    }
}
