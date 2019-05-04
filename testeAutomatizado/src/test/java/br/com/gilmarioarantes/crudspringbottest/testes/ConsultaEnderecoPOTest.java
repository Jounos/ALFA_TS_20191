package br.com.gilmarioarantes.crudspringbottest.testes;

<<<<<<< HEAD
import java.util.concurrent.TimeUnit;

=======
import br.com.gilmarioarantes.crudspringbottest.InstanciaDriver;
import br.com.gilmarioarantes.crudspringbottest.paginas.PaginaConsultaCep;
import br.com.gilmarioarantes.crudspringbottest.paginas.PaginaResultadoConsulta;
>>>>>>> e8dc13738aa14d1f800952a6f886d27e004214d6
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

<<<<<<< HEAD
import br.com.gilmarioarantes.crudspringbottest.InstanciaDriver;
import br.com.gilmarioarantes.crudspringbottest.paginas.PaginaConsultaCep;
import br.com.gilmarioarantes.crudspringbottest.paginas.PaginaResultadoConsulta;

public class ConsultaEnderecoPOTest {
	
	private WebDriver driver;
	private PaginaConsultaCep consultaCep;
	private PaginaResultadoConsulta resultado;
	
	@BeforeTest
	public void setUp() {
		
		this.driver = InstanciaDriver.getDriver();
		
		 driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		    
		consultaCep = new PaginaConsultaCep(driver);
		resultado = new PaginaResultadoConsulta(driver);
	}
	
	@Test
	public void consultaporCep() {
		
		consultaCep.informarCep("743935980");
		consultaCep.consultar();
		Assert.assertTrue(resultado.getGridResultadoConsulta().getText().contains("Rua SR 7"));
	}
=======
import java.util.concurrent.TimeUnit;

public class ConsultaEnderecoPOTest {

    private WebDriver driver;
    private PaginaConsultaCep consultaCep;
    private PaginaResultadoConsulta resultado;

    @BeforeTest
    public void setup(){
        this.driver = InstanciaDriver.getDriver();
        driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        consultaCep = new PaginaConsultaCep(this.driver);
        resultado = new PaginaResultadoConsulta(this.driver);
    }

    @Test
    public void consultaPorCep(){
        consultaCep.informarCep("74393580");
        consultaCep.consultar();
        Assert.assertTrue(resultado.getGridResultadoConsulta().getText().contains("Rua SR 17"));
        driver.close();
    }
>>>>>>> e8dc13738aa14d1f800952a6f886d27e004214d6
}
