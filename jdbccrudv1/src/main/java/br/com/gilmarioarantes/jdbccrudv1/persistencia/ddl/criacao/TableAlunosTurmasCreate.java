package br.com.gilmarioarantes.jdbccrudv1.persistencia.ddl.criacao;


import br.com.gilmarioarantes.jdbccrudv1.persistencia.base.PersistenciaJdbc;
import org.apache.log4j.Logger;

public class TableAlunosTurmasCreate extends PersistenciaJdbc {

    static Logger logger = Logger.getLogger(TableAlunosTurmasCreate.class.getName());

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        logger.info("Criando a tabela Alunos_Turmas");

        String sql = "CREATE TABLE IF NOT EXISTS ALUNO_TURMAS(\n" +
                "ID_ALUNOS_TURMAS LONG NOT NULL PRIMARY KEY,\n" +
                "SEMESTRE VARCHAR(5) NOT NULL," +
                "NOTA1 DECIMAL(4,2)," +
                "NOTA2 DECIMAL(4,2)," +
                "FREQUENCIA INTEGER," +
                "DISCIPLINA LONG NOT NULL," +
                "ALUNO LONG NOT NULL, " +
                "TURMA LONG NOT NULL" +
                ")";

        stmt.executeUpdate(sql);

        logger.info("Tabela Alunos_Turmas criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
