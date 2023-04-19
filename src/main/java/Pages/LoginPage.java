package Pages;

import Core.BasePage;
import Core.GeradorDeCPF;
import Core.GeradorCNPJ;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Core.DriverFactory.getDriver;

public class LoginPage  extends BasePage {
    GeradorDeCPF geradorDeCPF = new GeradorDeCPF();
    GeradorCNPJ geradorCNPJ = new GeradorCNPJ();

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    public String verificarLogin(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logged")));
        return obterTexto(By.id("logged"));
    }

    public String verificarLogin2(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("logged_in")));
        return obterTexto(By.className("logged_in"));
    }

    public String verificarLogin1(){
        return obterTexto(By.id("logged"));
    }

    public void logar(){
        emailUsuarioAntigo();
        senhaUsuarioAntigo();
        btnEntrar();
        verificarLogin();
    }


    /********* Usuário Nupay ************/
    /***********************************/

    public void emailUsuarioNupay(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
        escreverTexto("j_username","joao.carvalho@cantustore.com.br");
    }

    public void senhaUsuarioNupay(){
        escreverTexto("j_password","123456");
    }

    /********* Usuário Nupay ************/



    /********* Usuário Antigo ************/

    public void emailUsuarioAntigo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
        escreverTexto("j_username","joao.carvalho@cantustore.com.br");
    }

    public void senhaUsuarioAntigo(){
        escreverTexto("j_password","Cantu@2023");
    }

    public void emailUsuarioAntigo1(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
        escreverTexto("j_username","user1602023@cantu.com");
    }

    public void senhaUsuarioAntigo1(){
        escreverTexto("j_password","Cantu@2023");
    }

    public void emailUsuarioAntigo2(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
        escreverTexto("j_username","joaocristian2013@gmail.com");
    }

    public void senhaUsuarioAntigo2(){
        escreverTexto("j_password","Cantu@2023");
    }

    public void emailUsuarioAntigo3(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
        escreverTexto("j_username","fhi_pneu@yopmail.com");
    }

    public void senhaUsuarioAntigo3(){
        escreverTexto("j_password","Cantu@2023");
    }

    public void btnEntrar(){
        cliqueBotao("btn-login");
    }

    public void btnEntrarComEspera(){
        clicarComEsperaID("btn-login");
    }

    /********* Usuário Novo PF ************/

    public void primeiroNomeUsuarioNovo(String nome){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("register.firstName")));
        escreverTexto("register.firstName",nome);
    }

    public void NomeGuest(String nome){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("guest.name")));
        escreverTexto("guest.name",nome);
    }

    public void ultimoNomeUsuarioNovo(String ultimo){
        escreverTexto("register.lastName",ultimo);        }

    public void cpfUsuarioNovo(){
        escreverTexto("register.cpf",geradorDeCPF.geraCPFFinal());
        System.out.println(geradorDeCPF.geraCPFFinal());
    }

    public void dataNascimentoUsuarioNovo(String data){
        escreverTexto("register.birthDay",data);
    }

    public void telefoneUsuarioNovo(String tel){
        escreverTexto("register.phone",tel);
    }

    static String emailnovo = "";
    public void emailUsuarioNovo(){
        String email =  (RandomStringUtils.randomAlphabetic (3)+"ps@selenium.com");
        escreverTexto("register.email",email);
        emailnovo = email;
        System.out.println(emailnovo);
    }

    public void criarSenhaUsuarioNovo(String password){
        escreverTexto("password",password);
    }

    public void confirmarSenhaUsuarioNovo(String confirmarpassword){
        escreverTexto("register.checkPwd",confirmarpassword);
    }

    public void termosUsuarioNovo(){
        cliqueBotaoXpath("/html/body/main/div[5]/div/div/div[2]/div/div/div/form/div[10]/div/div/div/label");
    }

    public void termosUsuarioNovoB2C(){
        cliqueBotaoXpath("//*[@id=\"grupoLevelRegisterForm\"]/div[10]");
    }

    public void termosUsuarioNovo1(){
        cliqueBotaoXpath("/html/body/main/div[5]/div/div/div[2]/div/div/div/div/div/div[3]/form/div[10]/div/div/div/label");
    }

    public void termosUsuarioNovo2(){
        cliqueBotaoXpath("//*[@id=\"grupoLevelRegisterForm\"]/div[10]/div/div/div/label");
    }
    public void btnFinalizarCadastro(){
        cliqueBotao("registerBtn");
    }

    public void btnFinalizarCadastro1(){
        clicarComClassName("alert-text");
        cliqueBotao("registerBtn");
    }

    public void btnFinalizarCadastrobkp(){
        clicarComEsperaID("registerBtn");
    }

    public void btnFinalizarCadastrobkp1(){
        clicarComEsperaID1("registerBtn");
    }

    /********* Usuário Novo PJ ************/

    public void emailUsuarioAntigoPJ(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("j_username")));
        escreverTexto("j_username","joao.carvalho.pj@cantu.com");
    }

    public void senhaUsuarioAntigoPJ(){
        escreverTexto("j_password","@Teste2022");
    }

    public void btnPJ(){
        cliqueBotaoXpath("//*[@id=\"grupoLevelRegisterForm\"]/div[1]/div/label[2]");
    }

    public void btnPJ1(){
        //cliqueRadio("type2");
        cliqueBotaoXpath("//*[@id=\"grupoLevelRegisterForm\"]/div[1]/div/label[2]");
    }

    public void razaoSocial(String razaosocial){
        escreverTexto("register.corporatename",razaosocial);
        }

    public void nomeFantasia(String nomefantasia){
        escreverTexto("register.tradingname",nomefantasia);
    }

    public void CNPJConsulta() throws InterruptedException {
        escreverTexto("register.cnpj","04006739000161");
        Thread.sleep(25000);
        escreverTexto("register.phone","47999880200");
        emailUsuarioNovo();
        criarSenhaUsuarioNovo("Cantu@2023");
        confirmarSenhaUsuarioNovo("Cantu@2023");
        termosUsuarioNovo();
        btnFinalizarCadastro();
    }

    public void CNPJSemConsulta() throws InterruptedException {
        escreverTexto("register.cnpj","07960285000151");
        Thread.sleep(25000);
        escreverTexto("register.corporatename","Razão Social");
        escreverTexto("register.tradingname","Nome Fantasia");
        escreverTexto("register.phone","47999880200");
        emailUsuarioNovo();
        criarSenhaUsuarioNovo("Cantu@2023");
        confirmarSenhaUsuarioNovo("Cantu@2023");
        termosUsuarioNovo();
        btnFinalizarCadastro();
    }

    public void CNPJbkp()  {
        escreverTexto("register.cnpj","07960285000151");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("register.corporatename")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("register.corporatename")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("register.corporatename")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("register.ienumber")));

    }

    public void guest() throws InterruptedException {
        Thread.sleep(1000);
        cliqueBotaoXpath("//*[@id=\"registerType\"]/div/div/div[1]/label");
        NomeGuest("Guest");
        escreverTexto("guest.cpf",geradorDeCPF.geraCPFFinal());
        escreverTexto("guest.phone","4798989898");
        escreverTexto("guest.email",geradorDeCPF.geraCPFFinal()+"@cantuteste.com");
        cliqueBotaoXpath("//*[@id=\"guestForm\"]/div[5]/div/div/label");
        cliqueBotaoXpath("//*[@id=\"guestForm\"]/div[6]/div/div/label");
        Thread.sleep(1000);
        cliqueBotao("registerGuestBtn");
    }

    public void guest1() throws InterruptedException {
        Thread.sleep(1000);
        cliqueBotaoXpath("//*[@id=\"registerType\"]/div/div/div[1]/label");
        NomeGuest("Guest");
        escreverTexto("guest.cpf",geradorDeCPF.geraCPFFinal());
        escreverTexto("guest.phone","4798989898");
        escreverTexto("guest.email",geradorDeCPF.geraCPFFinal()+"@cantu.com");
        cliqueBotaoXpath("//*[@id=\"guestForm\"]/div[5]/div/div/label");
        cliqueBotaoXpath("//*[@id=\"guestForm\"]/div[6]/div/div/label");
        Thread.sleep(1000);
        cliqueBotaoXpath1("\"//*[@id=\\\"consent-management-alert\\\"]/ul/li/div[2]/button\"");
        cliqueBotao("registerGuestBtn");
    }

    public void cnpjUsuarioNovo() {
        escreverTexto("register.cnpj",geradorCNPJ.geraCNPJ());
    }
}