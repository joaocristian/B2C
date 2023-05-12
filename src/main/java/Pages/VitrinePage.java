package Pages;

import Core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;

public class VitrinePage extends BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    String tituloCategoria = "category-title";
    String tituloCategoria1 = "/html/body/main/div[4]/div[2]/div/div/div[2]/h1";
    String tituloCategoria2 = "/html/body/main/div[2]/ol/li[4]/span";
     String tituloCategoria3 = "//*[@id=\"CategoryHeaderComponent\"]/div[1]/div/h1";





    /********* Verificação de Textos ************/

    public String vitrineObterTitulo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/h2")));
        return obterTexto(By.xpath("//div[3]/a/h2"));
    }

    public String vitrineObterPrecoAVista(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[3]/div[4]/div/div[1]/span[1]")));
        return obterTexto(By.xpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[3]/div[4]/div/div[1]/span[1]"));
    }

    public String vitrineObterPrecoParcelado(){
        return obterTexto(By.xpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[3]/div[4]/div/div[2]"));
    }

    /********* Busca por Medidas ************/

    public String vitrineObterLargura(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(2)"));
    }

    public String tituloVitrineTireselector(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/main/div[5]/div[2]/div/div/div/h1")));
        return obterTexto(By.xpath("/html/body/main/div[5]/div[2]/div/div/div/h1"));
    }

    public String tituloPrimeiroPneuConsultaTireselector(){
        return obterTexto(By.xpath("/html/body/main/div[5]/div[2]/div/div/div/div[2]/div[1]/div[3]/a/h3"));
    }

    public String vitrineObterPerfil(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(3)"));
    }

    public String vitrineObterAro(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(4)"));
    }

    public String vitrineObterLarguraRun(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(2)"));
    }

    public String vitrineObterPerfilRun(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(3)"));
    }

    public String vitrineObterAroRun(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(4)"));
    }

    public String vitrineObterRunFlat(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(5)"));
    }

    /********* Busca por Veiculo ************/
    public String vitrineBuscaPorVeiculoMarca(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(1)"));
    }

    public String vitrineBuscaPorVeiculoModelo(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(2)"));
    }

    public String vitrineBuscaPorVeiculoAno(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(3)"));
    }

    public String vitrineBuscaPorVeiculoVersao(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(4)"));
    }

    /********* Busca por Placa ************/

    public String vitrineBuscaPorPlaca(){
        return obterTexto(By.cssSelector(".facet__values:nth-child(1) li:nth-child(1)"));
    }

    /********* Cliques Itens
     * @param s************/

    public void clickItemXpath(String s){
        try{
            clicarLinkXpath(s);
        }
        catch (Exception ex){
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(s)));
            clicarLinkXpath(s);
        }


    }

    public void clickItemCss(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-grid-item:nth-child(1) .w-auto")));
        cliqueBotaoCSS(".product-grid-item:nth-child(1) .w-auto");
    }

    public void ClickComprar(){
        cliqueBotaoXpath1("//*[@id=\"btn-add-GO10130054\"]/span");
    }

    public void Comprar(){
        cliqueBotao("addToCartFormFromCarouselProduct");
    }

    public void ClickComprarNaPDP(){
        clicarComEsperaID("addToCartButton");
    }


    public void conferirTitulo(String titulo) throws InterruptedException {
        Assert.assertEquals(titulo,obterTextoComNomeClasse(tituloCategoria));
    }

    public void conferirTitulo1(String titulo){
        Assert.assertEquals(titulo,obterTextoComPathEspera(tituloCategoria));
    }

    public void conferirTitulo3(String titulo) throws InterruptedException {
        Assert.assertEquals(titulo,obterTextoComPathEspera1(tituloCategoria3));

    }

    public void conferirTitulo4(String titulo) throws InterruptedException {
        Assert.assertEquals(titulo,obterTextoComPathEspera1(tituloCategoria1));

    }

    public void conferirTitulo2(String titulo){
        Assert.assertEquals(titulo,obterTextoComPathEspera(tituloCategoria2));
    }

    public void conferirTituloProducao(String titulo){
        Assert.assertEquals(titulo,obterTextoComPathEspera("/html/body/main/div[4]/div[2]/div/div/div/h1"));
    }

    public void conferirProduto(String nome){
        Assert.assertEquals(nome,obterTextoComPathEspera("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div[1]/div[3]/div[2]/a/h3"));
    }

    public void ClickComprarComEspera(){
        clicarComEspera("loading","btn-add-16000060","//*[@id=\"btn-add-16000060\"]");
    }

    public void ClickComprarComEspera1(){
        clicarComEspera("loading","btn-add-10070198","//*[@id=\"btn-add-10070198\"]");
    }

    public void ClickCompraComEsperaPath(){
        clicarComEsperaPath("loading","//form/button/span");
    }

    public void comprarClassName(){
        cliqueBotaoCSS("#btn-add-16000060 > span");
    }

    public void clicarNoProduto() throws InterruptedException {
        Thread.sleep(2000);
        cliqueBotaoXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[1]/div[2]/a");
    }

    public void clicarNoProduto2() {
        clickItemXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div[2]/div[1]/div[2]/a");
    }

    public void clicarNaPneuStore() {
        clicarLinkXpath("/html/body/main/header/div/div[2]/div/a");
    }
}
