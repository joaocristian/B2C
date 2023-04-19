package Testes;

import Core.BaseTest;
import Pages.CarrinhoPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.VitrinePage;
import org.junit.Assert;
import org.junit.Test;


public class A_PrecoAVistaTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();
    private ItemPage itemPage = new ItemPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Test
    public void testBuscarPorItemContinental() throws InterruptedException {
            homePage.barraDePesquisa("IT1600");
        homePage.barraDePesquisa("0050");
        homePage.apertarEnter();
        Assert.assertEquals("R$ 1.104,12",vitrinePage.vitrineObterPrecoAVista());
        Assert.assertEquals("ou 10x de R$ 122,68",vitrinePage.vitrineObterPrecoParcelado());
        vitrinePage.clickItemXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[1]/div[2]/a/img");
        Assert.assertEquals("R$ 1.104,12à vista no cartão de débito ou pix",itemPage.obterPrecoAVistaItem());
        Assert.assertEquals("ou R$ 1.226,80 em até 10x de R$ 122,68 sem juros\n" +
                "Veja mais opções de pagamentos clicando aqui!",itemPage.obterPrecoParceladoItem());
    }
}


