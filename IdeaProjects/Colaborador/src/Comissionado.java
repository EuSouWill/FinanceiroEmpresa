public class Comissionado
		extends Colaborador
		implements AssinaturaDigital {

	private double totalVendas;
	private int comissao;
	private int senha;

	public Comissionado(String nome, String departamento, int comissao) {
		super(nome, departamento);
		this.comissao = comissao;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public int getComissao() {
		return comissao;
	}

	public double salario() {
		return this.totalVendas * (this.comissao / 100.);
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return String.format("%s\nTotal de Vendas: R$ %.2f\n" +
						"Comissão: %d%%\nSalário Mensal: R$ %.2f",
				super.toString(), this.getTotalVendas(),
				this.getComissao(), this.salario());
	}

	@Override
	public long hash() {
		long hash = (senha % 3) * super.hashCode();
		return hash;
	}

	@Override
	public boolean estahAutenticado(String senhaDigitada) {
		return senha == Integer.parseInt(senhaDigitada);
	}
}
