package br.edu.infnet.appemprestimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.exceptions.AnoPublicacaoInvalidoException;
import br.edu.infnet.appemprestimo.model.service.LivroService;

@Component
@Order(4)
public class LivroTeste implements ApplicationRunner {
	@Autowired
	private LivroService livroService;

	@Override
	public void run(ApplicationArguments args) {

		String dir = "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\";
		String arq = "Produtos.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);

				String linha = leitura.readLine();
				while (linha != null) {

					String[] campos = linha.split(";");

					if ("L".equalsIgnoreCase(campos[0])) {
						try {
							Livro livro = new Livro();
							livro.setIsbn(campos[1]);
							livro.setVolume(Integer.valueOf(campos[2]));
							livro.setEdicao(Integer.valueOf(campos[3]));
							livro.setAnoPublicacao(Integer.valueOf(campos[4]));
							livro.setNomeAutor(campos[5]);
							livro.setTitulo(campos[6]);
							livro.setEstante(Integer.valueOf(campos[7]));
							livro.setCodigoBarras(campos[8]);
							livro.setQtdDisponiveis(Integer.valueOf(campos[9]));
							livro.setQtdExemplares(Integer.valueOf(campos[10]));
							System.out.println(
									"Calcula qtd. produto emprestado: " + livro.CalculaQtdProdutoEmprestado());
							livroService.incluir(livro);
						} catch (AnoPublicacaoInvalidoException e) {
							System.out.println("[ERROR - Livro] " + e.getMessage());
						}
					}
					linha = leitura.readLine();
				}

				leitura.close();
				fileReader.close();

			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe!!!");
			} catch (IOException e) {
				System.out.println("[ERRO] Problema ao fechar o arquivo!!!");
			}
		} finally {
			System.out.println("Fim da inclusão!");
		}

	}

}
