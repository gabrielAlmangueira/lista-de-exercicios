package exercicio7;

import java.util.ArrayList;
import java.util.List;

// Classe Professor
public class Professor {
    private String nome;
    private List<Escola> escolas; // Um professor pode ter várias escolas

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola) {
        if (!escolas.contains(escola)) {
            escolas.add(escola);
            escola.adicionarProfessor(this); // Reciprocidade na associação
        }
    }

    public String info() {
        StringBuilder escolasNomes = new StringBuilder();
        for (int i = 0; i < escolas.size(); i++) {
            escolasNomes.append(escolas.get(i).getNome());
            if (i < escolas.size() - 1) {
                escolasNomes.append(", ");
            }
        }
        return "Professor " + nome + " leciona em: " + escolasNomes.toString();
    }

    public String getNome() {
        return nome;
    }
}





