package Core;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import Core.Propriedades.TipoExecucao;

public class DriverFactory {

    public static String url,site;;

    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
        @Override
        protected synchronized WebDriver initialValue() {
            return initDriver();
        }
    };
    public DriverFactory() {
    }

    public static WebDriver getDriver() {

        return threadDriver.get();
    }

    public static WebDriver initDriver(){
        WebDriver driver = null;
        /*if(Propriedades.TIPO_EXECUCAO == TipoExecucao.LOCAL) {
            switch (Propriedades.BROWSER) {
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;

            }

        }*/

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //driver.get("https://www.pneustore.com.br/");
        //driver.get("https://www.pneustore.com.br/");
        //driver.get("https://hml4commerce.eastus.cloudapp.azure.com//");
        //driver.get("https://hml4commerce.eastus.cloudapp.azure.com:1443/");
        //driver.get("https://hml2commerce.eastus.cloudapp.azure.com:1443/");
        //driver.get("https://www.pneustore.com.br/");
        //driver.get("https://cxpneustore.eastus.cloudapp.azure.com:1443/");
        //driver.get("https://ps.cmaww4dkcp-cantucome1-s1-public.model-t.cc.commerce.ondemand.com/");
        driver.get("https://www-qas.pneustore.com.br/");
        //url = "https://cxpneustore.eastus.cloudapp.azure.com:1443/";
        //url = "https://hml4commerce.eastus.cloudapp.azure.com:1443/";
        //driver.get("https://preprod.pneustore.com.br/");
        //driver.get("https://www.pneustore.com.br/");
        //driver.get("https://preprod.pneustore.com.br/");
        //url = ("https://preprod.pneustore.com.br/");
        //url = ("https://www.pneustore.com.br/");
        //url = ("https://hml4commerce.eastus.cloudapp.azure.com:1443/");
        //url = ("https://cxpneustore.eastus.cloudapp.azure.com:1443/");
        //url = ("https://ps.cmaww4dkcp-cantucome1-s1-public.model-t.cc.commerce.ondemand.com/");
        url = ("https://www-qas.pneustore.com.br/");

        driver.manage().window().maximize();
        return driver;
    }

    public void startBrowser(){

    }
    public static void killDriver() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        if (threadDriver != null) {
            threadDriver.remove();
        }
    }
}