package Testes;

import Core.BaseTest;
import Pages.HomePage;
import org.junit.Test;

public class D_Consultas extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void qualPneuVocePrecisaCARRO(){
        homePage.carroAltaPerformance();
        homePage.carroPasseio();
        homePage.carroSUVCaminhonete();
    }

    @Test
    public void qualPneuVocePrecisaOriginaisDeFabrica(){
        homePage.originaisDeFacricaChevrolet();
        homePage.originaisDeFacricaFiat();
        homePage.originaisDeFacricaFord();
        homePage.originaisDeFacricaRenault();
        homePage.originaisDeFacricaVolkswagen();
        homePage.originaisDeFacricaToyota();
    }

    @Test
    public void qualPneuVocePrecisaMOTO(){
        homePage.MotoCustom();
        homePage.MotoOffRoad();
        homePage.MotoRacingSportTouring();
        homePage.MotoScooter();
        homePage.MotoTrail();
        homePage.MotoUrbano();
    }

    @Test
    public void qualPneuVocePrecisaCaminhoesEOnibus(){
        homePage.CaminhoesEOnibusForadeEstrada();
        homePage.CaminhoesEOnibusMisto();
        homePage.CaminhoesEOnibusRegional();
        homePage.CaminhoesEOnibusRodoviario();
        homePage.CaminhoesEOnibusUrbano();
    }

    @Test
    public void qualPneuVocePrecisaVansEUtilitarios(){
        homePage.VansEUtilitariosAro12();
        homePage.VansEUtilitariosAro13();
        homePage.VansEUtilitariosAro14();
        homePage.VansEUtilitariosAro15();
        homePage.VansEUtilitariosAro16();
    }

    @Test
    public void qualPneuVocePrecisaOTR(){
        homePage.OTRCaminhaoArticulado();
        homePage.OTRCarregadeira();
        homePage.OTRGuindaste();
        homePage.OTRIndustriais();
        homePage.OTRNiveladora();
        homePage.OTRPorto();
        homePage.OTRRoloCompactador();
    }

    @Test
    public void qualPneuVocePrecisaBicicleta(){
        homePage.BicicletaGravel();
        homePage.BicicletaMTB();
        homePage.BicicletaSpeed();
        homePage.BicicletaUrbano();
    }

    @Test
    public void qualPneuVocePrecisaAgricola(){
        homePage.AgricolaColheitadeira();
        homePage.AgricolaMaquinaCompacta();
        homePage.AgricolaPulverizador();
        homePage.AgricolaTratores();
    }

    @Test
    public void qualPneuVocePrecisaQuadriciclo(){
        homePage.QuadricicloPneusParaQuadriciclo();
    }

    @Test
    public void acessoriosAcessoriosParaCarro(){
        homePage.acessoriosAcessoriosParaCarroAcessoriosExterno();
        homePage.acessoriosAcessoriosParaCarroAcessoriosInterno();
    }

    @Test
    public void acessoriosAcessoriosParaMoto(){
        homePage.acessoriosAcessoriosParaMotosDiversos();
        homePage.acessoriosAcessoriosParaMotosCamarasDeAr();
    }

    @Test
    public void acessoriosAacessoriosParaCaminhao(){
        homePage.acessoriosAcessoriosParaCaminhaoCamarasDeAr();
        homePage.acessoriosAcessoriosParaCaminhaoProtetorDeAro();
    }

    @Test
    public void acessoriosAcessoriosParaBicicleta(){
        homePage.acessoriosAcessoriosParaBicicletaAcessoriosParaBicicleta();
        homePage.acessoriosAcessoriosParaBicicletaCamarasDeAr();
    }

    @Test
    public void acessoriosLubrificantes() {
        homePage.acessoriosLubrificantesOleoCarro();
        homePage.acessoriosLubrificantesOleoMoto();
    }

    @Test
    public void rodasEsportivas() throws InterruptedException {
        homePage.rodasEsportivasAro15();
        homePage.rodasEsportivasAro17();
        homePage.rodasEsportivasAro18();
        homePage.rodasEsportivasAro19();
        homePage.rodasEsportivasAro20();
        homePage.rodasEsportivasAro22();
    }

    @Test
    public void rodasCaminhao() throws InterruptedException {
        homePage.rodasCaminhaoAluminio();
        homePage.rodasCaminhaoAco();
    }

    @Test
    public void marcasPrincipaisMarcas() throws InterruptedException {
        homePage.marcasPrincipaisMarcasAosen();
        homePage.marcasPrincipaisMarcasBFGoodrich();
        homePage.marcasPrincipaisMarcasBridgestone();
        homePage.marcasPrincipaisMarcasContinental();
        homePage.marcasPrincipaisMarcasCooper();
        homePage.marcasPrincipaisMarcasDRC();
        homePage.marcasPrincipaisMarcasFarroad();
        homePage.marcasPrincipaisMarcasFirestone();
        homePage.marcasPrincipaisMarcasGeneralTire();
        homePage.marcasPrincipaisMarcasGoodyear();
        homePage.marcasPrincipaisMarcasHankook();
        homePage.marcasPrincipaisMarcasKumho();
        homePage.marcasPrincipaisMarcasMetzeler();
        homePage.marcasPrincipaisMarcasMichelin();
        homePage.marcasPrincipaisMarcasPirelli();
        homePage.marcasPrincipaisMarcasTegrys();
        homePage.marcasPrincipaisMarcasTornel();
 }

}
