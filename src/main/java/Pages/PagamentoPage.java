package Pages;

import Core.BasePage;
import Core.GeradorDeCPF;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.TreeMap;

import static Core.DriverFactory.getDriver;
import static java.lang.Thread.*;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class PagamentoPage extends BasePage {

    WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));

    GeradorDeCPF geradorDeCPF = new GeradorDeCPF();

    public void PagCartao() throws InterruptedException {
        cliqueBotaoXpath("//*[@id=\"creditcardGrp\"]");
    }

    public void PagCartaoDebito() throws InterruptedException {
        clicarComEsperaID("debitcardGrp");
    }

    public void pagCreditoParcelas() throws InterruptedException {
        Thread.sleep(2000);
        selecionarComboValor("installmentSelect","1");
    }

    public void cpfdoCartao(){
        escreverTextoComEspera("cpfTitular", geradorDeCPF.geraCPFFinal());
    }

    public void pagCreditoNumeroCartao(String numero){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"component-container-creditcard\"]/div/div/div[2]/div[1]/div[1]/label/div/span/iframe")));
        escreverNumFrameComPath(
                "//*[@id=\"component-container-creditcard\"]/div/div/div[2]/div[1]/div[1]/label/div/span/iframe",
                "encryptedCardNumber",
                numero);
        voltarParaOConteudoPadrao();
        }

    public void pagCreditoVenc() throws InterruptedException {
        escreverNumFrameComPath(
                "//*[@id=\"component-container-creditcard\"]/div/div/div[2]/div[1]/div[2]/div[1]/label/div/span[1]/iframe",
                "encryptedExpiryDate",
                "03/30");
        voltarParaOConteudoPadrao();
    }


       public void pagCreditoCVC(){
                escreverNumFrameComPath(
                        "//*[@id=\"component-container-creditcard\"]/div/div/div[2]/div[1]/div[2]/div[2]/label/div/span/iframe",
                                  "encryptedSecurityCode","737");
           voltarParaOConteudoPadrao();
    }

    public void nomedoCartao(){
        escreverTextoComEsperaXpath(
                "//*[@id=\"component-container-creditcard\"]/div/div/div[2]/div[2]/label/div/input",
                "Jao Cartão");
    }

    public void fluxoPagCartaoDebito() throws InterruptedException {
        PagCartaoDebito();
        pagCreditoNumeroCartao("");
        pagCreditoVenc();
        pagCreditoCVC();
        nomedoCartao();
    }

    public void fluxoPagCartaoCredito() throws InterruptedException {
        PagCartao();
        pagCreditoParcelas();
        cpfdoCartao();
        pagCreditoNumeroCartao("4035 5010 0000 0008");
        pagCreditoVenc();
        pagCreditoCVC();
        nomedoCartao();
    }

    public void PagBoleto(){
        clicarComEsperaID("boletoGrp");
    }

    public void pagBoletoCX(){
        cliqueBotaoXpath("//*[@id=\"boletoGrp\"]/label/svg/path");
    }

    public void PagBoletoComEspera(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"boletoGrp\"]")));
        clicarComEspera("loading","boletoGrp","//*[@id=\"boletoGrp\"]");
    }

    public void PagBoletoComEspera1(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        clicarComEspera("loading","boletoGrp","//*[@id=\"boletoGrp\"]");
    }

    public void PagPix() {
        clicarComEsperaID( "pixGrp");
    }

    public void PagPix1() {
        cliqueBotao( "pixGrp");
    }

    public void PagPixbkp() {
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pixGrp")));
        cliqueBotao( "pixGrp");
    }

    public void PagNupay() {
        //clicarComEspera("flex-grow selected", "nupayGrp", "//*[@id=\"nupayGrp\"]");
        clicarComEsperaID("nupayGrp");
    }

    public void FinalizaSuaComprabkp(){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
            clicarComEsperaID("nextButtonSubmit");
        }
        catch (Exception ex){
            clicarComEsperaID("nextButtonSubmit");
        }
    }

    public void PagNupay1() {
        clicarComEspera("loading", "nupayGrp", "//*[@id=\"nupayGrp\"]");
    }

    public void FinalizaSuaCompra(){
        clicarComEsperaID("nextButtonSubmit");
    }

    public void FinalizaSuaCompraOficial(){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated((By.className(("loading")))));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nextButtonSubmit\"]")));
            cliqueBotaoXpath("//*[@id=\"nextButtonSubmit\"]");
        }
        catch (Exception ex){
            cliqueBotaoXpath("//*[@id=\"nextButtonSubmit\"]");
        }
    }

    public void FinalizaSuaCompraComEspera(){
        clicarComEspera("loading","nextButtonSubmit","//*[@id=\"nextButtonSubmit\"]");
    }

    public String ObterNumeroPedido(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".order-number")));
            return obterTexto(By.cssSelector(".order-number"));
        }
        catch (Exception ex){
            return obterTexto(By.cssSelector(".order-number"));
        }


    }

    public String ObterNumeroPedido1(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".order-number")));
        return obterTexto(By.cssSelector(".order-number"));
    }


    public void pagNupay() {
        clicarComEsperaID("nupayGrp");
    }
}
