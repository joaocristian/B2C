package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class I_CompraGuestEntregaMM extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();

    ItemPage itemPage = new ItemPage();

    String dia = "//*[@id=\"ModalCart\"]/div/div[3]/article[2]/div[3]/div/div[1]/div/div/div[2]/div[2]/div[31]/span";

    //COM UM PNEU
    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega MM, pagamento no Boleto")
    public void GuestMMBoletoPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        Thread.sleep(2000);
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega MM, pagamento no Pix")
    public void GuestMMPixPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu, entrega MM, pagamento no Cartão de Crédito")
    public void GuestMMCCPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um pneu, entrega MM, pagamento no Nupay")
    public void GuestExpressoNupayPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    //COM JOGO
    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega MM, pagamento no Boleto")
    public void GuestMMBoletoJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega MM, pagamento no Pix")
    public void GuestMMPixJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        Thread.sleep(2000);
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix1();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega MM, pagamento no Cartão de Crédito")
    public void GuestMMCCJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Jogo, entrega MM, pagamento no Nupay")
    public void GuestMMNupayJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaMontagemMovel(dia);
        entregaPage.btnProximoEntrega();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    //COM PNEU + JOGO

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega MM, com CUPOM (TONIMEKPASSEIO), pagamento no Pix")
    public void GuestMMPixJogoGO10130051MaisPneu16000061CUPOM() throws InterruptedException{
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
        entregaPage.entregaMontagemMovel2x(dia);
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega MM, com CUPOM (TONIMEKPASSEIO), pagamento no Boleto")
    public void GuestMMBoletoJogoGO10130051MaisPneu16000061CUPOM() throws InterruptedException{
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
        entregaPage.entregaMontagemMovel2x(dia);
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega MM, com CUPOM (TONIMEKPASSEIO), pagamento no Cartão de Crédito")
    public void GuestMMCCJogoGO10130051MaisPneu16000061CUPOM() throws InterruptedException{
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
        entregaPage.entregaMontagemMovel2x(dia);
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra Rápida, com um Pneu + Jogo, entrega MM, com CUPOM (TONIMEKPASSEIO), pagamento no Nupay")
    public void GuestMMNupayJogoGO10130051MaisPneu16000061CUPOM() throws InterruptedException{
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
        entregaPage.entregaMontagemMovel2x(dia);
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}