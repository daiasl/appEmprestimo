package br.edu.infnet.appemprestimo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.domain.Produto;
import br.edu.infnet.appemprestimo.model.domain.Solicitante;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.exceptions.EmprestimoSemProdutoException;
import br.edu.infnet.appemprestimo.model.exceptions.SolicitanteNuloException;
import br.edu.infnet.appemprestimo.model.service.EmprestimoService;

@Component
@Order(6)
public class EmprestimoTeste implements ApplicationRunner {
	
	@Autowired
	private EmprestimoService emprestimoService;

	@Override
	public void run(ApplicationArguments args) {
		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);
								
			Solicitante sol = new Solicitante();
			sol.setId(1);
			
			Set<Produto> produtos = new HashSet<Produto>();
			Livro livro = new Livro();
			livro.setId(1);			
			livro.setAnoPublicacao(2020);
			produtos.add(livro);
			Livro livro2 = new Livro();
			livro2.setId(2);
			livro2.setAnoPublicacao(2021);
			produtos.add(livro2);
			Livro livro3 = new Livro();
			livro3.setId(3);
			livro3.setAnoPublicacao(2022);
			produtos.add(livro3);
	
			Emprestimo emp = new Emprestimo(sol, produtos);
			emp.setDataDevolucao(LocalDateTime.of(2022, 9, 21, 21, 26));
			emprestimoService.incluir(emp);
		
		} catch (SolicitanteNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}
					
		
		/*
		 * Revista revista1 = new Revista(); revista1.setIssn("1980393-1");
		 * revista1.setEdicao(6); revista1.setAno(2011);
		 * revista1.setTitulo(".Net Magazine"); revista1.setEstante(5);
		 * revista1.setCodigoBarras(""); revista1.setQtdDisponiveis(20);
		 * revista1.setQtdExemplares(20);
		 * 
		 * String dir =
		 * "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\"; String
		 * arq = "Emprestimos.txt";
		 * 
		 * try { try { FileReader fileReader = new FileReader(dir + arq); BufferedReader
		 * leitura = new BufferedReader(fileReader);
		 * 
		 * Set<Produto> produtos = null; List<Emprestimo> emprestimos = new
		 * ArrayList<Emprestimo>();
		 * 
		 * String linha = leitura.readLine();
		 * 
		 * while (linha != null) { String[] campos = linha.split(";");
		 * 
		 * switch (campos[0].toUpperCase()) { case "E": try { produtos = new
		 * HashSet<Produto>(); Solicitante sol = new Solicitante(campos[6], campos[7]);
		 * 
		 * Emprestimo emp = new Emprestimo(sol, produtos);
		 * emp.setDataDevolucao(LocalDateTime.of(Integer.valueOf(campos[1]),
		 * Integer.valueOf(campos[2]), Integer.valueOf(campos[3]),
		 * Integer.valueOf(campos[4]), Integer.valueOf(campos[5])));
		 * 
		 * emprestimos.add(emp);
		 * 
		 * } catch (CpfInvalidoException | SolicitanteNuloException |
		 * EmprestimoSemProdutoException e) {
		 * System.out.println("[ERROR - Emprestimo ] " + e.getMessage()); } break; case
		 * "L": Livro livro = new Livro(); livro.setIsbn(campos[1]);
		 * livro.setVolume(Integer.valueOf(campos[2]));
		 * livro.setEdicao(Integer.valueOf(campos[3]));
		 * livro.setAnoPublicacao(Integer.valueOf(campos[4]));
		 * livro.setNomeAutor(campos[5]); livro.setTitulo(campos[6]);
		 * livro.setEstante(Integer.valueOf(campos[7]));
		 * livro.setCodigoBarras(campos[8]);
		 * livro.setQtdDisponiveis(Integer.valueOf(campos[9]));
		 * livro.setQtdExemplares(Integer.valueOf(campos[10]));
		 * 
		 * produtos.add(livro); break; case "M": MaterialDigital md = new
		 * MaterialDigital(); md.setDoi(campos[1]);
		 * md.setAno(Integer.valueOf(campos[2]));
		 * md.setVolume(Integer.valueOf(campos[3])); md.setLinkDoi(campos[4]);
		 * md.setTitulo(campos[5]); md.setEstante(Integer.valueOf(campos[6]));
		 * md.setCodigoBarras(campos[7]);
		 * md.setQtdDisponiveis(Integer.valueOf(campos[8]));
		 * md.setQtdExemplares(Integer.valueOf(campos[9]));
		 * 
		 * produtos.add(md); break; case "R": //produtos.add(revista1); break;
		 * 
		 * default: break; } linha = leitura.readLine(); } for (Emprestimo e :
		 * emprestimos) { emprestimoService.incluir(e);
		 * 
		 * System.out.println(">>>>>>>>>>>>" + e.getId());
		 * System.out.println(">>>>>>>>>>>>" + e.getSolicitante().getNome());
		 * System.out.println(">>>>>>>>>>>>" + e.getProdutos().size());
		 * 
		 * }
		 * 
		 * leitura.close(); fileReader.close();
		 * 
		 * } catch (FileNotFoundException e) {
		 * System.out.println("[ERRO] O arquivo n??o existe!!!"); } catch (IOException e)
		 * { System.out.println("[ERRO] Problema ao fechar o arquivo!!!"); } } finally {
		 * System.out.println("Fim da inclus??o!"); }
		 */

	}

}
