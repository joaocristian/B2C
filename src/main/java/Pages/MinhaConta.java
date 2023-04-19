package Pages;

import Core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MinhaConta extends BasePage {

    public void clicarCampos(){
        cliqueBotao("postcode");
        cliqueBotao("addressTitle");
        cliqueBotao("line2");
        cliqueBotao("postcode");
        cliqueBotao("regionIso");
        cliqueBotao("townCity");
        cliqueBotao("line1");
        cliqueBotao("district");
        cliqueBotao("addressTitle");
        cliqueBotao("line2");
        cliqueBotao("postcode");
        cliqueBotao("addressTitle");
        cliqueBotao("line2");
    }

    public void cadastrarEndereco(String nome, String cep, String numero,String complemente, String referencia){
        escreverTextoComEspera("addressTitle",nome);
        escreverTexto("postcode",cep);
        apertarTabTeclado("postcode");
        clicarCampos();
        escreverTexto("line2",numero);
        escreverTexto("complement",complemente);
        escreverTexto("reference",referencia);
        clicarCampos();
        clicarCampos();
        cliqueBotaoXpath("//*[@id=\"addressForm\"]/button");
    }

    public void trocaSenha() throws InterruptedException {
        clicarLinkComEspera("Trocar senha");
        escreverTextoComEspera("currentPassword","Cantu@2023");
        escreverTextoComEspera("newPassword","Cantu@2023Alterada");
        escreverTextoComEspera("checkNewPassword","Cantu@2023Alterada");
        clicarComEsperaPathbkp("//*[@id=\"updatePasswordForm\"]/div[4]/button");
        Assert.assertEquals("×\n" +
                "Sua senha foi alterada",obterTextoComPathEspera("/html/body/main/div[4]/div[1]/div"));

    }

    public void alterarMeusDadosPF() throws InterruptedException {
        clicarLinkComEspera("Atualizar perfil");
        clicarComEsperaPathbkp("/html/body/main/div[4]/div/div/div/div[2]/div/article[2]/div[7]/a[2]");
        escreverTextoComEspera("firstName","Cadastrar PF logar E Alterado");
        escreverTextoComEspera("lastName","Alterado");
        cliqueRadio("gender2");
        escreverTextoComEspera("dddPhone","11");
        escreverTextoComEspera("phone","999880300");
        cliqueRadio("receberNovidades");
        clicarComEsperaPathbkp("//*[@id=\"grupoLevelUpdateProfileForm\"]/div[8]/button");
        Assert.assertEquals("×\n" +
                "Seu perfil foi atualizado",obterTextoComPath("/html/body/main/div[4]/div[1]/div"));
        Assert.assertEquals("Cadastrar PF logar E Alterado",obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/div[1]/span"));
        Assert.assertEquals("Alterado",obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/div[2]/span"));
        Assert.assertEquals("(11) 9998-80300",obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/div[6]/span"));
    }


    public void alterarMeusDadosPJ() throws InterruptedException {
        clicarLinkComEspera("Atualizar perfil");
        clicarComEsperaPathbkp("/html/body/main/div[4]/div/div/div/div[2]/div/article[2]/div[6]/a[2]");
        escreverTextoComEspera("register.corporatename","TestePJ  Razão Alterado");
        escreverTextoComEspera("register.tradingname","TestePJ Fantasia Alterado");
        escreverTextoComEspera("dddPhone","11");
        escreverTextoComEspera("phone","999880311");
        escreverTextoComEspera("cellPhone","999880311");
        cliqueRadio("receberNovidades");
        clicarComEsperaPathbkp("//*[@id=\"grupoLevelUpdateProfileForm\"]/div[8]/button");
        Assert.assertEquals("×\n" +
                "Seu perfil foi atualizado",obterTextoComPath("/html/body/main/div[4]/div[1]/div"));
        Assert.assertEquals("TestePJ Razão",obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/div[1]/span"));
        Assert.assertEquals("Alterado",obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/div[2]/span"));
        Assert.assertEquals("(11) 9998-80311",obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/div[5]/span"));
    }

    public void alterarMeuEmail() throws InterruptedException {
        clicarLinkComEspera("Trocar email");
        clicarComEsperaID1("profile.email");
        escreverTexto("profile.email","alterado"+obterValor(By.id("profile.email")));
        escreverTexto("profile.checkEmail",obterValor(By.id("profile.email")));
        escreverTexto("profile.pwd","Cantu@2023");
        cliqueBotaoXpath("//*[@id=\"updateEmailForm\"]/div[4]/button");
        Assert.assertEquals("×\n" +
                "Seu perfil foi atualizado",obterTextoComPathEspera("/html/body/main/div[4]/div[1]/div"));
     }

    public void adicionarMeuEndereco() {
        cliqueBotaoXpath("/html/body/main/div[4]/div/div/div/div[2]/div/article[2]/a");
        cadastrarEndereco("nome","04547006","411","complemento","referencia");
        Assert.assertEquals("Rua Gomes de Carvalho, 411\ncomplemento\nSão Paulo - Vila Olímpia\n04547006",
                obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/ul/li/p"));
    }

    public void editarMeuEndereco() {
        cliqueBotaoXpath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/ul/li/a");
        cadastrarEndereco("nome Alterado","04547006","4122","complemento Alterado","referencia Aleterado");
        Assert.assertEquals("Rua Gomes de Carvalho, 4122\ncomplemento Alterado\nSão Paulo - Vila Olímpia\n04547006",
                obterTextoComPath("/html/body/main/div[4]/div[2]/div/div/div[2]/div/article[2]/ul/li/p"));
    }
}