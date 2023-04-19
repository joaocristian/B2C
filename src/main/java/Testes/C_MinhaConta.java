package Testes;

import Core.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Test;

public class C_MinhaConta extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Pages.MinhaConta minhaConta = new Pages.MinhaConta();
    B_CadastroTest cadastroTeste_hml4 = new B_CadastroTest();

    //PF//
    @Test
    public void CadastrarPFlogarEAlterarMinhaSenha() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMinhaConta();
        minhaConta.trocaSenha();
    }

    @Test
    public void CadastrarPFlogarEAlterarMeusDados() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMinhaConta();
        minhaConta.alterarMeusDadosPF();
    }

    @Test
    public void CadastrarPFlogarEAlterarMeuEmail() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMinhaConta();
        minhaConta.alterarMeuEmail();
    }

    @Test
    public void CadastrarPFlogarEAlterarMeuEndereco() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMeusEnderecos();
        minhaConta.adicionarMeuEndereco();
    }

    @Test
    public void CadastrarPFlogarEEditarMeuEndereco() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMeusEnderecos();
        minhaConta.adicionarMeuEndereco();
        minhaConta.editarMeuEndereco();
    }

    @Test
    public void CadastrarPFlogarEVerMeusPedidos() throws InterruptedException {
        cadastroTeste_hml4.fazerCadastroPF();
        homePage.clicarMeusPedidos();
    }


    //PJ//
    @Test
    public void CadastrarPJlogarEAlterarMinhaSenha() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        Thread.sleep(1000);
        homePage.clicarMinhaConta();
        minhaConta.trocaSenha();
    }

    @Test
    public void CadastrarPJlogarEAlterarMeusDados() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ1();
        Thread.sleep(1000);
        homePage.clicarMinhaConta();
        minhaConta.alterarMeusDadosPJ();
    }

    @Test
    public void CadastrarPJlogarEAlterarMeuEmail() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ1();
        Thread.sleep(1000);
        homePage.clicarMinhaConta();
        minhaConta.alterarMeuEmail();
    }

    @Test
    public void CadastrarPJlogarEAlterarMeuEndereco() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        homePage.clicarMeusEnderecos();
        minhaConta.adicionarMeuEndereco();
    }

    @Test
    public void CadastrarPJlogarEEditarMeuEndereco() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        homePage.clicarMeusEnderecos();
         minhaConta.adicionarMeuEndereco();
        minhaConta.editarMeuEndereco();
    }

    @Test
    public void CadastrarPJlogarEVerMeusPedidos() throws Exception {
        cadastroTeste_hml4.fazerCadastroPJ();
        homePage.clicarMeusPedidos();
    }
}
