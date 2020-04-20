package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

        private WebDriver driver;

        public HomePage(WebDriver driver ){

            this.driver = driver;

        }

        public WebElement homeTextLabel (){

            return this.driver.findElement(By.xpath("//div[@class='page-body']/h1"));
            //WebElement homeTextLabel = this.driver.findElement(By.xpath("//div[@class='page-body']/h1"));
           //return homeTextLabel;

        }

        public WebElement homeText () {
            return this.driver.findElement(By.xpath("//div[@class='explanation']/p"));
        }

        public WebElement homeUsername () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='username']"));
        }

        public WebElement homePassword () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='password']"));
        }

        public WebElement homeTextAreaComment () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//textarea[@name='comments']"));
        }

        public WebElement homeCheckboxItemsValueThree () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='checkboxes[]' and @value='cb3']"));
        }

        public WebElement homeCheckboxItemsValueOne () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='checkboxes[]' and @value='cb1']"));
        }

        public WebElement homeRadioItemsValueTwo () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='radioval' and @value='rd2']"));
        }

        public WebElement homeRadioItemsValueThree () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@name='radioval' and @value='rd3']"));
        }

        public WebElement homeMultipleSelectValues () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='multipleselect[]']//option[@value='ms4']"));
        }

        public WebElement homeDropdown () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//select[@name='dropdown']//option[@value='dd6']"));
        }

        public WebElement clickSubmit () {
            return this.driver.findElement(By.xpath("//div[@class='centered']//input[@type='submit']"));
        }
}
