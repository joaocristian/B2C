package Pages;

import Core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;
import static org.openqa.selenium.By.*;

public class EntregaPage extends BasePage {
    VitrineServicos vitrineServicos = new VitrineServicos();

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public void ProximoEntrega() {
        cliqueBotao("nextButtonSubmit");
    }
    public void btnProximoEntrega() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        clicarComEsperaID("nextButtonSubmit");
    }

    public void btnProximoEntregabkp() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("modal__content")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextButtonSubmit")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }

    public void ProximoEntregaComEspera(){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
            cliqueBotao("nextButtonSubmit");
        }
        catch (Exception ex){
            cliqueBotao("nextButtonSubmit");
        }
    }

    public void ProximoEntregaComEsperaPreprod(){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            cliqueBotao("nextButtonSubmit");
        }
        catch (Exception ex){
            ProximoEntregaComEsperaPreprod();
        }
    }

    public void ProximoEntregaComEspera1(){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(By.className("loading"))));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }

    public void ProximoEntregaComEsperaOficial(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nextButtonSubmit\"]")));
            cliqueBotao("nextButtonSubmit");
        }
        catch (Exception ex){
            ProximoEntregaComEsperaOficial();
        }

    }

    public void clickTipoDeEntregueNormal(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".regular-options__list > .delivery-options-item > .items-center")));
        cliqueBotaoCSS(".regular-options__list > .delivery-options-item > .items-center");
    }

    public void entregaNormalbkp() throws InterruptedException {
        clicarComEsperaPath("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li/ul/li[2]/div");
    }

    public void entregaNormal() throws InterruptedException {
       cliqueBotaoXpath("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[2]/ul/li/div");


    }

    public void normalNoCarrinho(){
        cliqueBotaoXpath("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li/ul/li/div");
    }

    public void entregaNormalCX() throws InterruptedException {
        clicarComClassName("col-2");
    }

    public void entregaNormalCX1() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        clicarLinkXpath("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li/ul/li[1]");
    }

    public void entregaNormalbackup() throws InterruptedException {
        clicarComEsperaPathJoao1("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[2]/ul/li[2]/div/div[2]");
    }

    public void entregaNormalExpresso() throws InterruptedException {
        clicarComClassName("col-2");
    }

    public void entregaNormal1() throws InterruptedException {
        clicarComEspera("loading","input-3","//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[3]/ul/li[2]/div/div[2]");

    }

    public void entregaNormal2() throws InterruptedException {
        clicarLinkXpath("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li/ul/li/div/div[2]");
    }

    public void entregaNormalComa1Opcoes(){
        clicarComEspera("loading","input-3","//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[2]/ul/li[1]/div/div[2]");
                                                                 //*[@id="js-delivery-widget"]/div[1]/ul/li/ul/li/div/div[2]
    }

    public void apenasEntregaNormal(){
        clicarComEspera("loading","input-3","" +
                "//*[@id=\"js-delivery-widget\"]/div[1]/ul/li/ul/li/div/div[2]");
                 //*[@id="js-delivery-widget"]  /div[1]/ul/li/ul/li/div/div[2]


    }

    public void apenasEntregaNormalEmPreprod(){
        clicarComEspera("loading","input-3","" +
                "//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[3]/ul/li[1]/div/div[2]");
                 //*[@id=" js-delivery-widget"] /div[1]/ul/li[3]/ul/li[1]/div/div[2]
    }

    public void entregaNormalQndExisteApenasEntregaNormaleRetira(){
        clicarComEspera("loading","input-3","" + "//*[@id=\"js-delivery-widget\"]  /div[1]/ul/li[2]/ul/li/div/div[2]");
    }

    public void entregaNormalQndExisteos3(){
        clicarComEspera("loading","input-3","" +
                "//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[3]/ul/li[2]/div/div[2]");
    }

    public void entregaRetiraNovo() throws Exception{
        Thread.sleep(5000);
        cliqueRadio("addServicoAvulso");
        Thread.sleep(10000);
        apertarEnterTeclado("cep");
        Thread.sleep(10000);
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        Thread.sleep(5000);
        vitrineServicos.selecioneUmCentroDeMontagem();
        Thread.sleep(15000);
        vitrineServicos.concluir();
    }

    public void entregaRetiraNovoComEspera() throws Exception{
        clicarComEsperaID("addServicoAvulso");
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
    }

    public void entregaRetiraNovoComEspera2() throws Exception{
        cliqueBotao("addServicoAvulso");
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
    }

    public void entregaRetiraNovoComEspera1() throws Exception{
        clicarComEsperaPath1("/html/body/main/div[5]/div[2]/div/div/div[2]/article[1]/ul/li[2]/div[2]/div[2]/div/button");
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
    }


    public void entregaRetiraNovoComEspera4() throws Exception{
        clicarComEsperaID("addServicoAvulso");
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera4();
        vitrineServicos.concluir();
    }

    public void entregaRetiraNovo2x() throws Exception{
        Thread.sleep(5000);
        clicarLinkXpath("//*[@id=\"servicoAvulsoCheckbox-10120114\"]/div/p");
        Thread.sleep(10000);
        apertarEnterTeclado("cep");
        Thread.sleep(10000);
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        Thread.sleep(5000);
        vitrineServicos.selecioneUmCentroDeMontagem();
        Thread.sleep(15000);
        vitrineServicos.concluir();
    }

    public void entregaRetiraNovo2xComEspera() throws Exception{
        clicarComEsperaPathJoao("//*[@id=\"addServicoAvulso\"]");
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
        Thread.sleep(5000);
        clicarComEsperaPathJoao("/html/body/main/div[4]/div[2]/div/div/div[2]/article[1]/ul/li[2]/div[2]/div[2]/div/button");
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
    }

    public  void entregaMontagemMovelPromo(String dia) throws InterruptedException {
        clicarComClassName("delivery-options__list__item__content");
        Thread.sleep(1000);
        Assert.assertEquals("R$ 63,92",obterTextoComPath("//*[@id=\"ModalCart\"]/div/div[3]/article[1]/div[3]/ul/li/div[2]/div/ul/li[1]/div[3]/div[1]/div/span[2]"));
        Thread.sleep(1000);
        Assert.assertEquals("R$ 95,92",obterTextoComPath("//*[@id=\"ModalCart\"]/div/div[3]/article[1]/div[3]/ul/li/div[2]/div/ul/li[2]/div[3]/div[1]/div/span[2]"));
        Thread.sleep(1000);
        clicarComClassName("delivery-service__list__item__info");
        Thread.sleep(1000);
        clicarComEsperaPath("//*[@id=\"ModalCart\"]/div/div[3]/article[2]/div[3]/div/div[1]/div/div/div[1]/div[3]/div");
        Thread.sleep(1000);
        clicarComEsperaPath(dia);
        Thread.sleep(1000);
        clicarComEsperaID("MORNING");
        Thread.sleep(1000);
        clicarComEsperaPath("//*[@id=\"confirmarBtn\"]");
    }

    public  void entregaMontagemMovel(String dia) throws InterruptedException {
        clicarComClassName("delivery-options__list__item__content");
        clicarComClassName("delivery-service__list__item__info");
        clicarComEsperaPath("//*[@id=\"ModalCart\"]/div/div[3]/article[2]/div[3]/div/div[1]/div/div/div[1]/div[3]/div");
        clicarComEsperaPath(dia);
        clicarComEsperaID("MORNING");
        clicarComEsperaPath("//*[@id=\"confirmarBtn\"]");
    }

    public  void entregaMontagemMovel2x(String dia) throws InterruptedException {
        clicarComEsperaPath("//*[@id=\"js-delivery-widget\"]/div[1]/ul/li[1]/div[2]");
        Thread.sleep(1000);
        clicarComEsperaPath("//*[@id=\"ModalCart\"]/div/div[3]/article[1]/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[3]/div[2]/span");
        Thread.sleep(1000);
        Assert.assertEquals("APLICADO",obterTextoComPathEspera("//*[@id=\"ModalCart\"]/div/div[3]/article[1]/div[3]/ul/li[1]/div[1]/div[3]/div[2]/span"));
        Thread.sleep(1000);
        clicarComEsperaPath("//*[@id=\"ModalCart\"]/div/div[3]/article[1]/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[3]/div[2]/span");
        Thread.sleep(1000);
        Assert.assertEquals("APLICADO",obterTextoComPathEspera("//*[@id=\"ModalCart\"]/div/div[3]/article[1]/div[3]/ul/li[2]/div[1]/div[3]/div[2]/span"));
        Thread.sleep(1000);
        clicarComEsperaPath(dia);
        Thread.sleep(1000);
        clicarComEsperaID("MORNING");
        Thread.sleep(1000);
        cliqueRadio("checkAutorizar");
        Thread.sleep(1000);
        clicarComEsperaPath("//*[@id=\"confirmarBtn\"]");
    }

    public  void entregaMontagemMovelCom2servicos() throws InterruptedException {
        clicarComEspera("loaging","montagemBtn","/html/body/main/div[5]/div[2]/div/div/div[1]/article[3]/div[2]/div/div/form/div/div/div[1]/ul/li[1]/div[2]/div[1]/button");
        clicarComEspera("loading","PI10070318","//*[@id=\"PI10070318\"]");
        clicarComEspera("loading","10070194","//*[@id=\"10070194\"]");
        Thread.sleep(3000);
        clicarLinkXpath("//*[@id=\"ModalCart\"]/div/div[3]/article[2]/div[3]/div/div[1]/div/div/div[1]/div[3]");
        clicarLinkXpath("//*[@id=\"ModalCart\"]/div/div[3]/article[2]/div[3]/div/div[1]/div/div/div[2]/div[2]/div[5]/span");
        clicarComEspera("loading","MORNING","//*[@id=\"MORNING\"]");
        Thread.sleep(3000);
        cliqueBotaoXpath("//*[@id=\"confirmarBtn\"]");
    }
}
