package TestesCases;

import Fw.BaseTestFw;
import Tasks.HomeTask;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PreencherFormTest extends BaseTestFw {

    private WebDriver driver = this.getDriver();

    @Test
    public void popularForm() throws InterruptedException {

        HomeTask home = new HomeTask(driver);

        home.preencherFormulario();

        // Testes dos resultados
        home.verificaResultUsername();
        home.verificaResultPassword();
        home.verificaResultComments();
    }
}