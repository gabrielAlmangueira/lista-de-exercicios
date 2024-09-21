package main

import "fmt"

type Professor struct {
	Nome     string
	Escolas  []*Escola
}

type Escola struct {
	Nome       string
	Professores []*Professor
}

func (p*Professor) AdicionarEscola(e *Escola) {
	for _, escola := range p.Escolas {
		if escola == e {
			return
		}
	}
	p.Escolas= append(p.Escolas, e)
	e.AdicionarProfessor(p)
}

func (p Professor) Info() string {
	escolasNomes := ""
	for i, escola := range p.Escolas {
		escolasNomes += escola.Nome
		if i < len(p.Escolas)-1 {
			escolasNomes += ", "
		}
	}
	return fmt.Sprintf("Professor %s leciona nas escolas: %s", p.Nome, escolasNomes)
}

func (e*Escola) AdicionarProfessor(p *Professor) {
	for _, professor := range e.Professores {
		if professor == p {
			return
		}
	}
	e.Professores = append(e.Professores, p)
	p.AdicionarEscola(e)
}

func (e Escola) Info() string {
	professoresNomes := ""
	for i, professor := range e.Professores {
		professoresNomes += professor.Nome
		if i < len(e.Professores)-1 {
			professoresNomes+=", "
		}
	}
	return fmt.Sprintf("Escola %s tem os professores: %s", e.Nome, professoresNomes)
}

func main() {
	// Criar professores
	prof1 := &Professor{Nome: "João"}
	prof2 := &Professor{Nome: "Maria"}

	// Criar escolas
	escola1 := &Escola{Nome: "Escola A"}
	escola2 := &Escola{Nome: "Escola B"}

	// Associação entre escolas e professores
	escola1.AdicionarProfessor(prof1)
	escola2.AdicionarProfessor(prof1)
	prof2.AdicionarEscola(escola1)

	// Exibir informações
	fmt.Println(escola1.Info())
	fmt.Println(escola2.Info())
	fmt.Println(prof1.Info())
	fmt.Println(prof2.Info())
}