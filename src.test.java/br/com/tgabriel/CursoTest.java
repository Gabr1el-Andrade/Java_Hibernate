package br.com.tgabriel;

import br.com.tgabriel.domain.Curso;
import br.com.tgabriel.domain.CursoDao;
import br.com.tgabriel.domain.ICursoDao;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {
    private ICursoDao daoCurso;

    public CursoTest (){
        daoCurso = new CursoDao();
    }
    @Test
    public void cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("a1");
        curso.setDescricao("teste teste");
        curso.setNome("TESTE");
        curso = daoCurso.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
