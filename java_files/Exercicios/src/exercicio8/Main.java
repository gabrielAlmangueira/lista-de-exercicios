package exercicio8;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Lex Corp");

        Empregado emp1 = new Empregado("Alice", "Desenvolvedora", 5000.0);
        Empregado emp2 = new Empregado("Roberto", "Gerente", 7000.0);
        Empregado emp3 = new Empregado("Carlos", "Analista", 4500.0);

        empresa.adicionarEmpregado(emp1);
        empresa.adicionarEmpregado(emp2);
        empresa.adicionarEmpregado(emp3);

        empresa.listarEmpregados();
    }
}
