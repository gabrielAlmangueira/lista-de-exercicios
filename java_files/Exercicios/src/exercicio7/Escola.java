package exercicio7;

import java.util.ArrayList;
import java.util.List;

// Classe Escola
public class Escola {
    private String nome;
    private List<Professor> professores; // Uma escola pode ter vários professores

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
            professor.adicionarEscola(this); // Reciprocidade na associação
        }
    }

    public String info() {
        StringBuilder professoresNomes = new StringBuilder();
        for (int i = 0; i < professores.size(); i++) {
            professoresNomes.append(professores.get(i).getNome());
            if (i < professores.size() - 1) {
                professoresNomes.append(", ");
            }
        }
        return "Escola " + nome + " tem os professores: " + professoresNomes.toString();
    }

    public String getNome() {
        return nome;
    }
}
