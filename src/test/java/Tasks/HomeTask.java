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

    public void preencherFormulario () {
        page.homeUsername().click();
        page.homeUsername().sendKeys("Gui");
        page.homePassword().click();
        page.homePassword().sendKeys("123");
        page.homeTextAreaComment().click();
        page.homeTextAreaComment().clear();
        page.homeTextAreaComment().sendKeys("Comentário Aleatório");
        page.homeCheckboxItems().click();
        page.homeRadioItems().click();
        page.homeMultipleSelectValues().click();
        page.homeDropdown().click();
        page.clickSubmit().click();
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
