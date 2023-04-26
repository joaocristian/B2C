package Testes;

import Core.BaseTest;
import Pages.CarrinhoPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.VitrinePage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class A_PrecoAVistaTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();
    private ItemPage itemPage = new ItemPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();

    //DADOS PARA O TESTE//
    String pneuItaro = "IT16000050";String vitrinePrecoAVista = "R$ 1.159,59";String vitrinePrecoParcelado = "ou 10x de R$ 131,77";String precoAVistaItem = "R$ 1.159,59no PIX";
    String precoParceladoItem = "ou R$ 1.317,72 em até 10x de R$ 131,77 sem juros\n" +
            "Veja mais opções de pagamentos clicando aqui!";

    String pneuContinental = "10120084";String vitrinePrecoAVistaContinental = "R$ 579,90";String vitrinePrecoParceladoContinental = "ou 10x de R$ 65,90";String precoAVistaItemContinental = "R$ 579,90no PIX";
    String precoParceladoItemContinental = "ou R$ 658,98 em até 10x de R$ 65,90 sem juros\n" +
            "Veja mais opções de pagamentos clicando aqui!";

    @Test
    public void testBuscarPorItemContinental() throws InterruptedException {
        homePage.barraDePesquisa(pneuItaro);
        homePage.apertarEnter();
        Assert.assertEquals(vitrinePrecoAVista,vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals(vitrinePrecoParcelado,vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[1]/div[2]/a/img");
        Assert.assertEquals(precoAVistaItem,itemPage.obterPrecoAVistaItem());
        Assert.assertEquals(precoParceladoItem,itemPage.obterPrecoParceladoItem());
    }

    @Test
    public void testBuscarPorItemContinentalCX() throws InterruptedException {
        homePage.barraDePesquisa(pneuContinental);
        homePage.apertarEnter();
        Assert.assertEquals(vitrinePrecoAVistaContinental,vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals(vitrinePrecoParceladoContinental,vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[1]/div[2]/a/img");
        Assert.assertEquals(precoAVistaItemContinental,itemPage.obterPrecoAVistaItem());
        Assert.assertEquals(precoParceladoItemContinental,itemPage.obterPrecoParceladoItem());
    }
}


