package br.edu.infnet.emprestimo.modelo.persistencia;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class JdbcUtilTest {

	@Test
	public void test() {

		try {
			JdbcUtil.obterConexao();
			Assert.assertTrue(true);
		} catch (Exception e) {			
			e.printStackTrace();
			fail();
		}
		
		
	}

}
