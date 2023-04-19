package Testes;

import Core.BaseTest;
import Pages.CarrinhoPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.VitrinePage;
import org.junit.Test;


public class N_ConferirFiles extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();
    private ItemPage itemPage = new ItemPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Test
    public void conferirFiles(){
        homePage.getstorefeedshopbackl();
        homePage.getstorefeedgooglemerchant();
        homePage.getstorefeedpromotionprice();
        homePage.sitemapxml();
    }

}


