package SuiteTestes;


import Testes.*;
import org.junit.internal.runners.SuiteMethod;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        A_PrecoAVistaTest.class,
        B_CadastroTest.class,
        C_MinhaConta.class,
        D_TireSelector.class,
        E_BuscaPorMedidaTest.class,
        G_CarrinhoTest.class,
        D_Consultas.class,
        F_FluxoVendaServicoAvulsoGuestCarro.class,
        //F_FluxoVendaServicoAvulsoGuestMoto.class,
        F_FluxoVendaServicoAvulsoGuestTruck.class,
        F_FluxoVendaServicoAvulsoPFCarro.class,
        //F_FluxoVendaServicoAvulsoPFMoto.class,
        F_FluxoVendaServicoAvulsoPFTruck.class,
        H_CompraGuestEntregaNormal.class,
        I_CompraGuestEntregaMM.class,
        J_CompraGuestEntregaRetira.class,
        K_CompraPFEntregaNormal.class,
        L_CompraPFEntregaMM.class,
        M_CompraPFEntregaRetira.class,
        N_ConferirFiles.class,
        O_FluxoCompraServico.class,
        Z_FluxoCompraTestPJ.class

})

public class Testes {
    }
