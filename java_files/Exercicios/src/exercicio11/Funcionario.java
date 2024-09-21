package exercicio11;

public abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Método abstrato calcularSalario
    public abstract double calcularSalario();
}
