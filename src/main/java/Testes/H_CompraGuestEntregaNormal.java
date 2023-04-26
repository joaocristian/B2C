package Testes;

import Core.BasePage;
import Core.BaseTest;
import Pages.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;

public class H_CompraGuestEntregaNormal extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    ItemPage itemPage = new ItemPage();
    BasePage basePage = new BasePage();

    String pneu = "10120084";
    String jogo = "IT16001186";
    String cep = "04547004";


    //COM 1 PNEU
    @Test
    @Order(1)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Boleto")
    public void GuestNormalBoletoPneu() throws InterruptedException {
        homePage.barraDePesquisa(pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        //Thread.sleep(1000);
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        //Thread.sleep(1000);
        entregaPage.entregaNormal();
        //Thread.sleep(6000);
        entregaPage.btnProximoEntrega();
        //Thread.sleep(6000);
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(2)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Pix")
    public void GuestNormalPixPneu() throws InterruptedException {
        homePage.barraDePesquisa(pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.entregaNormal();
        Thread.sleep(5000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(3)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Cartão de Crédito")
    public void GuestNormalCCPneu() throws InterruptedException {
        homePage.barraDePesquisa(pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.entregaNormal();
        Thread.sleep(5000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(4)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Nupay")
    public void GuestExpressoNupayPneu() throws InterruptedException {
        homePage.barraDePesquisa(pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.entregaNormal();
        Thread.sleep(5000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }



    //COM 1 JOGO
    @Test
    @Order(5)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Pix")
    public void GuestNormalPixJogo() throws InterruptedException {
        homePage.barraDePesquisa(jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(6)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Boleto")
    public void GuestNormalBoletoJogo() throws InterruptedException {
        homePage.barraDePesquisa(jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.entregaNormal();
        Thread.sleep(5000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(7)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Cartão de crédito")
    public void GuestNormalCCJogo() throws InterruptedException {
        homePage.barraDePesquisa(jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(8)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Nupay")
    public void GuestNormalNupayJogo() throws InterruptedException {
        homePage.barraDePesquisa(jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.entregaNormal();
        Thread.sleep(5000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.PagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    //COM 1 PNEU E 1 JOGO
    @Test
    @Order(9)
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Pix")
    public void GuestNormalPixJogoMaisPneu() throws InterruptedException {
        homePage.barraDePesquisa(jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa(pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @Order(10)
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Boleto")
    public void GuestNormalBoletoJogoMaisPneu() throws InterruptedException {
        homePage.barraDePesquisa(jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa(pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.entregaNormalCX();
        Thread.sleep(5000);
        entregaPage.btnProximoEntrega();
        Thread.sleep(5000);
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Cartão de crédito")
    public void GuestNormalCCJogoIT16001186MaisPneu10070194SPLIT() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Nupay")
    public void GuestNormalNupayJogoIT16001186MaisPneu10070194SPLIT() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
