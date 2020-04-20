package Tasks;

import PageObjects.HomePage;
import PageObjects.ResultPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomeTask {


        private WebDriver driver;
        private HomePage page;
        private ResultPage resultPage;

        public HomeTask(WebDriver driver){

        this.driver=driver;
        page = new HomePage(this.driver);
        resultPage = new ResultPage(this.driver);
        }

    public void preencherFormulario () throws InterruptedException {
        page.homeUsername().click();
        page.homeUsername().sendKeys("Gui");
        Thread.sleep(2000);
        page.homePassword().click();
        page.homePassword().sendKeys("123");
        Thread.sleep(2000);
        page.homeTextAreaComment().click();
        page.homeTextAreaComment().clear();
        Thread.sleep(2000);
        page.homeTextAreaComment().sendKeys("Comentário Aleatório");
        page.homeCheckboxItemsValueThree().click();
        Thread.sleep(2000);
        page.homeCheckboxItemsValueOne().click();
        page.homeRadioItemsValueTwo().click();
        Thread.sleep(2000);
        page.homeRadioItemsValueThree().click();
        Thread.sleep(2000);
        page.homeMultipleSelectValues().click();
        page.homeDropdown().click();
        Thread.sleep(2000);
        page.clickSubmit().click();
        Thread.sleep(2000);
    }

        public void verificaResultUsername () {
            String username = resultPage.resultUsername().getText();
            assertEquals(username, "Gui");
        }

        public void verificaResultPassword () {
            String password = resultPage.resultPassword().getText();
            assertEquals(password, "123");
        }

        public void verificaResultComments () {
            String comments = resultPage.resultComments().getText();
            assertEquals(comments, "Comentário Aleatório");
        }
}
