public  class BaseComissionado extends Comissionado{
    private double salarioBase;

    public BaseComissionado(String nome, String departamento, int comissao,double salarioBase) {
        super(nome, departamento, comissao);
        this.salarioBase = salarioBase;

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double salario() {
        return this.salarioBase + super.salario();
    }

    @Override
    public String toString() {
        return String.format("%s\nSalário Base: R$ %.2f",super.toString(), this.salarioBase);
    }
}
