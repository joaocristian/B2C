package Pages;

import Core.BasePage;
import Core.BaseTest;
import Core.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;

public class HomePage extends BasePage {

    VitrinePage vitrinePage = new VitrinePage();
    DriverFactory driverFactory = new DriverFactory();
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public String menuQualPneuVocePrecisa = "Pneus";
    public String menuMarcas = "Marcas";
    public String menu_altaPerformance = "Alta Performance";
    public String menu_passeio ="Passeio";
    public String menu_SUV_Caminhonete ="SUV / Caminhonete";
    public String menu_chevrolet = "Chevrolet";
    public String menu_fiat = "Fiat";
    public String menu_ford = "Ford";
    public String menu_renault = "Renault";
    public String menu_volkswagen ="Volkswagen";

    public String menu_toyota ="Toyota";
    public String menu_custom ="Custom";
    public String menu_off_road = "Off Road";
    public String menu_racing_sport_touring ="Racing / Sport Touring";
    public String menu_scooter = "Scooter";
    public String menu_trail = "Trail";
    public String menu_urbano = "Urbano";
    public String menu_caminhoesEOnibusForadeEstrada="Fora de Estrada";
    public String menu_caminhoesEOnibusMisto = "Misto";
    public  String menu_caminhoesEOnibusRegional ="Regional";
    public String menu_caminhoesEOnibusRodoviario = "Rodoviário";
    public String menu_caminhoesEOnibusUrbano = "Urbano";
    public String menu_vansEUtilitariosAro12 = "Aro 12";
    public String menu_vansEUtilitariosAro13 = "Aro 13";
    public String menu_vansEUtilitariosAro14 = "Aro 14";
    public String menu_vansEUtilitariosAro15 = "Aro 15";
    public String menu_vansEUtilitariosAro16 = "Aro 16";
    public String menu_OTRCaminhaoArticulado = "Caminhão Articulado";
    public String menu_OTRCarregadeira = "Carregadeira";
    public String menu_OTRGuindaste = "Guindaste";
    public String menu_OTRIndustriais = "Industriais";
    public String menu_OTRNiveladora = "Niveladora";
    public String menu_OTRPorto  = "Porto";
    public String menu_OTRRoloCompactador = "Rolo Compactador";
    public String menu_bicicleta = "Bicicleta";
    public String menu_agricolaColheitadeira = "Colheitadeira";
    public String menu_agricolaMaquinaCompacta = "Máquina Compacta";
    public String menu_pneuDeOTR = "Pneu de OTR";
    public String menu_agricola = "Agricola";
    public String getMenu_vansEUtilitarios = "Vans e Utilitários";
    public String menu_agricolaPulverizador = "Pulverizador";
    public String menu_agricolaTratores = "Tratores";
    public String menu_quadricicloPneusParaQuadriciclo = "Quadriciclo";
    public String menu_acessorios = "Acessórios";
    public String menu_acessorios_externo = "Acessórios Externo";
    public String menu_acessorios_interno = "Acessórios Interno";
    public String menu_som_e_video = "Som e Vídeo";
    public String menu_diversos = "Diversos";
    public String menu_camaras_de_ar = "Câmaras de Ar";
    public String menu_camaras_de_ar_para_caminhao = "Câmaras de Ar";
    public String menu_protetor_de_aro = "Protetor de Aro";
    public String menu_acessorios_para_bicicleta = "/html/body/main/nav/div/div/ul/li[2]/div/div/div[2]/div/div[4]/ul/li[3]/a";
    public String menu_camaras_de_ar_para_bicicleta = "/html/body/main/nav/div/div/ul/li[2]/div/div/div[2]/div/div[4]/ul/li[2]/a";
    public String menu_oleo_carro = "Óleo Carro";
    public String menu_oleo_moto = "Óleo Moto";
    public String menu_rodas = "Rodas";
    public String menu_aro15 = "Aro 15";
    public String menu_aro16 = "Aro 16";
    public String menu_aro17 = "Aro 17";
    public String menu_aro18 = "Aro 18";
    public String menu_aro19 = "Aro 19";
    public String menu_aro20 = "Aro 20";
    public String menu_aro22 = "Aro 22";
    public String menu_roda_aluminio = "Alumínio";
    public String menu_roda_aco = "Aço";
    public String menu_marcas = "Marcas";
    public String menu_aeolus = "Aeolus";
    public String menu_Anteo = "Anteo";
    public String menu_AtlasTire = "Atlas Tire";
    public String menu_Barum = "Barum";
    public String menu_BFGoodrich = "BFGoodrich";
    public String menu_Borilli = "Borilli";
    public String menu_bridgestone = "Bridgestone";
    public String menu_ceat = "Ceat";
    public String menu_continental = "Continental";
    public String menu_cooper = "Cooper";
    public String menu_DRC = "DRC";
    public String menu_farroad = "Farroad";
    public String menu_firestone = "Firestone";
    public String menu_formula = "Formula";
    public String menu_generalTire = "General Tire";
    public String menu_goodyear = "Goodyear";
    public String menu_hankook = "Hankook";
    public String menu_ira = "Ira";
    public String menu_iris = "Iris";
    public String menu_itaro = "Itaro";
    public String menu_JKTyre = "JK Tyre";
    public String menu_kelly = "Kelly";
    public String menu_kenda = "Kenda";
    public String menu_koogar = "Koogar";
    public String menu_kumho = "Kumho";
    public String menu_maggion = "Maggion";
    public String menu_maxxis = "Maxxis";
    public String menu_metzeler = "Metzeler";
    public String menu_michelin = "Michelin";
    public String menu_mitas  = "Mitas";
    public String menu_nexen  = "Nexen";
    public String menu_pirelli = "Pirelli";
    public String menu_rinaldi  = "Rinaldi";
    public String menu_sestante  = "Sestante";
    public String menu_speedMax  = "SpeedMax";
    public String menu_steelmark  = "Steelmark";
    public String menu_tegrys = "Tegrys";
    public String menu_tornel = "Tornel";
    public String menu_vipal  = "Vipal";
    public String menu_xBri = "XBri";


    public void clicarNoPneuStore() throws InterruptedException {
        clicarmcomEsperaFixa("/html/body/main/header/div/div[2]/div/a/img");
    }

    public void barraDePesquisa(String id_item){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-site-search-input")));
        escreverSemClear("js-site-search-input",id_item);

    }

    public void servicosParaCarro() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"servicosHomeHome\"]/div/div/div[2]/div[3]/a")));
            clicarLinkLista("Contratar",DriverFactory.url+"servicos-avulsos?vehicleType=auto");
        } catch (Exception ex) {
            clicarLinkLista("Contratar",DriverFactory.url+"servicos-avulsos?vehicleType=auto" );
        }
    }

    public void servicosParaMotos(){
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"servicosHomeHome\"]/div/div/div[2]/div[3]/a")));
            clicarLinkLista("Contratar",DriverFactory.url+ "servicos-avulsos?vehicleType=moto");
        }
        catch (Exception ex){
            clicarLinkLista("Contratar",DriverFactory.url+ "servicos-avulsos?vehicleType=moto");
        }
    }

    public void servicosParaTruck(){
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"servicosHomeHome\"]/div/div/div[2]/div[3]/a")));
            clicarLinkLista("Contratar",DriverFactory.url+ "servicos-avulsos?vehicleType=truck");
        }
        catch (Exception ex){
            clicarLinkLista("Contratar",DriverFactory.url+ "servicos-avulsos?vehicleType=truck");
        }
    }

    public void apertarEnter() throws InterruptedException {
        apertarEnterTeclado("js-site-search-input");
    }

    public void clickLupa(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-7 .glyphicon")));
        cliqueBotaoCSS(".col-md-7 .glyphicon");
    }

    public void clickLupa1(){
        cliqueBotaoXpath("/html/body/main/div[4]/div[1]/div/div/div/div[2]/ul/div/div[1]/a/img");
    }

    public void runFlat(){
        cliqueBotao("searchButtonMeasure");
    }

    /********* Buscar por Medida ************/

    public void btnBuscaMedida(){
        cliqueBotaoXpath("//*[@id=\"searchButtonMeasure\"]");
    }

    public void buscarPorMedidaLargura(String largura){
        selecionarComboValor("tireWidth",largura);
    }

    public void buscarPorMedidaPerfil(String perfil){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tireHeight")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("tireHeight")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("tireHeight")));
        selecionarComboValor("tireHeight",perfil);

    }

    public void buscarPorMedidaAro(String aro){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("tireDiameter")));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("tireDiameter")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tireDiameter")));
        selecionarComboValor("tireDiameter",aro);
    }

    /********* Buscar por Veiculo ************/

    public void btnBuscarVeiculo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vehicleSearchBtn")));
        cliqueBotao("searchButtonVehicle");
    }

    public void buscaPorVeiculo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vehicleSearchBtn")));
        cliqueBotao("vehicleSearchBtn");
    }

    public void selecionarMarca(String marca){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("brand")));
        selecionarComboValor("brand",marca);
    }

    public void selecionarModelo(String modelo){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("model")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("model")));
        selecionarComboValor("model",modelo);
    }

    public void selecionarAno(String ano){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("year")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        selecionarComboValor("year",ano);
    }

    public void selecionarVersao(String versao){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("version")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("version")));
        selecionarComboValor("version",versao);
    }

    /********* Buscar por Placa ************/

    public void btnBuscaPlaca(){cliqueBotao("searchButtonPlate"); }

    public void buscaPorPlaca(){
        cliqueBotao("plateSearchBtn");
    }

    public void escrevrePlaca(String placa){
        escreverTexto("plate", placa );
    }

    /********* Mudar para página de Login ************/
    public void clicarLogin(){
        mouseOverCSSPath("/html/body/main/header/nav[1]/div/div[3]/div/ul/li");
        cliqueBotao("login");
    }

    public void clicarLoginB2C(){
        wait.until(ExpectedConditions.elementToBeClickable(By.className("info-user")));
        clicarComClassName1("info-user");
    }

    public void clicarLoginB2B(){
        cliqueBotaoXpath("//*[@id=\"CustomUserHeader\"]/div/a/span");
    }

    public void clicarMinhaConta(){
        mouseOverCSSPath("/html/body/main/header/div/div[4]/div[1]/div/span");
        //cliqueBotaoXpath("/html/body/main/header/div/div[4]/div[1]/div/div[2]/nav/div[3]/a");
        clicarLink("Minha Conta");
    }

    public void clicarMeusEnderecos(){
        mouseOverCSSPath("/html/body/main/header/div/div[4]/div[1]/div/span");
        clicarLink("Meus Endereços");
    }

    public void clicarMeusPedidos(){
        mouseOverCSSPath("/html/body/main/header/div/div[4]/div[1]/div/span");
        clicarLink("Meus Pedidos");
    }

    /********* Clicar Pneus Passeio ************/

    public  void  clickPneuPasseio(){
        mouseOverXpath("//a[contains(text(),'Qual Pneu você precisa?')]");
        cliqueBotaoXpath("//a[contains(text(),'Qual Pneu você precisa?')]");
        cliqueBotaoXpath("//a[contains(@href, '/categorias/passeio')]");
    }

    public void clickNoMenu(){
        cliqueBotaoXpath("//a[contains(text(),'Qual Pneu você precisa?')]");
    }

    public void pausarMouseNoMenu(String menu){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(menu)));
        mouseOverCSSPath(menu);
    }

    public void pausarMouseNoMenuLink(String menu){
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(menu)));
        mouseOverLink(menu);
    }

    //Busca Por Categoria -  Inicio//
    public void carroAltaPerformance(){
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_altaPerformance);
        vitrinePage.conferirTitulo2("Alta Performance");
        vitrinePage.clicarNaPneuStore();
    }

    public void carroPasseio(){
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_passeio);
        vitrinePage.conferirTitulo2("Passeio");
        vitrinePage.clicarNaPneuStore();
    }

    public void carroSUVCaminhonete() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_SUV_Caminhonete);
        vitrinePage.conferirTitulo2("Suv / Caminhonete");
        vitrinePage.clicarNaPneuStore();
    }

    public void originaisDeFacricaChevrolet() {
        pausarMouseNoMenuLink(menuMarcas);
        clicarLink(menu_chevrolet);
        vitrinePage.conferirTitulo2("Chevrolet");
        vitrinePage.clicarNaPneuStore();
    }

    public void originaisDeFacricaFiat() {
        pausarMouseNoMenuLink(menuMarcas);
        clicarLink(menu_fiat);
        vitrinePage.conferirTitulo2("Fiat");
        vitrinePage.clicarNaPneuStore();
    }

    public void originaisDeFacricaFord() {
        pausarMouseNoMenuLink(menuMarcas);
        clicarLink(menu_ford);
        vitrinePage.conferirTitulo2("Ford");
        vitrinePage.clicarNaPneuStore();
    }

    public void originaisDeFacricaRenault() {
        pausarMouseNoMenuLink(menuMarcas);
        clicarLink(menu_renault);
        vitrinePage.conferirTitulo2("Renault");
        vitrinePage.clicarNaPneuStore();
    }

    public void originaisDeFacricaVolkswagen() {
        pausarMouseNoMenuLink(menuMarcas);
        clicarLink(menu_volkswagen);
        vitrinePage.conferirTitulo2("Volkswagen");
        vitrinePage.clicarNaPneuStore();
    }

    public void originaisDeFacricaToyota() {
        pausarMouseNoMenuLink(menuMarcas);
        clicarLink(menu_toyota);
        vitrinePage.conferirTitulo2("Toyota");
        vitrinePage.clicarNaPneuStore();
    }

    public void MotoCustom() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_custom);
        vitrinePage.conferirTitulo2("Custom");
        vitrinePage.clicarNaPneuStore();
    }

    public void MotoOffRoad() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_off_road);
        vitrinePage.conferirTitulo2("Off Road");
        vitrinePage.clicarNaPneuStore();
    }

    public void MotoRacingSportTouring() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_racing_sport_touring);
        vitrinePage.conferirTitulo2("Racing / Sport Touring");
        vitrinePage.clicarNaPneuStore();
    }

    public void MotoScooter() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_scooter);
        vitrinePage.conferirTitulo2("Scooter");
        vitrinePage.clicarNaPneuStore();
    }

    public void MotoTrail() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_trail);
        vitrinePage.conferirTitulo2("Trail");
        vitrinePage.clicarNaPneuStore();
    }

    public void MotoUrbano() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_urbano);
        vitrinePage.conferirTitulo2("Urbano");
        vitrinePage.clicarNaPneuStore();
    }

    public void CaminhoesEOnibusForadeEstrada() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_caminhoesEOnibusForadeEstrada);
        vitrinePage.conferirTitulo2("Fora de Estrada");
        vitrinePage.clicarNaPneuStore();
    }

    public void CaminhoesEOnibusMisto() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_caminhoesEOnibusMisto);
        vitrinePage.conferirTitulo2("Misto");
        vitrinePage.clicarNaPneuStore();
    }

    public void CaminhoesEOnibusRegional() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_caminhoesEOnibusRegional);
        vitrinePage.conferirTitulo2("Regional");
        vitrinePage.clicarNaPneuStore();
    }

    public void CaminhoesEOnibusRodoviario() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_caminhoesEOnibusRodoviario);
        vitrinePage.conferirTitulo2("Rodoviário");
        vitrinePage.clicarNaPneuStore();
    }

    public void CaminhoesEOnibusUrbano() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_caminhoesEOnibusUrbano);
        vitrinePage.conferirTitulo2("Urbano");
        vitrinePage.clicarNaPneuStore();
    }

    public void VansEUtilitariosAro12() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_vansEUtilitariosAro12);
        vitrinePage.conferirTitulo4("Aro 12");
        vitrinePage.clicarNaPneuStore();
    }

    public void VansEUtilitariosAro13() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_vansEUtilitariosAro13);
        vitrinePage.conferirTitulo4("Aro 13");
        vitrinePage.clicarNaPneuStore();
    }

    public void VansEUtilitariosAro14() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_vansEUtilitariosAro14);
        vitrinePage.conferirTitulo4("Aro 14");
        vitrinePage.clicarNaPneuStore();
    }

    public void VansEUtilitariosAro15() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_vansEUtilitariosAro15);
        vitrinePage.conferirTitulo4("Aro 15");
        vitrinePage.clicarNaPneuStore();
    }

    public void VansEUtilitariosAro16() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_vansEUtilitariosAro16);
        vitrinePage.conferirTitulo4("Aro 16");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRCaminhaoArticulado() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_OTRCaminhaoArticulado);
        vitrinePage.conferirTitulo4("Caminhão Articulado");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRCarregadeira() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_OTRCarregadeira);
        vitrinePage.conferirTitulo2("Carregadeira");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRGuindaste() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_OTRGuindaste);
        vitrinePage.conferirTitulo2("Guindaste");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRIndustriais() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_OTRIndustriais);
        vitrinePage.conferirTitulo2("Industriais");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRNiveladora() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_OTRNiveladora);
        vitrinePage.conferirTitulo2("Niveladora");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRPorto() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_OTRPorto);
        vitrinePage.conferirTitulo2("Porto");
        vitrinePage.clicarNaPneuStore();
    }

    public void OTRRoloCompactador() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_OTRRoloCompactador);
        vitrinePage.conferirTitulo2("Rolo Compactador");
        vitrinePage.clicarNaPneuStore();
    }

/*    public void BicicletaGravel() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_bicicletaGravel);
        vitrinePage.conferirTitulo2("Gravel");
        vitrinePage.clicarNaPneuStore();
    }

    public void BicicletaMTB() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_bicicletaMTB);
        vitrinePage.conferirTitulo2("MTB");
        vitrinePage.clicarNaPneuStore();
    }

    public void BicicletaSpeed() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_bicicletaSpeed);
        vitrinePage.conferirTitulo2("Pneus Speed");
        vitrinePage.clicarNaPneuStore();
    }

    public void BicicletaUrbano() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_bicicletaUrbano);
        vitrinePage.conferirTitulo2("Urbano");
        vitrinePage.clicarNaPneuStore();
    }
*/
    public void Bicicleta() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_bicicleta);
        vitrinePage.conferirTitulo3("Pneus de Bicicleta");
        vitrinePage.clicarNaPneuStore();
    }

    public void AgricolaColheitadeira() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_agricolaColheitadeira);
        vitrinePage.conferirTitulo2("Colheitadeira");
        vitrinePage.clicarNaPneuStore();
    }

    public void AgricolaMaquinaCompacta() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_agricolaMaquinaCompacta);
        vitrinePage.conferirTitulo2("Máquina Compacta");
        vitrinePage.clicarNaPneuStore();
    }

    public void AgricolaPulverizador() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_agricolaPulverizador);
        vitrinePage.conferirTitulo2("Pulverizador");
        vitrinePage.clicarNaPneuStore();
    }

    public void AgricolaTratores() {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLink(menu_agricolaTratores);
        vitrinePage.conferirTitulo2("Tratores");
        vitrinePage.clicarNaPneuStore();
    }

    public void QuadricicloPneusParaQuadriciclo() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_quadricicloPneusParaQuadriciclo);
        vitrinePage.conferirTitulo3("Pneus de Quadriciclo");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaCarroAcessoriosExterno() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_acessorios_externo);
        vitrinePage.conferirTitulo2("Acessórios Externo");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaCarroAcessoriosInterno() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_acessorios_interno);
        vitrinePage.conferirTitulo2("Acessórios Interno");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaCarroSomeVideo() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_som_e_video);
        vitrinePage.conferirTitulo2("Som e Vídeo");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaMotosDiversos() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_diversos);
        vitrinePage.conferirTitulo2("Diversos - Moto");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaMotosCamarasDeAr() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_camaras_de_ar);
        vitrinePage.conferirTitulo2("Câmaras de Ar");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaCaminhaoCamarasDeAr() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_camaras_de_ar_para_caminhao);
        vitrinePage.conferirTitulo2("Câmaras de Ar");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaCaminhaoProtetorDeAro() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_protetor_de_aro);
        vitrinePage.conferirTitulo2("Protetor de Aro");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaBicicletaAcessoriosParaBicicleta() {
        pausarMouseNoMenuLink(menu_acessorios);
        cliqueBotaoXpath(menu_acessorios_para_bicicleta);
        vitrinePage.conferirTitulo2("Diversos - Bicicleta");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosAcessoriosParaBicicletaCamarasDeAr() {
        pausarMouseNoMenuLink(menu_acessorios);
        cliqueBotaoXpath(menu_camaras_de_ar_para_bicicleta);
        vitrinePage.conferirTitulo2("Câmaras de Ar");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosLubrificantesOleoCarro() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_oleo_carro);
        vitrinePage.conferirTitulo2("Óleo para Carro");
        vitrinePage.clicarNaPneuStore();
    }

    public void acessoriosLubrificantesOleoMoto() {
        pausarMouseNoMenuLink(menu_acessorios);
        clicarLink(menu_oleo_moto);
        vitrinePage.conferirTitulo2("Óleo para Moto");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasEsportivasAro15() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLinkComEspera(menu_aro15);
        vitrinePage.conferirTitulo("Aro 15");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasEsportivasAro17() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLink(menu_aro17);
        vitrinePage.conferirTitulo("Aro 17");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasEsportivasAro18() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLink(menu_aro18);
        vitrinePage.conferirTitulo("Aro 18");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasEsportivasAro19() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLink(menu_aro19);
        vitrinePage.conferirTitulo("Aro 19");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasEsportivasAro20() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLink(menu_aro20);
        vitrinePage.conferirTitulo("Aro 20");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasEsportivasAro22() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLinkComEspera(menu_aro22);
        vitrinePage.conferirTitulo("Aro 22");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasCaminhaoAluminio() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLink(menu_roda_aluminio);
        vitrinePage.conferirTitulo("Alumínio");
        vitrinePage.clicarNaPneuStore();
    }

    public void rodasCaminhaoAco() throws InterruptedException {
        pausarMouseNoMenuLink(menu_rodas);
        clicarLink(menu_roda_aco);
        vitrinePage.conferirTitulo("Aço");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasAosen() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_aeolus);
        vitrinePage.conferirTitulo("Aeolus");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasAnteo() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_Anteo);
        vitrinePage.conferirTitulo4("Anteo");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasAtlasTire() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_AtlasTire);
        vitrinePage.conferirTitulo4("Atlas");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasBarum() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_Barum);
        vitrinePage.conferirTitulo4("Barum");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasBFGoodrich() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_BFGoodrich);
        vitrinePage.conferirTitulo("Pneus BFGoodrich");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasBorilli() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_Borilli);
        vitrinePage.conferirTitulo("Borilli");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasBridgestone() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_bridgestone);
        vitrinePage.conferirTitulo("Pneus Bridgestone");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasCeat() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_ceat);
        vitrinePage.conferirTitulo("Ceat");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasContinental() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_continental);
        vitrinePage.conferirTitulo4("Pneus Continental");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasCooper() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_cooper);
        vitrinePage.conferirTitulo("Pneus Cooper");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasDRC() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_DRC);
        vitrinePage.conferirTitulo("Pneus DRC");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasFarroad() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_farroad);
        vitrinePage.conferirTitulo("Pneus Farroad");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasFirestone() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_firestone);
        vitrinePage.conferirTitulo("Pneus Firestone");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasFormula() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_formula);
        vitrinePage.conferirTitulo("Formula");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasGeneralTire() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_generalTire);
        vitrinePage.conferirTitulo4("Pneus General Tire");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasGoodyear() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_goodyear);
        vitrinePage.conferirTitulo("Pneus Goodyear");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasHankook() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_hankook);
        vitrinePage.conferirTitulo4("Pneus Hankook");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasIra() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_ira);
        vitrinePage.conferirTitulo4("Ira");
        vitrinePage.clicarNaPneuStore();
    }
    public void marcasPrincipaisMarcasIris() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_iris);
        vitrinePage.conferirTitulo4("Iris");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasItaro() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_itaro);
        vitrinePage.conferirTitulo4("Pneus Itaro");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasJKTyre() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_JKTyre);
        vitrinePage.conferirTitulo4("Jk Tyre");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasKelly() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_kelly);
        vitrinePage.conferirTitulo4("Kelly");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasKenda() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_kenda);
        vitrinePage.conferirTitulo4("Kenda");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasKoogar() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_koogar);
        vitrinePage.conferirTitulo4("Koogar");
        vitrinePage.clicarNaPneuStore();
    }
    public void marcasPrincipaisMarcasKumho() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_kumho);
        vitrinePage.conferirTitulo4("Pneus Kumho");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasMaggion() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_maggion);
        vitrinePage.conferirTitulo4("Maggion");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasMaxxis() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_maxxis);
        vitrinePage.conferirTitulo4("Maxxis");
        vitrinePage.clicarNaPneuStore();
    }
    public void marcasPrincipaisMarcasMetzeler() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_metzeler);
        vitrinePage.conferirTitulo4("Pneus Metzeler");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasMichelin() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_michelin);
        vitrinePage.conferirTitulo4("Pneus Michelin");
        vitrinePage.clicarNaPneuStore();
    }


    public void marcasPrincipaisMarcasMitas() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_mitas);
        vitrinePage.conferirTitulo4("Mitas");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasNexen() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_nexen);
        vitrinePage.conferirTitulo4("Nexen");
        vitrinePage.clicarNaPneuStore();
    }
    public void marcasPrincipaisMarcasPirelli() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLinkComEspera(menu_pirelli);
        vitrinePage.conferirTitulo4("Pneus Pirelli");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasRinaldi() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_rinaldi);
        vitrinePage.conferirTitulo4("Rinaldi");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasSestante() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_sestante);
        vitrinePage.conferirTitulo4("Sestante");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasSpeedMax() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        Thread.sleep(1000);
        clicarLink(menu_speedMax);
        vitrinePage.conferirTitulo4("Speedmax");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasSteelmark() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_steelmark);
        vitrinePage.conferirTitulo("Steelmark");
        vitrinePage.clicarNaPneuStore();
    }
    public void marcasPrincipaisMarcasTegrys() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_tegrys);
        vitrinePage.conferirTitulo("Pneus Tegrys");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasTornel() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_tornel);
        vitrinePage.conferirTitulo("Pneus Tornel");
        vitrinePage.clicarNaPneuStore();
    }
    public void marcasPrincipaisMarcasVipal() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_vipal);
        vitrinePage.conferirTitulo("Vipal");
        vitrinePage.clicarNaPneuStore();
    }

    public void marcasPrincipaisMarcasXBri() throws InterruptedException {
        pausarMouseNoMenuLink(menu_marcas);
        clicarLink(menu_xBri);
        vitrinePage.conferirTitulo("Xbri");
        vitrinePage.clicarNaPneuStore();
    }
   public void getstorefeedshopbackl() {
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get(driverFactory.url+"/get-store-feed/shopback");
        driver.quit();
    }

    public void getstorefeedgooglemerchant() {
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get(driverFactory.url+"/get-store-feed/google_merchant");
        driver.quit();
    }

    public void getstorefeedpromotionprice() {
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get(driverFactory.url+"/get-store-feed/promotion_price");
        driver.quit();
    }

    public void sitemapxml() {
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get(driverFactory.url + "/sitemap.xml");
        String site = (driverFactory.url + "/sitemap.xml");
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<sitemapindex xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">\n" +
                "\t<sitemap>\n" +
                "\t\t\t<loc>https://cxpneustore.eastus.cloudapp.azure.com</loc>\n" +
                "\t\t\t<lastmod>2020-03-17</lastmod>\n" +
                "\t\t</sitemap>\n" +
                "\t<sitemap>\n" +
                "\t\t\t<loc>https://cxpneustore.eastus.cloudapp.azure.com</loc>\n" +
                "\t\t\t<lastmod>2020-03-17</lastmod>\n" +
                "\t\t</sitemap>\n" +
                "\t<sitemap>\n" +
                "\t\t\t<loc>https://cxpneustore.eastus.cloudapp.azure.com</loc>\n" +
                "\t\t\t<lastmod>2020-03-17</lastmod>\n" +
                "\t\t</sitemap>\n" +
                "\t</sitemapindex>",obterTextoComPathDoArquivo("/html/body",site));
        driver.quit();
    }
    //Busca Por Categoria -  Fim//


    public void carrosL560P100R15() throws InterruptedException {
        buscarPorMedidaLargura("5.60");
        buscarPorMedidaPerfil("100");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL560PsR15() throws InterruptedException {
        buscarPorMedidaLargura("5.60");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL950P70R15() throws InterruptedException {
        buscarPorMedidaLargura("9.50");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL950P75R15() throws InterruptedException {
        buscarPorMedidaLargura("9.50");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL950PsR15() throws InterruptedException {
        buscarPorMedidaLargura("9.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1050P105R15() throws InterruptedException {
        buscarPorMedidaLargura("10.50");
        buscarPorMedidaPerfil("10.5");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1050P8R15() throws InterruptedException {
            buscarPorMedidaLargura("10.50");
            buscarPorMedidaPerfil("8");
            buscarPorMedidaAro("15");
            btnBuscaMedida();
            clicarNoPneuStore();
    }

    public void carrosL1050P31R15() throws InterruptedException {
        buscarPorMedidaLargura("10.50");
        buscarPorMedidaPerfil("31");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL1050P33R15() throws InterruptedException {
        buscarPorMedidaLargura("10.50");
        buscarPorMedidaPerfil("33");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1050P70R15() throws InterruptedException {
        buscarPorMedidaLargura("10.50");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1050P75R15() throws InterruptedException {
        buscarPorMedidaLargura("10.50");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1050PsR15() throws InterruptedException {
        buscarPorMedidaLargura("10.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1150P70R15() throws InterruptedException {
        buscarPorMedidaLargura("11.50");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1150P75R15() throws InterruptedException {
        buscarPorMedidaLargura("11.50");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1150PsR15() throws InterruptedException {
        buscarPorMedidaLargura("11.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P70R15() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        vitrinePage.conferirProduto("Pneu BFGoodrich Aro 15 Mud Terrain T/A KM2 TL 35x12.5R15 113Q 6 Lonas");
        clicarNoPneuStore();
    }

    public void carrosL1250P70R17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        vitrinePage.conferirProduto("Pneu General Tire Aro 17 Grabber AT2 35X12.50R17 119Q LT");
        clicarNoPneuStore();
    }

    public void carrosL1250P75R17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        vitrinePage.conferirProduto("Pneu BFGoodrich Aro 17 All Terrain T/A KO2 37x12.5R17 124R 8 Lonas");
        clicarNoPneuStore();
    }

    public void carrosL1250PsR15() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250PsR17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250PsR18() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250PsR20() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155P60R15() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155P70R14() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL155PsR14() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL155PsR15() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL165P35R17() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165P35R18() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL165P40R17() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }
    public void carrosL165P40R18() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }
    public void carrosL165P45R15() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165P60R14() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL165P65R13() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL165P65R14() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165P70R13() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165P70R14() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL165PsR13() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165PsR14() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165PsR15() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL165PsR17() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL165PsR18() throws InterruptedException {
        buscarPorMedidaLargura("165");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P45R18() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P55R15() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P55R20() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P60R13() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P60R15() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P60R19() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P65R14() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P65R15() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P70R13() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P70R14() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P75R13() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175P75R14() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P80R14() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P80R19() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175P90R14() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("90");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175PsR13() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175PsR14() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175PsR15() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL175PsR18() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P35R17() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P45R15() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P55R15() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P55R16() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P60R14() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P60R15() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P65R14() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P65R15() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P70R13() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P70R14() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185P70R15() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185PsR13() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("13");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185PsR14() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185PsR15() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185PsR16() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL185PsR17() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P40R17() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P45R15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P45R16() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL195P45R17() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL195P50R15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P50R16() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P55R15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P55R16() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P60R14() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P60R15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL195P60R16() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P65R14() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P65R15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P70R14() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195P80R15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195PsR14() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195PsR15() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195PsR16() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL195PsR17() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL195PsR18() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P30R20() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("30");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P35R18() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P35R19() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P40R17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P40R18() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P40R19() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P45R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P45R17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P45R18() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P50R17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P55R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL2155P55R17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL2155P55R18() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P60R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P60R17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P65R15() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P65R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P65R17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P70R14() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P70R15() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P70R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215P75R15() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P75R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P80R15() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P80R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215P85R15() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("85");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }
    public void carrosL215P85R16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("85");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }
    public void carrosL215PsR14() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL215PsR15() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215PsR16() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215PsR17() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215PsR18() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215PsR19() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL215PsR20() throws InterruptedException {
        buscarPorMedidaLargura("215");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P35R18() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P40R17() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL205P40R18() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P45R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P45R17() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P45R18() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P50R15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P50R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P50R17() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P55R15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P55R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P55R17() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P60R15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P60R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P65R15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P65R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P70R14() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P70R15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL205P70R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL205P75R15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205PsR14() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205PsR15() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205PsR16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205PsR17() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205PsR18() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P30R20() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("30");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P35R18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P35R19() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P35R20() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P40R18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P40R19() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225P40R20() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("40");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225P45R17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P45R18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P45R19() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("45");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P50R16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P50R17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P50R18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P55R16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P55R17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P55R18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P55R19() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("55");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P60R15() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P60R16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P60R17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P60R18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("60");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P65R16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P65R17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("65");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225P70R14() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225P70R15() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P70R16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225P70R17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225P75R15() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225P75R16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225PsR14() throws InterruptedException {

        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL225PsR15() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225PsR16() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225PsR17() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL225PsR18() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225PsR19() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL225PsR20() throws InterruptedException {
        buscarPorMedidaLargura("225");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    /*public void carrosL1150P32R15() throws InterruptedException {
        buscarPorMedidaLargura("11.50");
        buscarPorMedidaPerfil("32");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }*/

    public void carrosL1250P10R17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("10");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P33R15() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("33");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P33R17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("33");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P33R18() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("33");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P33R20() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("33");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P35R15() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P35R17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250P35R18() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL1250P35R20() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL1250P35R22() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("22");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL1250P37R17() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("37");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1250PsR22() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("22");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL950P30R15() throws InterruptedException {
        buscarPorMedidaLargura("9.50");
        buscarPorMedidaPerfil("30");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL175PsR19() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL175PsR20() throws InterruptedException {
        buscarPorMedidaLargura("175");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }
    public void carrosL185P75R14() throws InterruptedException {
        buscarPorMedidaLargura("185");
        buscarPorMedidaPerfil("75");
        buscarPorMedidaAro("14");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void clicarConcordo() {
        cliqueBotaoXpath("//*[@id=\"consent-management-alert\"]/ul/li/div[2]/button");
    }

    public void clicarAceito() {
        trocarAlerta();
        cliqueBotaoXpath1("//*[@id=\"CustomCookiesAlert\"]/div/div/div[2]/button[1]");
    }

    public void carrosL1250P50R20() throws InterruptedException {
        buscarPorMedidaLargura("12.50");
        buscarPorMedidaPerfil("50");
        buscarPorMedidaAro("20");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL1150P32R15() throws InterruptedException {
        buscarPorMedidaLargura("11.50");
        buscarPorMedidaPerfil("32");
        buscarPorMedidaAro("15");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL155P70R17() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL155P70R19() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("70");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155P80R19() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155P90R18() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("90");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155PsR17() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("17");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155PsR18() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL155PsR19() throws InterruptedException {
        buscarPorMedidaLargura("155");
        buscarPorMedidaPerfil("--");
        buscarPorMedidaAro("19");
        btnBuscaMedida();
        clicarNoPneuStore();
        Thread.sleep(2000);
    }

    public void carrosL195P35R18() throws InterruptedException {
        buscarPorMedidaLargura("195");
        buscarPorMedidaPerfil("35");
        buscarPorMedidaAro("18");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void carrosL205P80R16() throws InterruptedException {
        buscarPorMedidaLargura("205");
        buscarPorMedidaPerfil("80");
        buscarPorMedidaAro("16");
        btnBuscaMedida();
        clicarNoPneuStore();
    }

    public void PneuDeOTR() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_pneuDeOTR);
        vitrinePage.conferirTitulo3("Pneus de OTR");
        vitrinePage.clicarNaPneuStore();
    }

    public void Agricola() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(menu_agricola);
        vitrinePage.conferirTitulo4("Pneus Agrícolas");
        vitrinePage.clicarNaPneuStore();
    }

    public void VansEUtilitarios() throws InterruptedException {
        pausarMouseNoMenuLink(menuQualPneuVocePrecisa);
        clicarLinkComEspera(getMenu_vansEUtilitarios);
        vitrinePage.conferirTitulo3("Pneus de Vans e Utilitários");
        vitrinePage.clicarNaPneuStore();
    }
}
