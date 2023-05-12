package Testes;

import Core.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class C_MinhaConta extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Pages.MinhaConta minhaConta = new Pages.MinhaConta();
    B_CadastroTest cadastroTeste_hml4 = new B_CadastroTest();

    //PF//
    @Test
    @Order(1)
    public void CadastrarPFlogarEAlterarMinhaSenha() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMinhaConta();
        minhaConta.trocaSenha();
    }

    @Test
    @Order(2)
    public void CadastrarPFlogarEAlterarMeusDados() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMinhaConta();
        minhaConta.alterarMeusDadosPF();
    }

    @Test
    @Order(3)
    public void CadastrarPFlogarEAlterarMeuEmail() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMinhaConta();
        minhaConta.alterarMeuEmail();
    }

    @Test
    @Order(4)
    public void CadastrarPFlogarEAlterarMeuEndereco() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMeusEnderecos();
        minhaConta.adicionarMeuEndereco();
    }

    @Test
    @Order(5)
    public void CadastrarPFlogarEEditarMeuEndereco() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMeusEnderecos();
        minhaConta.adicionarMeuEndereco();
        minhaConta.editarMeuEndereco();
    }

    @Test
    @Order(6)
    public void CadastrarPFlogarEVerMeusPedidos() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMeusPedidos();
    }


    //PJ//
    @Test
    @Order(7)
    public void CadastrarPJlogarEAlterarMinhaSenha() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        Thread.sleep(1000);
        homePage.clicarMinhaConta();
        minhaConta.trocaSenha();
    }

    @Test
    @Order(8)
    public void CadastrarPJlogarEAlterarMeusDados() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ1();
        Thread.sleep(1000);
        homePage.clicarMinhaConta();
        minhaConta.alterarMeusDadosPJ();
    }

    @Test
    @Order(9)
    public void CadastrarPJlogarEAlterarMeuEmail() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ1();
        Thread.sleep(1000);
        homePage.clicarMinhaConta();
        minhaConta.alterarMeuEmail();
    }

    @Test
    @Order(10)
    public void CadastrarPJlogarEAlterarMeuEndereco() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        homePage.clicarMeusEnderecos();
        minhaConta.adicionarMeuEndereco();
    }

    @Test
    @Order(11)
    public void CadastrarPJlogarEEditarMeuEndereco() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        homePage.clicarMeusEnderecos();
         minhaConta.adicionarMeuEndereco();
        minhaConta.editarMeuEndereco();
    }

    @Test
    @Order(12)
    public void CadastrarPJlogarEVerMeusPedidos() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        homePage.clicarMeusPedidos();
    }
}
