package br.edu.infnet.emprestimo.modelo;

import static org.junit.Assert.fail;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

import br.edu.infnet.emprestimo.modelo.JdbcUtil;

public class JdbcUtilTest {

	@Test
	public void testConexao() {
		try (Connection obterConexao = JdbcUtil.obterConexao()){			
			Assert.assertTrue("Conectado", true);
		} catch (Exception e) {			
			e.printStackTrace();
			fail();
		}				
	}

}
