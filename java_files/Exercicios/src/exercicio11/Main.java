package exercicio11;

public class Main {
    public static void main(String[] args) {
        Funcionario funcHorista = new FuncionarioHorista("João", 40, 20);
        Funcionario funcAssalariado = new FuncionarioAssalariado("Maria", 3000);

        System.out.println("Salário de " + funcHorista.nome + ": R$ " + funcHorista.calcularSalario());
        System.out.println("Salário de " + funcAssalariado.nome + ": R$ " + funcAssalariado.calcularSalario());
    }
}
