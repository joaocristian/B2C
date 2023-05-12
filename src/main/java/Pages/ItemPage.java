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
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/div[1]")));
        return obterTexto(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/div[1]"));

    }

    public String obterPrecoAVistaItemPromo(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/div[1]")));
        return obterTexto(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/div[2]"));


    }

    public String obterPrecoParceladoItem(){
        return obterTexto(By.xpath("/html/body/main/div[4]/div[2]/div[3]/div[3]/p"));
    }

    public void clickBtnComprar() throws InterruptedException {
        Thread.sleep(4000);
        cliqueBotao("addToCartButton");
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
