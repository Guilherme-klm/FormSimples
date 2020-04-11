package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeTask {


        private WebDriver driver;
        private HomePage page;

        public HomeTask(WebDriver driver){

        this.driver=driver;
        page = new HomePage(this.driver);
        }

        public void verificaHome() throws InterruptedException {

            String label = page.homeTextLabel().getText();
            sleep(5000);
            assertEquals(label, "Basic HTML Form Example");


        }

        public void verificaTextHome () throws InterruptedException {
            String textHome = page.homeText().getText();
            sleep(5000);
            assertEquals(textHome, "HTML uses form elements with sub input, label, textarea, select and option elements. This form is formatted using a table element. Submitting a form will POST the information to another part of the application.");
        }

        public void verificaUsername () throws InterruptedException {
            String username = page.homeUsername().getText();
            sleep(5000);
            assertEquals(username,"");
        }

        public void verificaPassword () throws InterruptedException {
            String password = page.homePassword().getText();
            sleep(5000);
            assertEquals(password,"");
        }

        public void verificaTextAreaComment () throws InterruptedException {
            String textAreaComment = page.homeTextAreaComment().getText();
            sleep(5000);
            assertEquals(textAreaComment, "Comments...");
        }

        public void verificaCheckboxItems () throws InterruptedException {
            boolean checkboxItems = page.homeCheckboxItems().isEnabled();
            sleep(5000);
            assertTrue(checkboxItems);
        }

        public void verificaRadioItems () throws InterruptedException {
            boolean radioItems = page.homeRadioItems().isEnabled();
            sleep(5000);
            assertTrue(radioItems);
        }

        public void verificaMultipleSelectValues () throws InterruptedException {
            boolean multipleSelectValues = page.homeMultipleSelectValues().isSelected();
            sleep(5000);
            assertTrue(multipleSelectValues);
        }

        public void verificaDropdown () throws InterruptedException {
            boolean dropdown = page.homeDropdown().isSelected();
            sleep(5000);
            assertTrue(dropdown);
        }
}
