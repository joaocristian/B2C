package Testes;

import Core.BaseTest;
import Pages.*;
import org.junit.Test;

public class O_FluxoCompraServico extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VitrinePage vitrinePage = new VitrinePage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();
    EnderecoPage enderecoPage = new EnderecoPage();
    EntregaPage entregaPage = new EntregaPage();
    PagamentoPage pagamentoPage = new PagamentoPage();
    VitrineServicos vitrineServicos = new VitrineServicos();

    // COMPRAR SERVIÇOS AVULSOS //
    @Test
    public void comprarDoisOuMaisServicosAvulsosDaMesmaCategoria() throws InterruptedException {
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures","12-16");
         vitrineServicos.quantidadeDePneu("qty","1");
        vitrineServicos.escreverCepCep("04547004");
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
        carrinhoPage.paginainicialOficial();
        homePage.servicosParaCarro();
        vitrineServicos.SelecioneoTipoDeVeiculoComEspera("measures","17-22");
        vitrineServicos.quantidadeDePneu("qty","1");
        vitrineServicos.escreverCepCep("04547004");
        vitrineServicos.calcularCep();
        vitrineServicos.selecioneOPrimeiroServicoASerRealizadoComEspera();
        vitrineServicos.selecioneUmCentroDeMontagemComespera();
        vitrineServicos.concluir();
        carrinhoPage.clickFinalizarCompraComEsperaOficial();
        loginPage.guest();
        enderecoPage.escreverCasa();
        enderecoPage.escreverNumeroDaCasa();
        enderecoPage.btnProximoEnderecoOficial();
        entregaPage.ProximoEntregaComEsperaOficial();
        pagamentoPage.PagBoletoComEspera();
        pagamentoPage.FinalizaSuaCompraOficial();
        System.out.println(pagamentoPage.ObterNumeroPedido());
    }
 }
