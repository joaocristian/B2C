package Testes;

import Core.BaseTest;
import Dados.DadosParaTeste;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class J_CompraGuestEntregaRetira extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();

    ItemPage itemPage = new ItemPage();

//COM UM PNEU
    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Pix")
    public void GuestRetiraPixPneu() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        entregaPage.proximoEntregaWait();
        Thread.sleep(1000);
        pagamentoPage.pixWait();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Boleto")
    public void GuestRetiraBoletoPneu() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.boletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Cartão de Crédito")
    public void GuestRetiraCCPneu() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Nupay")
    public void GuestRetiraNupayPneu() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.pneu);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

//COM JOGO
   @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Pix")
    public void GuestRetiraPixJogo() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
       entregaPage.entregaRetiraNovoComEspera();
       Thread.sleep(5000);
       entregaPage.proximoEntregaWait();
       Thread.sleep(5000);
       pagamentoPage.pixWait();
       pagamentoPage.FinalizaSuaComprabkp();
       System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Boleto")
    public void GuestRetiraBoletoJogo() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.boletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Cartão de Crédito")
    public void GuestRetiraCCJogo() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Nupay")
    public void GuestRetiraNupayJogo() throws Exception {
        homePage.barraDePesquisa(DadosParaTeste.jogo);
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco(DadosParaTeste.cep);
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }


    //COM PNEU + JOGO
    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Pix")
    public void GuestRetiraPixJogoMaisPneuCUPOM() throws Exception {
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
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo2xComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.pixWait();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Boleto")
    public void GuestRetiraBoletoJogoMaisPneuCUPOM() throws Exception {
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
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo2xComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.boletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Cartão de Crédito")
    public void GuestRetiraCCJogoMaisPneuCUPOM() throws Exception {
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
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo2xComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Nupay")
    public void GuestRetiraNupayJogoMaisPneuCUPOM() throws Exception {
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
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo2xComEspera();
        Thread.sleep(5000);
        entregaPage.proximoEntregaWait();
        Thread.sleep(5000);
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

}
