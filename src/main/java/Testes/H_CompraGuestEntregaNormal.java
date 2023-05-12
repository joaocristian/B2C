package Testes;

import Core.BasePage;
import Core.BaseTest;
import Dados.DadosParaTeste;
import Pages.*;
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
    

//COM 1 PNEU
    @Test
    @Order(1)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Boleto")
    public void GuestNormalBoletoPneu() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        Thread.sleep(4000);
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.proximoEndereco();
        Thread.sleep(7000);
        entregaPage.entregaNormalCX();
        Thread.sleep(6000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @Order(2)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Pix")
    public void GuestNormalPixPneu() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.proximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(6000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.pixWait();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @Order(3)
    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Cartão de Crédito")
    public void GuestNormalCCPneu() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(DadosParaTeste.cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
//    @Test
//    @Order(4)
//    @DisplayName("Compra Rápida, com um pneu, entrega normal, pagamento no Nupay")
//    public void GuestExpressoNupayPneu() throws InterruptedException {
//        homePage.barraDePesquisa(DadosParaTeste.pneu);
//        homePage.apertarEnter();
//        vitrinePage.clicarNoProduto();
//        itemPage.clickBtnComprar();
//        carrinhoPage.clickFinalizarCompra();
//        loginPage.guest();
//        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
//        enderecoPage.btnProximoEndereco();
//        Thread.sleep(1000);
//        entregaPage.entregaNormal();
//        Thread.sleep(5000);
//        entregaPage.proximoEntregaWait();
//        Thread.sleep(5000);
//        pagamentoPage.pagNupay();
//        pagamentoPage.FinalizaSuaComprabkp();
//        System.out.println(pagamentoPage.ObterNumeroPedido());
//    }

//COM 1 JOGO
    @Test
    @Order(5)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Pix")
    public void GuestNormalPixJogo() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.proximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(6000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.pixWait();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @Order(6)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Boleto")
    public void GuestNormalBoletoJogo() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.proximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(6000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.boletoComEspera();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Boleto, com Cupom TONIMEKPASSEIO")
    public void GuestNormalBoletoJogoComCupom() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.fluxoCupom(DadosParaTeste.cupom);
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.proximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(6000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.boletoComEspera();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @Order(7)
    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Cartão de crédito")
    public void GuestNormalCCJogo() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(DadosParaTeste.cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
//    @Test
//    @Order(8)
//    @DisplayName("Compra Rápida, com um Jogo de pneus, entrega normal, pagamento no Nupay")
//    public void GuestNormalNupayJogo() throws InterruptedException {
//        homePage.barraDePesquisa(DadosParaTeste.jogo);
//        homePage.apertarEnter();
//        vitrinePage.clicarNoProduto();
//        itemPage.clickBtnComprar();
//        carrinhoPage.clickFinalizarCompra();
//        loginPage.guest();
//        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
//        enderecoPage.btnProximoEndereco();
//        Thread.sleep(1000);
//        entregaPage.entregaNormal();
//        Thread.sleep(5000);
//        entregaPage.proximoEntregaWait();
//        Thread.sleep(5000);
//        pagamentoPage.pagNupay();
//        pagamentoPage.FinalizaSuaComprabkp();
//        System.out.println(pagamentoPage.ObterNumeroPedido());
//    }

//COM 1 PNEU E 1 JOGO
    @Test
    @Order(9)
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Pix")
    public void GuestNormalPixJogoMaisPneu() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(DadosParaTeste.cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.pix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @Order(10)
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Boleto")
    public void GuestNormalBoletoJogoMaisPneu() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(DadosParaTeste.cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(6000);
        entregaPage.entregaNormalCX();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.boletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Cartão de crédito")
    public void GuestNormalCCJogoITMaisPneuSPLIT() throws InterruptedException {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep(DadosParaTeste.cep);
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        Thread.sleep(7000);
        entregaPage.entregaNormalCX();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(6000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
//    @Test
//    @DisplayName("Compra Rápida, com um Pneu + Jogo de pneus, entrega normal, pagamento no Nupay")
//    public void GuestNormalNupayJogoMaisPneuSPLIT() throws InterruptedException {
//        homePage.barraDePesquisa(DadosParaTeste.jogo);
//        homePage.apertarEnter();
//        vitrinePage.clicarNoProduto();
//        itemPage.clickBtnComprar();
//        carrinhoPage.continuarComprando();
//        homePage.barraDePesquisa(DadosParaTeste.pneu);
//        homePage.apertarEnter();
//        vitrinePage.clicarNoProduto();
//        itemPage.clickBtnComprar();
//        carrinhoPage.escreverCep(DadosParaTeste.cep);
//        carrinhoPage.clickCalcularCEP();
//        carrinhoPage.clickFinalizarCompraComEsperaOficial();
//        loginPage.guest();
//        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
//        enderecoPage.btnProximoEndereco();
//        Thread.sleep(1000);
//        entregaPage.entregaNormalCX();
//        Thread.sleep(5000);
//        entregaPage.proximoEntregaWait();
//        Thread.sleep(5000);
//        pagamentoPage.pagNupay();
//        pagamentoPage.FinalizaSuaComprabkp();
//        System.out.println(pagamentoPage.ObterNumeroPedido());
//    }
     @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega MM, com CUPOM (TONIMEKPASSEIO), pagamento no Cartão de Crédito")
    public void GuestBoletoJogoMaisPneuCUPOM() throws InterruptedException{
         homePage.barraDePesquisa(DadosParaTeste.jogo);
         homePage.apertarEnter();
         vitrinePage.clicarNoProduto();
         itemPage.clickBtnComprar();
         carrinhoPage.continuarComprando();
         homePage.barraDePesquisa(DadosParaTeste.pneu);
         homePage.apertarEnter();
         vitrinePage.clicarNoProduto();
         itemPage.clickBtnComprar();
         carrinhoPage.escreverCep(DadosParaTeste.cep);
         carrinhoPage.clickCalcularCEP();
         carrinhoPage.fluxoCupom(DadosParaTeste.cupom);
         carrinhoPage.clickFinalizarCompraComEsperaOficial();
         loginPage.guest();
         enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
         enderecoPage.btnProximoEndereco();
         Thread.sleep(6000);
         entregaPage.entregaNormalCX();
         Thread.sleep(5000);
         entregaPage.proximoEntregaWait();
         Thread.sleep(5000);
         pagamentoPage.boleto();
         pagamentoPage.FinalizaSuaComprabkp();
         System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
