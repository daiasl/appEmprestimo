package br.edu.infnet.emprestimo.modelo.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.emprestimo.modelo.entidades.Solicitante;

public class SolicitanteDAO extends JdbcDAO<Solicitante> {

	public SolicitanteDAO() {			
	}
	
	@Override
	public boolean incluir(Solicitante solicitante) {
		String sql = "INSERT INTO SOLICITANTE (CODIGO, NOME, CPF) VALUES (null,?,?)";
		
		try {
			pstm = con.prepareStatement(sql);			
			pstm.setString(1, solicitante.getNome());
			pstm.setString(2, solicitante.getCpf());
			return pstm.executeUpdate() > 0;
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		return false;
	}
	
	@Override
	public Boolean atualizar(Solicitante solicitante) {
		String sql = "update solicitante set nome = ?, cpf = ? where codigo = ?";
		try {
			pstm = con.prepareStatement(sql);			 
			pstm.setString(1, solicitante.getNome());
			pstm.setString(2, solicitante.getCpf());
			pstm.setLong(3, solicitante.getCodigo());
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean deletar(Solicitante solicitante) {
		String sql = "delete from solicitante where codigo = ?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setLong(1, solicitante.getCodigo()); //sql injection
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public List<Solicitante> listarTodos(){
		String sql = "SELECT * FROM SOLICITANTE";
		List<Solicitante> solicitantes = new ArrayList<>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				String cpf = rs.getString("cpf");
				String nome = rs.getString("nome");
				Long codigo = rs.getLong("codigo");
				Solicitante solicitante = new Solicitante(codigo, nome, cpf);
				solicitantes.add(solicitante);				
			}
			return solicitantes;
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Solicitante obter(Long codigo){
		String sql = "select * from solicitante where codigo = ? ";
		Solicitante solicitante = new Solicitante();
		try {
			pstm = con.prepareStatement(sql);
			pstm.setLong(1,codigo);
			rs = pstm.executeQuery();
						
			if(rs.next()) {
				String nomebd = rs.getString("nome");
				String cpfbd = rs.getString("cpf");
				Long codigobd = rs.getLong("codigo");
				
				solicitante = new Solicitante(codigobd, nomebd, cpfbd);				
			}
			return solicitante;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
