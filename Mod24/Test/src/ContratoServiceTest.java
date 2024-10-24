import DAO.ContratoDao;
import DAO.IContratoDao;
import DAO.Mock.ContratoDaoMock;
import Service.ContratoService;
import Service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retonroSalvar = service.salvar();
        Assert.assertEquals("Salvando", retonroSalvar);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoAoSalvar(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService serviceErro = new ContratoService(dao);
        String retonroSalvar = serviceErro.salvar();
        //Assert.assertEquals("Erro ao Salvar", retonroSalvar);

    }

    @Test
    public void buscarTest(){
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoBuscar = service.buscar();
        Assert.assertEquals("Buscando", retornoBuscar);
    }

    @Test
    public void atualizarTest(){
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoAtualizando = service.atualizar();
        Assert.assertEquals("Atualizando", retornoAtualizando);
    }


    @Test
    public void excluirTest(){
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retornoExcluindo = service.excluir();
        Assert.assertEquals("Excluindo", retornoExcluindo);

    }



}
