import java.util.List;
import java.util.stream.Collectors;

public class Gerente
		extends Colaborador
		implements Autenticavel{

	private double salarioBase;
	private List<Colaborador> colaboradores;
	private String senha;

	public Gerente(String nome, String departamento,
				   double salarioBase, List<Colaborador> colaboradores) {
		super(nome, departamento);
		this.salarioBase = salarioBase;
		this.colaboradores = colaboradores;
	}
	public String getSenha(){
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean estahAutenticado(String senhaDigitada){
		return senha.equals(senhaDigitada);
	}
	public double getSalarioBase() {
		return salarioBase;
	}

	public List<Colaborador> getColaboradores() {
		return colaboradores;
	}

	private double getBonus() {
		List<Colaborador> colaboradores = this.colaboradores
				.stream()
				.filter(colaborador -> colaborador instanceof Comissionado)
				.collect(Collectors.toList());

		double total = colaboradores
				.stream()
				.mapToDouble(Colaborador::salario)
				.sum();

		return total * 0.1;
	}

	@Override
	public double salario() {
		return salarioBase + getBonus();
	}

	@Override
	public String toString() {
		return String.format("%s\nSalário: R$ %.2f",
				super.toString(), this.salario());
	}

}