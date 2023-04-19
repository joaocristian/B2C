package Pages;

import Core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class VitrineServicos extends BasePage {

    public void SelecioneoTipoDeVeiculo(String id, String valor) throws InterruptedException {
        selecionarComboValor(id,valor);
    }

    public void SelecioneoTipoDeVeiculoComEspera(String id, String valor) throws InterruptedException {
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        selecionarComboValor(id,valor);
    }

    public void quantidadeDePneu(String id, String valor) throws InterruptedException {
        selecionarComboValor(id,valor);
    }

    public void posicaoDoVeiculo(String id, String valor) throws InterruptedException {
        selecionarComboValor(id,valor);
    }

    public void informeSeuCEP(String id, String cep){
        escreverTexto(id,cep);
    }

    public void calcularCep() {
        apertarEnterTecladoPath("//*[@id=\"container-select-options\"]/div[2]/div/div[2]/div/div[2]/button");
    }

    public void calcularCepComEnter() {
        apertarEnterTeclado("cep");
    }

    public void selecioneOPrimeiroServicoASerRealizado(){
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[1]/button");
    }

    public void selecioneOPrimeiroServicoASerRealizadoComEspera(){
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[1]/button")));
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[1]/button");
    }


    public void selecioneOSegundoServicoASerRealizado(){
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[2]/button")));
        clicarLinkXpath1("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[2]/button");
    }

    public void selecioneOSegundoServicoASerRealizado1(){
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[2]/button");
    }

    public void selecioneOTerceiroServicoASerRealizado(){
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[3]/button");
    }

    public void selecioneOTerceiroServicoASerRealizadoComEspera(){
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[3]/button")));
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[4]/div/div[2]/div[3]/button");
    }


    public void selecioneUmCentroDeMontagem(){
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[5]/div/div[2]/div[2]/div[1]/div[2]/div[3]/button");
    }

    public void selecioneUmCentroDeMontagemComespera(){
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"container-select-options\"]/div[5]/div/div[2]/div[2]/div[1]/div[2]/div[3]/button")));
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[5]/div/div[2]/div[2]/div[1]/div[2]/div[3]/button");
    }


    public void selecioneUmCentroDeMontagem1(){
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[5]/div/div[2]/div[2]/div[2]/div[2]/div[3]/button");
     }

    public void selecioneUmCentroDeMontagemComespera4(){
        WebDriverWait wait = (new WebDriverWait(getDriver(), Duration.ofSeconds(10)));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"container-select-options\"]/div[5]/div/div[2]/div[2]/div[4]/div[2]/div[3]/button")));
        clicarLinkXpath("//*[@id=\"container-select-options\"]/div[5]/div/div[2]/div[2]/div[4]/div[2]/div[3]/button");
    }

    public void concluir(){
        clicarComEsperaPathbkp("//*[@id=\"container-select-options\"]/div[7]/div/button");
    }

    public void concluirComEspera(){
        clicarComEsperaPath("//*[@id=\"container-select-options\"]/div[7]/div/button");
    }

    public void conferirDados() {
        Assert.assertEquals("\n" +
                "                        BUTANTA SERVICOS AUTOMOTIVOS LTDA\n" +
                "                    ",obterTextoComPath("//*[@id=\"container-select-options\"]/div[6]/div/div[2]/span[2]/"));
    }
}