package exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Empregado> empregados; // A empresa agrega uma lista de empregados

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    // Método para adicionar empregado à empresa
    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    // Método para listar empregados da empresa
    public void listarEmpregados() {
        System.out.println("Empresa: " + nome);
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
}
