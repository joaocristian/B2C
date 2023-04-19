package Testes;

import Core.BaseTest;
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
    public void GuestRetiraPixPneu10070194() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        Thread.sleep(1000);
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Boleto")
    public void GuestRetiraBoletoPneu10070194() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Cartão de Crédito")
    public void GuestRetiraCCPneu10070194() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega Retira, pagamento no Nupay")
    public void GuestRetiraNupayPneu10070194() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    //COM JOGO
   @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Pix")
    public void GuestRetiraPixJogoIT16001186() throws Exception {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        Thread.sleep(2000);
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Boleto")
    public void GuestRetiraBoletoJogoIT16001186() throws Exception {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Cartão de Crédito")
    public void GuestRetiraCCJogoIT16001186() throws Exception {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega Retira, pagamento no Nupay")
    public void GuestRetiraNupayJogoIT16001186() throws Exception {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        entregaPage.btnProximoEntrega();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }


    //COM PNEU + JOGO
    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Pix")
    public void GuestRetiraPixJogoGO10130051MaisPneu16000061CUPOM() throws Exception {
        homePage.barraDePesquisa("GO101");
        homePage.barraDePesquisa("30051");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1010");
        homePage.barraDePesquisa("0079");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.fluxoCupom("TONIMEKPASSEIO");
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Boleto")
    public void GuestRetiraBoletoJogoGO10130051MaisPneu16000061CUPOM() throws Exception {
        homePage.barraDePesquisa("GO101");
        homePage.barraDePesquisa("30051");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1010");
        homePage.barraDePesquisa("0079");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.fluxoCupom("TONIMEKPASSEIO");
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Cartão de Crédito")
    public void GuestRetiraCCJogoGO10130051MaisPneu16000061CUPOM() throws Exception {
        homePage.barraDePesquisa("GO101");
        homePage.barraDePesquisa("30051");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1010");
        homePage.barraDePesquisa("0079");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.fluxoCupom("TONIMEKPASSEIO");
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo();
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega Retira, com CUPOM (TONIMEKPASSEIO), pagamento no Nupay")
    public void GuestRetiraNupayJogoGO10130051MaisPneu16000061CUPOM() throws Exception {
        homePage.barraDePesquisa("GO101");
        homePage.barraDePesquisa("30051");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1010");
        homePage.barraDePesquisa("0079");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.fluxoCupom("TONIMEKPASSEIO");
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovo2xComEspera();
        Thread.sleep(2000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

}
