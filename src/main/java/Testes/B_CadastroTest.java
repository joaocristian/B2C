package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class B_CadastroTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    VitrinePage vitrinePage = new VitrinePage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();

    @Test
    @DisplayName("Cadastro PF")
    public void fazerCadastroPF() throws InterruptedException {
        homePage.clicarLoginB2C();
        loginPage.primeiroNomeUsuarioNovo("Automação");
        loginPage.ultimoNomeUsuarioNovo("PF");
        loginPage.cpfUsuarioNovo();
        loginPage.dataNascimentoUsuarioNovo("10021996");
        loginPage.telefoneUsuarioNovo("4798989898");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("Cantu@2023");
        loginPage.confirmarSenhaUsuarioNovo("Cantu@2023");
        loginPage.termosUsuarioNovoB2C();
        loginPage.btnFinalizarCadastro();
        Assert.assertEquals("Olá Automação!",loginPage.verificarLogin2());
    }

    public void fazerCadastroPFNovoNoPedido() throws InterruptedException {
        loginPage.primeiroNomeUsuarioNovo("Automação");
        loginPage.ultimoNomeUsuarioNovo("PF");
        loginPage.cpfUsuarioNovo();
        loginPage.dataNascimentoUsuarioNovo("10021996");
        loginPage.telefoneUsuarioNovo("4798989898");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("Cantu@2023");
        loginPage.confirmarSenhaUsuarioNovo("Cantu@2023");
        loginPage.termosUsuarioNovoB2C();
        loginPage.btnFinalizarCadastro();
    }

    @Test
    @DisplayName("Cadastro PJ")
    public void fazerCadastroPJ() throws Exception {
        homePage.clicarLoginB2C();
        loginPage.btnPJ();
        loginPage.cnpjUsuarioNovo();
        loginPage.telefoneUsuarioNovo("4798989898");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("Cantu@2023");
        loginPage.confirmarSenhaUsuarioNovo("Cantu@2023");
        Thread.sleep(60000);
        loginPage.termosUsuarioNovoB2C();
        loginPage.razaoSocial("TestePJ Razão");
        loginPage.nomeFantasia("TestePJ Fantasia");
        loginPage.btnFinalizarCadastro();
        Assert.assertEquals("Olá TestePJ !",loginPage.verificarLogin2());
    }

    @Test
    @DisplayName("Cadastro PJ")
    public void fazerCadastroPJ1() throws Exception {
        homePage.clicarLoginB2C();
        loginPage.btnPJ();
        loginPage.cnpjUsuarioNovo();
        loginPage.telefoneUsuarioNovo("4798989898");
        loginPage.emailUsuarioNovo();
        loginPage.criarSenhaUsuarioNovo("Cantu@2023");
        loginPage.confirmarSenhaUsuarioNovo("Cantu@2023");
        Thread.sleep(60000);
        loginPage.termosUsuarioNovoB2C();
        loginPage.razaoSocial("TestePJ Razão");
        loginPage.nomeFantasia("TestePJ Fantasia");
        loginPage.btnFinalizarCadastro();
        //Assert.assertEquals("Olá TestePJ !",loginPage.verificarLogin2());
    }
}
