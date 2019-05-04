import br.com.gilmar.Avaliacao;
import br.com.gilmar.ValoresInvalidosException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AvaliacaoTeste {

    private Avaliacao testeAvaliacao;

    @Before
    public void setup(){
        testeAvaliacao = new Avaliacao();
    }
/*
    //CT01
    @Test
    public void CT1(){
        String resultado = avaliacao.avalia(7.0, 6.0, 5);
    }

    //CT02
    @Test
    public void CT2(){
        String resultado = avaliacao.avalia(7.0, 6.0, 5, 96, 48);
    }
 */

    //CT03
    @Test
    public void CT3(){
        try{
            String resultado = testeAvaliacao.avalia(-7.0, 6.0, 5.0, 96.0);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }

    }

    //CT04
    @Test
    public void CT4(){
        try{
            String resultado = testeAvaliacao.avalia(11.0, 6.0, 5.0, 96.0);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }

    }

    //CT05
    @Test
    public void CT5(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, -1.0, 5.0,96.0);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }
    }

    //CT06
    @Test
    public void CT6(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, 11.0, 5,96);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }
    }

    //CT07
    @Test
    public void CT7(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, 7.0, -3,96);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }
    }

    //CT08
    @Test
    public void CT8(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, 7.0, 97, 96);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }
    }

    //CT09
    @Test
    public void CT9(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, 7.0, 16, -1);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }
    }

    //CT10
    @Test
    public void CT10(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, 7.0, 16, 97);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }
    }

    //CT11
    @Test
    public void CT11(){
        try{
            String resultado = testeAvaliacao.avalia(8.0, 7.0, 28, 96);
            Assert.assertTrue(resultado.equals("Reprovado por Falta."));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //CT12
    @Test
    public void CT12(){
        try{
            String resultado = testeAvaliacao.avalia(2.0, 3.0, 15, 96);
            Assert.assertTrue(resultado.equals("Reprovado por Média."));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //CT13
    @Test
    public void CT13(){
        try{
            String resultado = testeAvaliacao.avalia(4.0, 5.0, 15, 96);
            Assert.assertTrue(resultado.equals("Prova Extra."));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //CT14
    @Test
    public void CT14(){
        try{
            String resultado = testeAvaliacao.avalia(7.0, 8.0, 15, 96);
            Assert.assertTrue(resultado.equals("Aprovado."));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
