package Pages;

import Core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;

public class ItemPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    public String obterPrecoAVistaItem(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/div[1]")));
        return obterTexto(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/div[1]"));

    }

    public String obterPrecoParceladoItem(){
        return obterTexto(By.cssSelector(".prices > p"));
    }

    public void clickBtnComprar(){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("addToCartButton")));
            cliqueBotao("addToCartButton");
        }
        catch (Exception ex){
            cliqueBotao("addToCartButton");
        }


    }

    public void clickBtnComprar2(){
        clicarComEsperaID("addToCartButton");

    }

    public void clickBtnComprar1(){
        cliqueBotao("addToCartButton");

    }


    public void alterarQuantidadeDeItem(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("qty-selected")));
        selecionarComboVisivel("qty-selected","6");

    }

    public void alterarQuantidadeDeItem1(){
        selecionarComboVisivel("qty-selected","6");

    }
}
