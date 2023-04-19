package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class K_CompraPFEntregaNormal extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    ItemPage itemPage = new ItemPage();
    B_CadastroTest cadastro = new B_CadastroTest();

    @Test
    @DisplayName("Compra PF, com um pneu, entrega normal, pagamento no Boleto")
    public void PFNormalBoletoPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um pneu, entrega normal, pagamento no Pix")
    public void PFNormalPixPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um pneu, entrega normal, pagamento no Cartão de Crédito")
    public void PFNormalCCPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um pneu, entrega normal, pagamento no Nupay")
    public void PFNormalNupayPneu10070194() throws InterruptedException {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }



    //COM 1 JOGO
    @Test
    @DisplayName("Compra PF, com um Jogo de pneus, entrega normal, pagamento no Pix")
    public void PFNormalPixJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra PF, com um Jogo de pneus, entrega normal, pagamento no Boleto")
    public void PFNormalBoletoJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompra();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um Jogo de pneus, entrega normal, pagamento no Cartão de crédito")
    public void PFNormalCCJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um Jogo de pneus, entrega normal, pagamento no Nupay")
    public void PFNormalNupayJogoIT16001186() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    //COM 1 PNEU E 1 JOGO
    @Test
    @DisplayName("Compra PF, com um Pneu + Jogo de pneus, entrega normal, pagamento no Pix")
    public void PFNormalPixJogoIT16001186MaisPneu10070194SPLIT() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar1();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um Pneu + Jogo de pneus, entrega normal, pagamento no Boleto")
    public void PFNormalBoletoJogoIT16001186MaisPneu10070194SPLIT() throws InterruptedException {
        homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar1();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormal();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    @DisplayName("Compra PF, com um Pneu + Jogo de pneus, entrega normal, pagamento no Cartão de crédito")
    public void PFNormalCCJogoIT16001186MaisPneu10070194SPLIT() throws InterruptedException {
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
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Compra PF, com um Pneu + Jogo de pneus, entrega normal, pagamento no Nupay")
    public void PFNormalNupayJogoIT16001186MaisPneu10070194SPLIT() throws InterruptedException {
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
        cadastro.fazerCadastroPFNovoNoPedido();
        enderecoPage.escreverDadosDoEndereco04547004();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
