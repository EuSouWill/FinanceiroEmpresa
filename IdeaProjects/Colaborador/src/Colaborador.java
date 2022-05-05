public abstract class  Colaborador {
    protected String nome;            //Foram definidos dois atributos privados do tipo String que representam o nome e o departamento do colaborador (linhas 2 e 3).
    protected String departamento;

    public Colaborador(String nome, String departamento) {  //O construtor da classe foi declarado, recebendo dois parâmetros que representam o nome e departamento a serem inseridos nos atributos da classe, veja o código entre as linhas 5 e 8.
        this.nome = nome;
        this.departamento = departamento;
    }

    public abstract boolean estahAutenticado(String senhaDigitada);

    public abstract double salario();


    public String getNome() { //No intervalo das linhas 10 e 16, estão implementados os métodos getters referente a cada atributo da classe.
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override //Por fim, entre as linhas 27 e 29, temos a implementação de um método toString que deve formatar a maneira como o objeto Colaborador deve ser representado em um texto.
    public String toString() {
        return String.format("Colaborador: %s\nDepartamento: %s", this.nome, this.departamento);
    }
}
