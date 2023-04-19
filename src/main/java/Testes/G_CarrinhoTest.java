package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class G_CarrinhoTest extends BaseTest {
    HomePage homePage = new HomePage();
    VitrinePage vitrinePage = new VitrinePage();
    ItemPage itemPage = new ItemPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    LoginPage loginPage = new LoginPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();

    @Test
    public void validarQuantidadeComPneus() throws InterruptedException {
        /** 4 pneus com 6 unidades Total = 24 itens **/
        /** Pneu #1 **/
        homePage.barraDePesquisa("1010");
        homePage.barraDePesquisa("0079");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.alterarQuantidadeDeItem();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprandoComEspera();
        /** Pneu #2 **/
        homePage.barraDePesquisa("1011");
        homePage.barraDePesquisa("0146");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.alterarQuantidadeDeItem1();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        /** Pneu #3 **/
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0161");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.alterarQuantidadeDeItem();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprandoComEspera();
        /** Pneu #4 **/
        homePage.barraDePesquisa("1010");
        homePage.barraDePesquisa("0082");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.alterarQuantidadeDeItem();
        itemPage.clickBtnComprar();
        Assert.assertEquals("×\n" +
                "Opa! Você atingiu a quantidade máxima de produtos permitida.",carrinhoPage.mensagemDeItem());
    }

    @Test
    public void validarQuantidadeComKits() throws InterruptedException {
        /** 1 kit **/
        homePage.barraDePesquisa("KH100");
        homePage.barraDePesquisa("40240");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.alterarQuantidadeDeItem();
        itemPage.clickBtnComprar();
        Assert.assertEquals("×\n" +
                "Opa! Você atingiu a quantidade máxima de produtos permitida.",carrinhoPage.mensagemDeItem());
    }


}