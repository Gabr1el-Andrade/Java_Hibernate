package br.com.tgabriel.test.prod;


import br.com.tgabriel.atividade.IProdDao;
import br.com.tgabriel.atividade.ProdDAO;
import br.com.tgabriel.atividade.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdTest {

        private IProdDao prodDao;

        public ProdTest (){
            prodDao = new ProdDAO();
        }
        @Test
        public void cadastrar(){
            Produto prod = new Produto();
            prod.setCodigo("12345");
            prod.setValor("12,50");
            prod.setNome("TESTE");
            prod = prodDao.cadastrar(prod);

            assertNotNull(prod);
            assertNotNull(prod.getId());
        }
    }

