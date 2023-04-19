package Testes;

import Core.BaseTest;
import Pages.CarrinhoPage;
import Pages.HomePage;
import Pages.ItemPage;
import Pages.VitrinePage;
import org.junit.Test;


public class D_TireSelector extends BaseTest {
    private HomePage homePage = new HomePage();
    private VitrinePage vitrinePage = new VitrinePage();
    private ItemPage itemPage = new ItemPage();
    private CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Test
    public void carrosL560() throws InterruptedException {
        homePage.carrosL560P100R15();
        homePage.carrosL560PsR15();
    }

    @Test
    public void carrosL950() throws InterruptedException {
        //homePage.carrosL950P70R15();
        //homePage.carrosL950P75R15();
        homePage.carrosL950P30R15();
        homePage.carrosL950PsR15();
    }

    @Test
    public void carrosL1050() throws InterruptedException {
        //homePage.carrosL1050P105R15();
        homePage.carrosL1050P8R15();
        homePage.carrosL1050P31R15();
        homePage.carrosL1050P33R15();
        //homePage.carrosL1050P70R15();
        //homePage.carrosL1050P75R15();
        homePage.carrosL1050PsR15();
    }
    @Test
    public void carrosL1150() throws InterruptedException {
        //homePage.carrosL1150P70R15();
        //homePage.carrosL1150P75R15();
        homePage.carrosL1150P32R15();
        homePage.carrosL1150PsR15();
    }

    @Test
    public void carrosL1250() throws InterruptedException {
        homePage.carrosL1250P10R17();
        homePage.carrosL1250P33R20();
        homePage.carrosL1250P35R15();
        homePage.carrosL1250P35R17();
        /*homePage.carrosL1250P50R20();
        homePage.carrosL1250P70R15();
        homePage.carrosL1250P70R17();
        homePage.carrosL1250P75R17();
        homePage.carrosL1250PsR15();
        homePage.carrosL1250PsR17();
        homePage.carrosL1250PsR18();*/
        homePage.carrosL1250PsR20();
    }

    @Test
    public void carrosL155() throws InterruptedException {
        homePage.carrosL155P60R15();
        homePage.carrosL155P70R14();
        homePage.carrosL155P70R17();
        homePage.carrosL155P70R19();
        homePage.carrosL155P80R19();
        homePage.carrosL155P90R18();
        homePage.carrosL155PsR14();
        homePage.carrosL155PsR15();
        homePage.carrosL155PsR17();
        homePage.carrosL155PsR18();
        homePage.carrosL155PsR19();
    }

    @Test
    public void carrosL165() throws InterruptedException {
        homePage.carrosL165P35R17();
        //homePage.carrosL165P35R18();
        homePage.carrosL165P40R17();
        homePage.carrosL165P45R15();
        homePage.carrosL165P60R14();
        //homePage.carrosL165P65R13();
        homePage.carrosL165P65R14();
        homePage.carrosL165P70R13();
        homePage.carrosL165P70R14();
        homePage.carrosL165PsR13();
        homePage.carrosL165PsR14();
        homePage.carrosL165PsR15();
        homePage.carrosL165PsR17();
        homePage.carrosL165PsR18();
    }

    @Test
    public void carrosL175() throws InterruptedException {
        //homePage.carrosL175P45R18();
        homePage.carrosL175P55R15();
        homePage.carrosL175P60R13();
        homePage.carrosL175P60R15();
        homePage.carrosL175P65R14();
        Thread.sleep(1000);
        homePage.carrosL175P65R15();
        homePage.carrosL175P70R13();
        homePage.carrosL175P70R14();
        homePage.carrosL175P80R14();
        //homePage.carrosL175P90R14();
        homePage.carrosL175PsR13();
        homePage.carrosL175PsR14();
        homePage.carrosL175PsR15();
        //homePage.carrosL175PsR18();
        homePage.carrosL175PsR19();
    }

    @Test
    public void carrosL185() throws InterruptedException {
        homePage.carrosL185P35R17();
        //homePage.carrosL185P45R15();
        homePage.carrosL185P55R15();
        homePage.carrosL185P55R16();
        homePage.carrosL185P60R14();
        homePage.carrosL185P60R15();
        homePage.carrosL185P65R14();
        homePage.carrosL185P65R15();
        homePage.carrosL185P70R13();
        homePage.carrosL185P70R14();
        //homePage.carrosL185P70R15();
        homePage.carrosL185P75R14();
        homePage.carrosL185PsR13();
        homePage.carrosL185PsR14();
        homePage.carrosL185PsR15();
        homePage.carrosL185PsR16();
        homePage.carrosL185PsR17();
    }

    @Test
    public void carrosL195() throws InterruptedException {
        homePage.carrosL195P35R18();
        homePage.carrosL195P40R17();
        homePage.carrosL195P45R15();
        homePage.carrosL195P45R16();
        homePage.carrosL195P50R15();
        homePage.carrosL195P50R16();
        homePage.carrosL195P55R15();
        homePage.carrosL195P55R16();
        homePage.carrosL195P60R14();
        homePage.carrosL195P60R15();
        homePage.carrosL195P60R16();
        //homePage.carrosL195P65R14();
        homePage.carrosL195P65R15();
        homePage.carrosL195P70R14();
        //homePage.carrosL195P80R15();
        homePage.carrosL195PsR14();
        homePage.carrosL195PsR15();
        homePage.carrosL195PsR16();
        homePage.carrosL195PsR17();
    }

    @Test
    public void carrosL205() throws InterruptedException {
        homePage.carrosL205P35R18();
        homePage.carrosL205P40R17();
        homePage.carrosL205P40R18();
        homePage.carrosL205P45R16();
        homePage.carrosL205P45R17();
        homePage.carrosL205P45R18();
        homePage.carrosL205P50R15();
        Thread.sleep(1000);
        homePage.carrosL205P50R16();
        homePage.carrosL205P50R17();
        homePage.carrosL205P55R15();
        homePage.carrosL205P55R16();
        homePage.carrosL205P55R17();
        homePage.carrosL205P60R15();
        homePage.carrosL205P60R16();
        homePage.carrosL205P65R15();
        homePage.carrosL205P65R16();
        homePage.carrosL205P70R14();
        homePage.carrosL205P70R15();
        homePage.carrosL205P75R15();
        homePage.carrosL205P80R16();
        homePage.carrosL205PsR14();
        homePage.carrosL205PsR15();
        homePage.carrosL205PsR16();
        homePage.carrosL205PsR17();
        homePage.carrosL205PsR18();
    }

    @Test
    public void carrosL215() throws InterruptedException {
        homePage.carrosL215P30R20();
        homePage.carrosL215P35R18();
        homePage.carrosL215P35R19();
        homePage.carrosL215P40R17();
        homePage.carrosL215P40R18();
        //homePage.carrosL215P40R19();
        homePage.carrosL215P45R16();
        homePage.carrosL215P45R17();
        homePage.carrosL215P45R18();
        homePage.carrosL215P50R17();
        homePage.carrosL215P55R16();
        homePage.carrosL2155P55R17();
        homePage.carrosL2155P55R18();
        homePage.carrosL215P60R16();
        homePage.carrosL215P60R17();
        homePage.carrosL215P65R15();
        homePage.carrosL215P65R16();
        homePage.carrosL215P70R14();
        homePage.carrosL215P70R15();
        homePage.carrosL215P70R16();
        homePage.carrosL215P75R15();
        //homePage.carrosL215P80R16();
        homePage.carrosL215P85R16();
        homePage.carrosL215PsR15();
        homePage.carrosL215PsR16();
        homePage.carrosL215PsR17();
        homePage.carrosL215PsR18();
        homePage.carrosL215PsR19();
        homePage.carrosL215PsR20();
    }

    @Test
    public void carrosL225() throws InterruptedException {
        homePage.carrosL225P30R20();
        homePage.carrosL225P35R18();
        homePage.carrosL225P35R19();
        homePage.carrosL225P35R20();
        homePage.carrosL225P40R18();
        homePage.carrosL225P40R19();
        homePage.carrosL225P45R17();
        homePage.carrosL225P45R18();
        homePage.carrosL225P45R19();
        homePage.carrosL225P50R16();
        homePage.carrosL225P50R17();
        homePage.carrosL225P50R18();
        homePage.carrosL225P55R16();
        homePage.carrosL225P55R17();
        homePage.carrosL225P55R18();
        homePage.carrosL225P55R19();
        homePage.carrosL225P60R15();
        //homePage.carrosL225P60R16();
        Thread.sleep(1000);
        homePage.carrosL225P60R17();
        homePage.carrosL225P60R18();
        //homePage.carrosL225P65R16();
        homePage.carrosL225P65R17();
        homePage.carrosL225P70R15();
        homePage.carrosL225P70R16();
        homePage.carrosL225P75R15();
        homePage.carrosL225P75R16();
        homePage.carrosL225PsR15();
        homePage.carrosL225PsR16();
        homePage.carrosL225PsR17();
        homePage.carrosL225PsR18();
        homePage.carrosL225PsR19();
        homePage.carrosL225PsR20();
    }

}


