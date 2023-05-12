package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class F_FluxoVendaServicoAvulsoGuestMoto extends BaseTest {
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
    public void comprarServicoDeMotoCustomDianteiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "custom");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoCustomTraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "custom");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoCustomDianteiroETraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "custom");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR_FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoStreetDianteiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "street");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoStreetTraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "street");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoStreetDianteiroETraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "street");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR_FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
     public void comprarServicoDeMotoTrailDianteiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "trail");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoTrailTraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "trail");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoTrailDianteiroETraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "trail");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR_FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoBigTrailDianteiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "big-trail");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoBigTrailTraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "big-trail");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoBigTrailDianteiroETraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "big-trail");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR_FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
     public void comprarServicoDeMotoScooterDianteiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "scooter");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoScooterTraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "scooter");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoScooterDianteiroETraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "scooter");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR_FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoSportTouringDianteiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "sport-touring");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoSportTouringTraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "sport-touring");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    @Test
    public void comprarServicoDeMotoSportTouringDianteiroETraseiro() throws InterruptedException {
        homePage.servicosParaMotos();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "sport-touring");
        vitrineServicos.posicaoDoVeiculo("vehiclePosition","REAR_FRONT");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.boleto();
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
