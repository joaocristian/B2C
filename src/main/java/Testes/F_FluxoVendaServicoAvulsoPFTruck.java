package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class F_FluxoVendaServicoAvulsoPFTruck extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    VitrineServicos vitrineServicos = new VitrineServicos();

    ItemPage itemPage = new ItemPage();
    String cep = "04547004";
    @Test
    public void comprarServicoDeTruckPesadoExtraPesadoCombo1e2PF() throws Exception {
        homePage.servicosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "Pesado / Extra Pesado");
        vitrineServicos.quantidadeDePneu("qty", "2");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeTruckPesadoExtraPesadoCombo3e4PF() throws Exception {
        homePage.servicosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "Pesado / Extra Pesado");
        vitrineServicos.quantidadeDePneu("qty", "2");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeTruck34Combo1e2PF() throws Exception {
        homePage.servicosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "3/4");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverEnderecoGuestVindoDoCarrinho();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeTruck34Combo3e4PF() throws Exception {
        homePage.servicosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "3/4");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
