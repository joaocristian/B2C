package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;

public class Z_FluxoCompraTestPJ extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();

    @Test
    public void PJNormalPixJogoAP10010421MaisPneu10130054CX() throws InterruptedException {
        homePage.barraDePesquisa("AP100");
        homePage.barraDePesquisa("10421");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1013");
        homePage.barraDePesquisa("0054");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PJNormalBoletoJogoAP10010421MaisPneu10130054CX() throws InterruptedException {
        homePage.barraDePesquisa("AP100");
        homePage.barraDePesquisa("10421");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1013");
        homePage.barraDePesquisa("0054");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PJNormalBoletoJogoAP10010421CX() throws InterruptedException {
        homePage.barraDePesquisa("AP100");
        homePage.barraDePesquisa("10421");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PJNormalPixJogoAP10010421CX() throws InterruptedException {
        homePage.barraDePesquisa("AP100");
        homePage.barraDePesquisa("10421");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PJNormalBoletoPneu10130054CX() throws InterruptedException {
        homePage.barraDePesquisa("1013");
        homePage.barraDePesquisa("0054");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PJNormalPixPneu10130054CX() throws InterruptedException {
        homePage.barraDePesquisa("1013");
        homePage.barraDePesquisa("0054");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PJNormalSplit10130054e10030318CX() throws InterruptedException {
        homePage.barraDePesquisa("1013");
        homePage.barraDePesquisa("0054");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1003");
        homePage.barraDePesquisa("0318");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigoPJ();
        loginPage.senhaUsuarioAntigoPJ();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX1();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());

    }

}
