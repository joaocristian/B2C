package Pages;

import Core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;
import static org.openqa.selenium.By.*;

public class CarrinhoPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    public String verificarSubTotal(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//article/div/div[2]/div/div[2]")));
        return obterTexto(By.xpath("//article/div/div[2]/div/div[2]"));
    }



    public void clickCalcularCEP(){
        cliqueBotao("zipBtn");
    }

    public void modoDeEntregaNormal(){
    }

    public void modoDeEntregaNormalx(){
        cliqueBotaoXpath("//li[3]/ul/li/div/label/span");
    }

    public void clickFinalizarCompra(){
        try{
            clicarComEsperaID("btn-continue-checkout");
        }
        catch (Exception ex){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-continue-checkout")));
            cliqueBotao("btn-continue-checkout");
        }

    }

    public void clickFinalizarCompra1(){
        clicarComEsperaID("btn-continue-checkout");
    }

    public void clickFinalizarCompraComEspera(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("btn-continue-checkout")));
        cliqueBotao("btn-continue-checkout");
    }

    public void clickFinalizarCompraComEsperaOficial(){
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            cliqueBotao("btn-continue-checkout");
        }
        catch (Exception ex){
            clickFinalizarCompraComEsperaOficial();
        }
    }

    public void clickFinalizarComprahml4(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-continue-checkout")));
        cliqueBotao("btn-continue-checkout");
    }

    public String mensagemDeItem(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(xpath("/html/body/main/div[3]/div[1]/div")));
        return obterTexto(By.xpath("/html/body/main/div[3]/div[1]/div"));
    }

    public void continuarComprando() {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-continue-shopping")));
            cliqueBotao("btn-continue-shopping");
        }
        catch (Exception ex){
            cliqueBotao("btn-continue-shopping");
        }

    }

    public void continuarComprandobkp() {
        cliqueBotao("btn-continue-shopping");
    }

    public void continuarComprandoComEspera() {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-continue-shopping")));
            clicarComEspera("loading","btn-continue-shopping","//*[@id=\"btn-continue-shopping\"]");
    }

    public void paginainicial() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"rowService\"]/div[1]/b")));
        cliqueBotaoXpath("//*[@id=\"AF_PneuStore_RGB_Positivo\"]");
    }

    public void paginainicialOficial() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rowService\"]/div[1]/b")));
        cliqueBotaoXpath("//*[@id=\"AF_PneuStore_RGB_Positivo\"]");
    }

    public void inserirCupom(String cupom) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        escreverTextoComEspera("js-voucher-code-text",cupom);
    }

    public void aplicarCupom() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("js-voucher-apply-btn")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        clicarComEsperaID("js-voucher-apply-btn");
    }

    public void conferirCupomAplicado() {
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/main/div[3]/div[2]/div[2]/article[2]/div/div")));
        Assert.assertEquals("O cupom TONIMEKPASSEIO foi aplicado com sucesso",obterTextoComPathEspera("/html/body/main/div[3]/div[2]/div[2]/article[2]/div/div"));
    }

    public void fluxoCupom(String cupom) throws InterruptedException {
        Thread.sleep(5000);
        inserirCupom(cupom);
        Thread.sleep(5000);
        aplicarCupom();
        Thread.sleep(10000);
        conferirCupomAplicado();
    }

    public void FecharModalPix() {
        cliqueBotaoXpath("//*[@id=\"cboxClose\"]/span");
    }

    public void conferirProduto(String atual, String esperado) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            Assert.assertEquals(atual,obterTextoComPathEspera(esperado));
    }
}
