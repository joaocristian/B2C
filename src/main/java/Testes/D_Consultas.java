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
    public void qualPneuVocePrecisaVansEUtilitarios() throws InterruptedException {
        homePage.VansEUtilitarios();
    }
    @Test
    public void qualPneuVocePrecisaBicicleta() throws InterruptedException {
        homePage.Bicicleta();
    }
    @Test
    public void qualPneuVocePrecisaAgricola() throws InterruptedException {
        homePage.PneuDeOTR();
        homePage.Agricola();
    }
    @Test
    public void qualPneuVocePrecisaQuadriciclo() throws InterruptedException {
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
        homePage.marcasPrincipaisMarcasAnteo();
        homePage.marcasPrincipaisMarcasAtlasTire();
        homePage.marcasPrincipaisMarcasBarum();
        homePage.marcasPrincipaisMarcasBFGoodrich();
        homePage.marcasPrincipaisMarcasBorilli();
        homePage.marcasPrincipaisMarcasBridgestone();
        homePage.marcasPrincipaisMarcasCeat();
        homePage.marcasPrincipaisMarcasContinental();
        homePage.clicarConcordo();
        homePage.marcasPrincipaisMarcasCooper();
        homePage.marcasPrincipaisMarcasDRC();
        homePage.marcasPrincipaisMarcasFarroad();
        homePage.marcasPrincipaisMarcasFirestone();
        homePage.marcasPrincipaisMarcasFormula();
        homePage.marcasPrincipaisMarcasGeneralTire();
        homePage.marcasPrincipaisMarcasGoodyear();
        homePage.marcasPrincipaisMarcasHankook();
        homePage.marcasPrincipaisMarcasIra();
        homePage.marcasPrincipaisMarcasIris();
        homePage.marcasPrincipaisMarcasItaro();
        homePage.marcasPrincipaisMarcasJKTyre();
        homePage.marcasPrincipaisMarcasKelly();
        homePage.marcasPrincipaisMarcasKenda();
        homePage.marcasPrincipaisMarcasKoogar();
        homePage.marcasPrincipaisMarcasKumho();
        homePage.marcasPrincipaisMarcasMaggion();
        homePage.marcasPrincipaisMarcasMaxxis();
        homePage.marcasPrincipaisMarcasMetzeler();
        homePage.marcasPrincipaisMarcasMichelin();
        homePage.marcasPrincipaisMarcasMitas();
        homePage.marcasPrincipaisMarcasNexen();
        homePage.marcasPrincipaisMarcasPirelli();
        homePage.marcasPrincipaisMarcasRinaldi();
        homePage.marcasPrincipaisMarcasSestante();
        homePage.marcasPrincipaisMarcasSpeedMax();
        homePage.marcasPrincipaisMarcasSteelmark();
        homePage.marcasPrincipaisMarcasTegrys();
        homePage.marcasPrincipaisMarcasTornel();
        homePage.marcasPrincipaisMarcasVipal();
        homePage.marcasPrincipaisMarcasXBri();
 }
}
