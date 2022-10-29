package br.edu.infnet.emprestimo.modelo.persistencia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import br.edu.infnet.emprestimo.modelo.entidades.Emprestimo;
import br.edu.infnet.emprestimo.modelo.entidades.Produto;
import br.edu.infnet.emprestimo.modelo.entidades.Solicitante;

public class EmprestimoDAO extends JdbcDAO<Emprestimo>{

	@Override
	public boolean incluir(Emprestimo obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean atualizar(Emprestimo obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletar(Emprestimo obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emprestimo> listarTodos() {
		String sql = "SELECT E.NUMERO, E.DATADEVOLUCAO, S.NOME, S.CPF, P.TITULO, P.QTDEXEMPLARES, P.VALORUNITARIO"
				+ " FROM EMPRESTIMO E"
				+ " JOIN SOLICITANTE S"
				+ " JOIN ITENS_EMPRESTIMO IE"
				+ " JOIN PRODUTO P"
				+ " ON E.SOLICITANTE_COD = S.CODIGO"
				+ " AND E.NUMERO = IE.EMPRESTIMO_COD"
				+ " AND P.CODIGO = IE.PRODUTO_COD";
		Map<Long, Emprestimo> emprestimos = new TreeMap<>();
		try {
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Long numero = rs.getLong("NUMERO");
				LocalDate databd = rs.getDate("DATADEVOLUCAO").toLocalDate();
				String nomebd = rs.getString("NOME");
				String cpf = rs.getString("CPF");
				String titulobd = rs.getString("TITULO");
				int qtd = rs.getInt("QTDEXEMPLARES");
				Double valorbd = rs.getDouble("VALORUNITARIO");
				
				Emprestimo emprestimo = null;
				
				if (emprestimos.get(numero)==null) {
					emprestimo = new Emprestimo (numero, databd, new Solicitante(nomebd, cpf));
					emprestimo.setProdutos(new ArrayList<>());
					emprestimos.put(numero, emprestimo);
				}
				Produto produto = new Produto(null,titulobd, qtd,valorbd);
				emprestimo = emprestimos.get(numero);
				emprestimo.getProdutos().add(produto);								
			}
			return new ArrayList<Emprestimo>(emprestimos.values());
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public Emprestimo obter(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
