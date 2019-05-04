package br.com.gilmarioarantes.jdbccrudv1.persistencia.dml.inclusao;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.gilmarioarantes.jdbccrudv1.model.Aluno;
import br.com.gilmarioarantes.jdbccrudv1.util.FormataData;
import br.com.gilmarioarantes.jdbccrudv1.util.GeraListaAlunos;

public class PersisteAlunoTeste {

    Logger logger = Logger.getLogger(PersisteAlunoTeste.class.getName());

    @Test
    public void persisteAlunoTest(){

        logger.info("Executando o método persisteAlunoTest() da classe: " + this.getClass().getSimpleName());

        List<Aluno> alunos = GeraListaAlunos.geraLista();

        boolean result = false;

        try{
            for(Aluno aluno : alunos){
                result = new PersisteAluno().persisteAluno(aluno);
            }
        }catch (Exception e){
            result = false;
            logger.error("Erro ao persistir o Aluno!", e);
        }
        Assert.assertTrue(result);
    }
    
    @Test
    public void incluirNovoAluno() {
    	try {
    		
    		Aluno novoAluno = new Aluno();
    		
    		novoAluno.setId(50L);
    		novoAluno.setNome("Geovanny Neves Liberato");
    		novoAluno.setMatricula("2019050400");
    		novoAluno.setDataNascimento(new FormataData().stringToTimeStamp("04-05-2019"));
    		novoAluno.setSexo("Masculino");
    		
    		Boolean result = new PersisteAluno().persisteAluno(novoAluno);
    		
    		Assert.assertTrue(result);
    	} catch(Exception e) {
    		Assert.assertFalse(e instanceof Exception);
    	}
    	
    	
    }	
}
