package Testes;

import Core.BaseTest;
import Pages.HomePage;
import Pages.VitrinePage;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;

public class E_BuscaPorMedidaTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    @Test
    public void buscaPorMedidaComRunFlat() throws InterruptedException {
        Thread.sleep(1000);
        homePage.buscarPorMedidaLargura("225");
        homePage.buscarPorMedidaPerfil("30");
        homePage.buscarPorMedidaAro("20");
        homePage.btnBuscaMedida();
        vitrinePage.conferirProduto("Pneu Atlas Aro 20 Sport Green 225/30R20 85W XL");
        homePage.clicarNoPneuStore();
    }

    @Test
    public void carrosL950P70A15CX() throws InterruptedException{
        homePage.buscarPorMedidaLargura("225");
        homePage.buscarPorMedidaPerfil("30");
        homePage.buscarPorMedidaAro("20");
        homePage.btnBuscaMedida();
        vitrinePage.conferirProduto("Pneu Atlas Aro 20 Sport Green 225/30R20 85W XL");
        homePage.clicarNoPneuStore();
    }

    @Test
    public void buscaPorVeiculo() throws InterruptedException {
        homePage.buscaPorVeiculo();
        homePage.selecionarMarca("FIAT");
        homePage.selecionarModelo("SIENA");
        homePage.selecionarAno("2005");
        homePage.selecionarVersao("1.0 8V ELX");
        homePage.btnBuscarVeiculo();
        /*Assert.assertEquals("FIAT ", vitrinePage.vitrineBuscaPorVeiculoMarca());
        Assert.assertEquals("SIENA ", vitrinePage.vitrineBuscaPorVeiculoModelo());
        Assert.assertEquals("2005 ", vitrinePage.vitrineBuscaPorVeiculoAno());
        Assert.assertEquals("1.0 8V ELX ", vitrinePage.vitrineBuscaPorVeiculoVersao());*/
    }
}
