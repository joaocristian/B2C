package Core;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

import static Core.DriverFactory.getDriver;
import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.className;

public class BasePage {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    public void escreverCasa(){
        escreverTexto("addressTitle","casa");
    }

    public void escreverCep(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".postalCode")));
        escreverTextoCSS(".postalCode","06445-500");
    }

    public void escreverCep(String cep){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("postalCodeInput")));
        escreverTexto("postalCodeInput",cep);
    }

    public void escreverCepCep(String cep){
        escreverTexto("cep",cep);
    }

    public void escreverCepPpostCode(String cep){
        escreverTexto("postcode",cep);
    }

    /********* DSL para Escrever e obter Textos ************/
    public void escreverTexto(By by, String texto){
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escreverNumFrameComPath(String selector,String id, String texto){
        WebElement iframe = getDriver().findElement(By.xpath(selector));
        getDriver().switchTo().frame(iframe);
        escreverTexto(id,texto) ;
    }

    public void voltarParaOConteudoPadrao(){
        getDriver().switchTo().defaultContent();
    }

    public void escreverNumFrameComClasseName(String selector,String id, String texto){
        //Store the web element
        WebElement form = getDriver().findElement(By.id("paymentDetailsForm"));

        WebElement iframe = form.findElement(By.xpath("//*[@id=\"component-container-creditcard\"]/div/div/div[2]/div[1]/div[2]/div[1]/label/div/span/iframe"));


        getDriver().switchTo().frame(iframe);

        //Now we can click the button
        escreverTexto(id,texto);
//        wait.until(ExpectedConditions.visibilityOfAllElements(iframe));
    }

    public void escreverNumFrameComID(String selector,String id, String texto){
        //Store the web element
        WebElement iframe = getDriver().findElement(By.id(selector));

        //Switch to the frame
        getDriver().switchTo().frame(iframe);

        //Now we can click the button
        escreverTextoXpath(id,texto);
    }

    public void trocarFrameComPath(String selector){
        //Store the web element
        WebElement iframe = getDriver().findElement(By.xpath(selector));

        //Switch to the frame
        getDriver().switchTo().frame(iframe);
    }

    public void trocarAlerta(){
        getDriver().switchTo().alert();
    }

    public void escreverTexto(String id_Texto, String texto){
        escreverTexto((id(id_Texto)),texto);
    }

    public void escreverTextoComEspera(String id_Texto, String texto){
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id_Texto)));
        escreverTexto((id(id_Texto)),texto);
    }
    public void escreverTextoXpath(String xpath, String texto){
        escreverTexto((xpath(xpath)),texto);
    }

    public void escreverTextoComEsperaXpath(String xpath, String texto){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        escreverTexto((xpath(xpath)),texto);
    }

    public void escreverTextoCSS(String CSS, String texto){
        escreverTexto((cssSelector(CSS)),texto);
    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public String obterTextoComPath(String path) {
        return getDriver().findElement(By.xpath(path)).getText();
    }

    public String obterTextoComPathDoArquivo(String path, String site){
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get(site);
        return driver.findElement(By.xpath(path)).getText();
    }
    
    public String obterTextoComPathEspera(String path) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
            return getDriver().findElement(By.xpath(path)).getText();
        }
        catch (Exception ex){
            return getDriver().findElement(By.xpath(path)).getText();
        }
    }

    public String obterTextoComPathEspera1(String path) throws InterruptedException {
        Thread.sleep(2000);
        return getDriver().findElement(By.xpath(path)).getText();
    }

    public String obterTextoComPathEsperaFixa(String path) throws InterruptedException {
        Thread.sleep(3000);
        return getDriver().findElement(By.xpath(path)).getText();
    }

    public String obterTextoComNomeClasse(String path) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(className(path)));
        return getDriver().findElement(className(path)).getText();
    }

    public String obterValor(By by){
        return getDriver().findElement(by).getAttribute("value");
    }

    public String obterTag(By by){
        return getDriver().findElement(by).getAttribute("tagName");
    }

    public boolean elementoReadOnly(By by){
        return (getDriver().findElement(by)).isDisplayed();
    }

    public void escreverSemClear(String id, String texto){
        getDriver().findElement(id(id)).sendKeys(texto);
    }

    /********* Botao ************/
    public void cliqueBotao(String id_Botao){
        getDriver().findElement(id(id_Botao)).click();
    }

    public void cliqueBotaoCSS(String CSS_Botao){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(CSS_Botao)));
        getDriver().findElement(cssSelector(CSS_Botao)).click();
    }

    public void cliqueBotaoXpath(String xpath_Botao){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_Botao)));
            getDriver().findElement(xpath(xpath_Botao)).click();
        }
        catch (Exception ex){
            getDriver().findElement(xpath(xpath_Botao)).click();
        }

    }

    public void cliqueBotaoXpath1(String xpath_Botao){
        getDriver().findElement(xpath(xpath_Botao)).click();
    }


    /********* Radio **********/
    public void cliqueRadio(String id_Radio){
        getDriver().findElement(id(id_Radio)).click();
    }

    /********* Combo **********/
    public void selecionarComboValor(String id, String valor) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        WebElement element = getDriver().findElement(id(id));
        Select combo = new Select(element);
        combo.selectByValue(valor);
    }

    public void apertarEnterTecladoPath(String campo) {
        getDriver().findElement(xpath(campo)).sendKeys(Keys.ENTER);
    }

    public void selecionarComboVisivel(String id, String valor) {
        WebElement element = getDriver().findElement(id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    /********* Link **********/
    public void clicarLink(String link) {
        getDriver().findElement(linkText(link)).click();
    }

    public void clicarLinkLista(String link, String adress) {
        List<WebElement> links = getDriver().findElements(By.linkText(link));
        WebElement elemento = links.stream().filter(l-> l.getAttribute("href").equals(adress)).findFirst().get();
        elemento.click();
    }

    public void clicarLinkComEspera(String link) {
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(linkText(link)));
            getDriver().findElement(linkText(link)).click();
        }
        catch (Exception ex){
            getDriver().findElement(linkText(link)).click();
        }

    }

    public void clicarLinkXpath(String xpath){
        try{
            getDriver().findElement(xpath(xpath)).click();
        }
        catch (Exception ex ){
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            getDriver().findElement(xpath(xpath)).click();
        }
    }

    public void clicarLinkXpath1(String xpath){
        getDriver().findElement(xpath(xpath)).click();
    }

    /******** mouse over *******/
    public void mouseOverXpath(String xpath_over) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(xpath(xpath_over));
        acao.moveToElement(menu).perform();
    }

    public void mouseOverCSS(String CSS_over) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(cssSelector(CSS_over));
        acao.moveToElement(menu).perform();
    }

    public void mouseOverCSSPath(String CSS_over) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(xpath(CSS_over));
        acao.moveToElement(menu).perform();
    }

    public void mouseOverLink(String link) {
        Actions acao = new Actions(getDriver());
        WebElement menu = getDriver().findElement(By.linkText(link));
        acao.moveToElement(menu).perform();
    }

    /******** Teclado *******/

    public void apertarEnterTeclado(String id_enter) throws InterruptedException {
        //Thread.sleep(1000);
        getDriver().findElement(id(id_enter)).sendKeys(Keys.ENTER);
    }

    public void apertarTabTeclado(String id_tab) {
        getDriver().findElement(id(id_tab)).sendKeys(Keys.TAB);
    }

    public void clicarComEspera(String classe, String id_campo, String xpath){
        try{
            wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(className(classe))));
            wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className(classe))));
        }
        catch (Exception ex){
            getDriver().findElement(xpath(xpath)).click();
        }
    }

    public void clicarComEsperaID(String id_campo){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(className("loading")));
            wait.until(ExpectedConditions.elementToBeClickable(By.id(id_campo)));
            getDriver().findElement(id(id_campo)).click();
        }
        catch (Exception ex){
            getDriver().findElement(id(id_campo)).click();
        }
}

    public void clicarComEsperaIDbkp(String id_campo){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id_campo)));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id_campo)));
        getDriver().findElement(id(id_campo)).click();
    }

    public void clicarComEsperaID1(String id_campo){
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id_campo)));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id_campo)));
        getDriver().findElement(id(id_campo)).click();
    }

    public void clicarComEsperaPath(String path){
        try{
            wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
            getDriver().findElement(xpath(path)).click();
        }
        catch (Exception ex){
            getDriver().findElement(xpath(path)).click();
        }

    }

    public void clicarComEsperaPath1(String path){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("modalServicoAvulso"))));
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        getDriver().findElement(xpath(path)).click();
    }

    public void clicarComEsperaPathJoao(String path){
        //CX - wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("js-service-name-10070194")));
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        getDriver().findElement(xpath(path)).click();
    }

    public void clicarComEsperaPathJoao1(String path){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("font-bold")));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.className("font-bold")));
        getDriver().findElement(By.className("font-bold")).click();
    }

    public void clicarComEsperaPathJoao1bkp(String path){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        getDriver().findElement(xpath(path)).click();
    }

    public void clicarComEsperaPathbkp(String path){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        getDriver().findElement(xpath(path)).click();
    }

    public void clicarmcomEsperaFixa(String path) throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(xpath(path)).click();
    }

    public void clicarComEsperaID1(String classe, String id_campo){
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(className(classe))));
            wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className(classe))));
        }
        catch (Exception ex){
            getDriver().findElement(id(id_campo)).click();

        }
    }

    public void clicarComEsperaPath(String classe, String xpath){
        try{
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(className(classe))));
            wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className(classe))));
        }
        catch (Exception ex){
            getDriver().findElement(xpath(xpath)).click();

        }


    }

    public void clicarComClassNamebkp(String classe){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(classe)));
        getDriver().findElement(className(classe)).click();
    }

    public void clicarComClassName(String classe){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(classe)));
        getDriver().findElement(className(classe)).click();
    }

    public void clicarComClassName1(String classe){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(classe)));
        getDriver().findElement(className(classe)).click();
    }

    public void clicarComClassNameValue(String classe){
        wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className("loading"))));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(classe)));
        getDriver().findElement(new ByLinkText("Adicionar endereço")).click();
    }


    public void clicarComNome(String classe,String nome){
        wait.until(ExpectedConditions.elementToBeClickable(By.name(nome)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(nome)));
        getDriver().findElement(name(nome)).click();
    }

    public void clicarComNome1(String classe,String nome){
        getDriver().findElement(name(nome)).click();
    }

    public void clicarComNomeDoBotao(String nome){
        //wait.until(ExpectedConditions.elementToBeClickable(By.name(nome)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(nome)));
        getDriver().findElement(name(nome)).click();
    }

    public void clicarComNomebkp(String classe,String nome){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(name(nome)));
            wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(className(classe))));
            wait.until(ExpectedConditions.invisibilityOf(getDriver().findElement(className(classe))));
        }
        catch (Exception ex){
            getDriver().findElement(name(nome)).click();

        }
    }
}
