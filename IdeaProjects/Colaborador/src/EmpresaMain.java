import java.util.List;
import java.util.Scanner;
import java.util.Collection.*;
import java.util.Arrays;
import java.util.Arrays.*;
public class EmpresaMain {

	private static List<Colaborador> colaboradores;

	public static void main(String... args) {
		// Código omitido.
		Gerente gerente = new Gerente("Juliana", "Tecnologia", 20000, colaboradores);
		gerente.setSenha("1234");

		try(Scanner scanner = new Scanner(System.in)) {

			System.out.print("Informe sua senha:\n> ");
			String senha = scanner.next();

			if(gerente.estahAutenticado(senha)) {
				FolhaDePagamento folha = new FolhaDePagamento(gerente);
				folha.geraRelatorio();
			} else  {
				System.err.println("Falha ao autenticar colaborador");
			}
		}
	}
}