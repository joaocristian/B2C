package Core;

import Pages.HomePage;
import Pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static Core.DriverFactory.getDriver;
import static Core.DriverFactory.killDriver;


public class BaseTest {
    BasePage basePage = new BasePage();
    private LoginPage page = new LoginPage();
    HomePage homePage = new HomePage();

    @Before
    public void Inicializa(){
        //DriverFactory.getDriver().get("https://www.pneustore.com.br/");
        //DriverFactory.getDriver().get("https://hml4commerce.eastus.cloudapp.azure.com:1443/");
        //DriverFactory.getDriver().get("https://preprod.pneustore.com.br/");
        //DriverFactory.getDriver().get("https://cxpneustore.eastus.cloudapp.azure.com:1443/");
        //DriverFactory.getDriver().get("https://ps.cmaww4dkcp-cantucome1-s1-public.model-t.cc.commerce.ondemand.com/");
        //DriverFactory.getDriver().get("https://www-qas.pneustore.com.br/");
        DriverFactory.getDriver().get("https://www-prd.pneustore.com.br/");
        homePage.clicarConcordo();
        //DriverFactory.getDriver().get("https://hml2commerce.eastus.cloudapp.azure.com:1443/");
        //DriverFactory.getDriver().get("https://www.pneustore.com.br/");
        //DriverFactory.getDriver().get("https://cxpneustore.eastus.cloudapp.azure.com:1443/");
        //DriverFactory.getDriver().findElement(By.id("details-button")).click();
        //DriverFactory.getDriver().findElement(By.id("proceed-link")).click();
    }


    @Rule
    public TestName testName = new TestName();

    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("C:" + File.separator + "SeleniumScreenShots" + File.separator + testName.getMethodName() + ".jpg"));

        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}
