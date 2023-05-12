package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class F_FluxoVendaServicoAvulsoPFCarro extends BaseTest {
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
        //Thread.sleep(5000);
        enderecoPage.btnProximoEndereco();
        //Thread.sleep(10000);
        entregaPage.proximoEntregaWait();
        pagamentoPage.boletoComEspera();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.pix();
        pagamentoPage.finalizaSuaCompra();
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
        pagamentoPage.finalizaSuaCompra();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
}
