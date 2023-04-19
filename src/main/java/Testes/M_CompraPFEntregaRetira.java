package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class M_CompraPFEntregaRetira extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    ItemPage itemPage = new ItemPage();

    @Test
    @DisplayName("Fazer um pedido b2c - PF - entrega Retira - Boleto")
    public void fluxoCompletoBoletoItemPorPesquisaNormalRetira() throws Exception {
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        vitrinePage.clickItemXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[1]/div[2]/a/img");
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera4();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }


    @Test
    @DisplayName("Fazer um pedido b2c - PF - entrega Retira - PIX")
    public void fluxoCompletoPixItemPorPesquisaNormalRetira() throws Exception {
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaRetiraNovoComEspera4();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPixbkp();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PFRetiraSplitPneu10120114MaisPneu10070194() throws Exception {
        homePage.barraDePesquisa("1012");
        homePage.barraDePesquisa("0114");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        entregaPage.entregaRetiraNovoComEspera();
        entregaPage.entregaRetiraNovo2xComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Fazer um pedido b2c com split - PF - entrega Retira - PIX")
    public void fluxoCompletoComSplitPixItemPorPesquisaNormalRetiraCUPOM() throws Exception {
        homePage.barraDePesquisa("1012");
        homePage.barraDePesquisa("0114");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.continuarComprando();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.escreverCep("04547004");
        carrinhoPage.clickCalcularCEP();
        carrinhoPage.fluxoCupom("TONIMEKPASSEIO");
        entregaPage.entregaRetiraNovoComEspera();
        entregaPage.entregaRetiraNovo2xComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PFNormalPixJogoAP10010558MaisPneu10130054CX() throws InterruptedException {
        homePage.barraDePesquisa("KH100");
        homePage.barraDePesquisa("30210");
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
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PFNormalBoletoJogoAP10010558MaisPneu10130054CX() throws InterruptedException {
        homePage.barraDePesquisa("AP100");
        homePage.barraDePesquisa("10558");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1013");
        homePage.barraDePesquisa("0054");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void PFNormalBoletoPneu10130054JogoAP10010421CX() throws InterruptedException {
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
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());

    }

    @Test
    public void PFNormalPixPneu10130054JogoAP10010421CX() throws InterruptedException {
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
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.selecionaroEndereco04547006CX();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaComprabkp();
        System.out.println(pagamentoPage.ObterNumeroPedido());

    }

    @Test
    @DisplayName("Fazer um pedido b2c - PF - entrega normal - Boleto")
    public void fluxoCompletoBoletoItemPorPesquisaNormal() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();;
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalCX();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }


    @Test
    @DisplayName("Fazer um pedido b2c - PF - entrega normal - PIX")
    public void fluxoCompletoPix() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
         enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalExpresso();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Fazer um pedido b2c - PF - entrega normal - PIX")
    public void fluxoCompletoCartaoCredito() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalExpresso();
        entregaPage.btnProximoEntrega();
        pagamentoPage.fluxoPagCartaoCredito();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    @DisplayName("Fazer um pedido b2c - PF - entrega normal - PIX")
    public void fluxoCompletoNupay() throws Exception {
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        homePage.clickLupa();
        vitrinePage.ClickComprar();
        carrinhoPage.clickFinalizarCompra();
        loginPage.emailUsuarioAntigo1();
        loginPage.senhaUsuarioAntigo1();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.entregaNormalExpresso();
        entregaPage.btnProximoEntrega();
        pagamentoPage.pagNupay();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
