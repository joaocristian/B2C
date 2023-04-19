package Pages;

import Core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;

public class EnderecoPage extends BasePage {

    public void escolherEndereco(){
        clicarComNome("loading","address");
    }

    public void escolherEndereco1(){
        clicarComNome1("loading","address");
    }

    public void selecionarEndereco(){
        cliqueRadio("9061714427927");
       /* WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("8908023332887")));
        cliqueRadio("8908023332887");*/
    }

    public void selecionarEndereco9070854537239(){
        cliqueRadio("9070854537239");
    }

    public void selecionarEndereco9075246956567(){
        cliqueRadio("9075246956567");
    }

    public void selecionarEndereco8816148676631(){
        cliqueRadio("8816148676631");
    }

    public void selecionarEndereco9073999872023(){
        cliqueRadio("9073999872023");
    }

    public void selecionarEndereco9157524094999(){
        cliqueRadio("9157524094999");
    }

    public void selecionarEndereco9271460659223(){
        cliqueRadio("9271460659223");
    }

    public void selecionarEndereco8820735213591(){
        cliqueRadio("8820735213591");
    }

    public  void selecionarEnderecoComPath(){
        cliqueBotaoXpath("//*[@id=\"input-3\"]");
    }

    public void btnProximoEndereco() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        cliqueBotao("nextButtonSubmit");
    }

    public void btnProximoEnderecoOficial() {
        if (obterTexto(By.id("addressTitle"))!=""){
            escreverCasa();
        }

        if (obterTexto(By.id("postcode"))!=""){
            escreverCep();
        }

        if (obterTexto(By.id("line2"))!=""){
            escreverNumeroDaCasa();
        }

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButtonSubmit")));
        clicarComEsperaID("nextButtonSubmit");
    }

    public void btnProximoEnderecoOficial1() {
        escreverDadosDoEnderecoCheckOut();
        boolean estado = elementoReadOnly(By.id("regionIso"));
        boolean cidade = elementoReadOnly(By.id("townCity"));
        boolean rua = elementoReadOnly(By.id("line1"));
        boolean bairro = elementoReadOnly(By.id("district"));
        escreverDadosDoEnderecoCheckOut();

        int cont =0;
        if (estado == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut();
        }

        if (cidade == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut();
        }

        if (rua == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut();
        }

        if (bairro == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut();
        }

        if (cont==4){
            escreverDadosDoEnderecoCheckOut();
            cliqueBotao("nextButtonSubmit");
        }

    }

    public void btnProximoEnderecoOficial2() {
        escreverDadosDoEnderecoCheckOut1();
        boolean estado = elementoReadOnly(By.id("regionIso"));
        boolean cidade = elementoReadOnly(By.id("townCity"));
        boolean rua = elementoReadOnly(By.id("line1"));
        boolean bairro = elementoReadOnly(By.id("district"));
        escreverDadosDoEnderecoCheckOut1();

        int cont =0;
        if (estado == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut1();
        }

        if (cidade == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut1();
        }

        if (rua == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut1();
        }

        if (bairro == true){
            cont = cont+1;
            escreverDadosDoEnderecoCheckOut1();
        }

        if (cont==4){
            escreverDadosDoEnderecoCheckOut1();
            cliqueBotao("nextButtonSubmit");
        }

    }

    public void adicionarEndereco(){
        cliqueBotaoCSS(".js-add-new-address");
    }

    public void escreverDadosDoEndereco(){
        escreverCasa();
        escreverCepPpostCode("88316001");
        apertarTabTeclado("postcode");
        escreverNumeroDaCasa();
        btnProximoEndereco();
    }

    public void escreverDadosDoEndereco(String cep) throws InterruptedException {
        adicionarEndereco();
        escreverCasa();
        escreverCep1(cep);
        escreverNumeroDaCasa();
        escreverComplemento();
        escreverReferencia();
        Thread.sleep(2000);
    }

    public void escreverDadosDoEndereco04547004() throws InterruptedException {
        adicionarEndereco();
        escreverCasa();
        escreverCep1("04547004");
        escreverNumeroDaCasa();
        escreverComplemento();
        escreverReferencia();
        Thread.sleep(2000);
    }

    public void escreverDadosDoEndereco04547004bkp(){
        clicarLinkXpath("//*[@id=\"DeliveryModes\"]/div[2]/div/button[1]");
        escreverCasa();
        escreverCep1("04547004");
        escreverNumeroDaCasa();
        escreverComplemento();
        escreverReferencia();
        escreverDadosDoEnderecoCheckOut();
    }

    public void escreverDadosDoEndereco04547006(){
        clicarLinkXpath("//*[@id=\"DeliveryModes\"]/div[2]/div/button[1]");
        escreverCasa();
        escreverCep1("04547006");
        escreverNumeroDaCasa();
        escreverComplemento();
        escreverReferencia();
        escreverDadosDoEnderecoCheckOut1();
    }

    public void selecionaroEndereco04547006CX(){
        cliqueBotao("8821720285207");
    }

    public void selecionaroEndereco04547006Preprod(){
        cliqueBotao("9271460659223");
    }

    public void selecionaroEndereco04547006CX1(){
        cliqueBotao("8822669475863");
    }

    int cont = 0;
    public void escreverDadosDoEnderecoCheckOut(){
        Assert.assertEquals("casa",obterValor(By.id("addressTitle")));
        Assert.assertEquals("04547-004",obterValor(By.id("postcode")));
        Assert.assertEquals("411",obterValor(By.id("line2")));
        Assert.assertEquals("Complemento",obterValor(By.id("complement")));
        Assert.assertEquals("Referencia",obterValor(By.id("reference")));
        cont = cont +1;
        if (cont<=4)
            escreverDadosDoEnderecoCheckOut();

    }

    public void escreverDadosDoEnderecoCheckOut1(){
        Assert.assertEquals("casa",obterValor(By.id("addressTitle")));
        Assert.assertEquals("04547-006",obterValor(By.id("postcode")));
        Assert.assertEquals("411",obterValor(By.id("line2")));
        Assert.assertEquals("Complemento",obterValor(By.id("complement")));
        Assert.assertEquals("Referencia",obterValor(By.id("reference")));
    }

    public void escreverCEP(){
        escreverTexto("postcode","04547004");
    }

    public void clicarBairro(){
        cliqueBotao("district");
    }

    public void escreverCep1(String cep){
        escreverTexto("postcode",cep);
    }

    public void escreverNumeroDaCasa(){
        escreverTexto("line2","411");
    }

    public void clickNumeroDaCasa(){
        cliqueBotao("line2");
    }

    public void escreverComplemento() {
        escreverTexto("complement","Complemento");
    }

    public void escreverReferencia() {
        escreverTexto("reference","Referencia");
    }

    public void checarEndereco() throws InterruptedException {
        if (obterTexto(By.xpath("/html/body/main/div[5]/div[1]/div"))=="\n" +
                "\t\t\t\t\tEncontramos alguns erros no preenchimento do seu cadastro. Por favor verifique os erros abaixo e tente novamente."){
            escreverDadosDoEndereco04547004();
        }
    }

    public void escreverEndereçoGuestVindoDoCarrinho(){
        escreverCasa();
        escreverNumeroDaCasa();
        escreverComplemento();
        escreverReferencia();
        btnProximoEndereco();
    }

    public void escreverNome(){
        escreverTexto("addressTitle","Teste");
    }
}
