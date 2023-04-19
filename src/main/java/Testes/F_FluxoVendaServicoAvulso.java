package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;

public class F_FluxoVendaServicoAvulso extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    VitrineServicos vitrineServicos = new VitrineServicos();

    ItemPage itemPage = new ItemPage();
    String cep;

    {
        cep = "88310-350";
    }

    // PF //
    //CARROS//
    @Test
    public void comprarServicoDeCarroPasseioAro12_16Qtdd1ComboCom1e2() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo();
        loginPage.senhaUsuarioAntigo();
        loginPage.btnEntrar();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioAro12_16Qtdd1ComboCom3e4() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioAro17_22Qtdd1Combo1e2() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "17-22");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioAro17_22Qtdd1Combo3e4() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "17-22");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioVanUtilitarioQtdd1Combo1e2() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "van-utilitario");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioVanUtilitarioQtdd1Combo3e4() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "van-utilitario");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioRunflatQtdd1Combo1e2() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "runflat");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioRunflatQtdd1Combo3e4() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "runflat");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPixbkp();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioSUVQtdd1Combo1e2() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "SUV");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado1();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioSUVQtdd1Combo3e4() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "SUV");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();

        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }



    //TRUCK //
    @Test
    public void comprarServicoDeTruckPesadoExtraPesadoCombo1e2PF() throws Exception {
        homePage.serviçosParaTruck();
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeTruckPesadoExtraPesadoCombo3e4PF() throws Exception {
        homePage.serviçosParaTruck();
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
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeTruck34Combo1e2PF() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "3/4");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverEndereçoGuestVindoDoCarrinho();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeTruck34Combo3e4PF() throws Exception {
        homePage.serviçosParaTruck();
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    //TRUCK //
    //PF//

    //GUEST//
    //CARRO//
    @Test
    public void comprarServicoDeCarroPasseioAro12_16Qtdd1ComboCom1e2guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioAro12_16Qtdd1ComboCom3e4guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioAro17_22Qtdd1Combo1e2guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "17-22");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioAro17_22Qtdd1Combo3e4guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "17-22");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPixbkp();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioVanUtilitarioQtdd1Combo1e2guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "van-utilitario");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    @Test
    public void comprarServicoDeCarroPasseioVanUtilitarioQtdd1Combo3e4guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "van-utilitario");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioRunflatQtdd1Combo1e2guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "runflat");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPixbkp();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioRunflatQtdd1Combo3e4guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "runflat");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioSUVQtdd1Combo1e2guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "SUV");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeCarroPasseioSUVQtdd1Combo3e4guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "SUV");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado1();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoParaConferirNomeDaOficina() throws InterruptedException {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "SUV");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", "05513100");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    // CARROS//


    //TRUCK //
    @Test
    public void comprarServicoDeTruckPesadoExtraPesadoCombo1e2() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "Pesado / Extra Pesado");
        vitrineServicos.quantidadeDePneu("qty", "2");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeTruckPesadoExtraPesadoCombo3e4() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "Pesado / Extra Pesado");
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
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeTruck34Combo1e2() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "3/4");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverEndereçoGuestVindoDoCarrinho();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarServicoDeTruck34Combo3e4() throws Exception {
        homePage.serviçosParaTruck();
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    //TRUCK //
    //GUEST//



    //MOTO//
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
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
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
    //MOTO//


    //Compras variadas de serviços//
    @Test
    public void comprarAro12_16eAro17_22guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "17-22");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado1();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_16eAro17_22PF() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "17-22");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.escolherEndereco();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_16_1e2_3_4guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_16_1e2_3_4PF() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
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
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_163e4MaisPneuSemRetiraPF() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar2();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.btnProximoEndereco();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    @Test
    public void comprarAro12_163e4MaisPneuSemRetiraGuest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverEndereçoGuestVindoDoCarrinho();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagNupay();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_163e4MaisPneuComRetiraPF() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.btnProximoEndereco();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_163e4MaisPneuComRetiraGuest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverEndereçoGuestVindoDoCarrinho();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_161e2MaisPneuComRetiraVan1e2Guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1203");
        homePage.barraDePesquisa("0001");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar1();
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverEndereçoGuestVindoDoCarrinho();
        entregaPage.btnProximoEntrega();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_161e2MaisPneuComRetira12_16_1e2Guest() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.conferirProduto("Montagem + Balanceamento + Alinhamento dianteiro (Aro 12 - 16) (Até 2 pneus)","//*[@id=\"loadItems\"]/div[1]/a/span");
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1007");
        homePage.barraDePesquisa("0194");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.conferirProduto("R$ 169,90",
                "//*[@id=\"rowService\"]/div[2]");
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.conferirProduto("Montagem + Balanceamento + Alinhamento dianteiro (Aro 12 - 16) (Até 2 pneus)",
                "//*[@id=\"rowService\"]/div[3]/p");
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco("04547006");
        enderecoPage.btnProximoEndereco();
        Thread.sleep(1000);
        entregaPage.ProximoEntregaComEspera();
        Thread.sleep(3000);
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarAro12_161e2MaisPneuComRetira12_16_1e2PF() throws Exception {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "12-16");
        vitrineServicos.quantidadeDePneu("qty", "1");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem();
        vitrineServicos.concluirComEspera();
        carrinhoPage.conferirProduto("Montagem + Balanceamento + Alinhamento dianteiro (Aro 12 - 16) (Até 2 pneus)","//*[@id=\"loadItems\"]/div[1]/a/span");
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1600");
        homePage.barraDePesquisa("1186");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        carrinhoPage.conferirProduto("R$ 169,90",
                "//*[@id=\"rowService\"]/div[2]");
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.conferirProduto("Montagem + Balanceamento + Alinhamento dianteiro (Aro 12 - 16) (Até 2 pneus)",
                "//*[@id=\"rowService\"]/div[3]/p");
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEspera();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarTruck34ComPneupesadoGuest() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "3/4");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem1();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1600");
        homePage.barraDePesquisa("0152");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        entregaPage.entregaRetiraNovo();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

    @Test
    public void comprarTruck34ComPneupesadoPF() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "3/4");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado1();
        vitrineServicos.selecioneUmCentroDeMontagem1();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1600");
        homePage.barraDePesquisa("0152");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        entregaPage.entregaRetiraNovo();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarTruckPesadoComPneupesadoGuest() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures", "Pesado / Extra Pesado");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem1();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1600");
        homePage.barraDePesquisa("0152");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        Thread.sleep(1000);
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverDadosDoEndereco("04547006");
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagPix();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }

    @Test
    public void comprarTruckPesadoComPneupesadoPF() throws Exception {
        homePage.serviçosParaTruck();
        vitrineServicos.SelecioneoTipoDeVeiculo("measures", "Pesado / Extra Pesado");
        vitrineServicos.quantidadeDePneu("qty", "3");
        vitrineServicos.informeSeuCEP("cep", cep);
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOSegundoServicoASerRealizado();
        vitrineServicos.selecioneUmCentroDeMontagem1();
        vitrineServicos.concluirComEspera();
        carrinhoPage.continuarComprandoComEspera();
        homePage.barraDePesquisa("1600");
        homePage.barraDePesquisa("0152");
        homePage.apertarEnter();
        vitrinePage.clicarNoProduto();
        itemPage.clickBtnComprar();
        entregaPage.entregaRetiraNovoComEspera();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.emailUsuarioAntigo3();
        loginPage.senhaUsuarioAntigo3();
        loginPage.btnEntrar();
        enderecoPage.btnProximoEndereco();
        entregaPage.ProximoEntregaComEsperaPreprod();
        pagamentoPage.PagBoleto();
        pagamentoPage.FinalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido1());
    }

}
