package main

import "fmt"

// Struct Empregado
type Empregado struct {
	Nome   string
	Cargo  string
	Salario float64
}

func (e Empregado) Info() string {
	return fmt.Sprintf("Nome: %s, Cargo: %s, Salário: %.2f", e.Nome, e.Cargo, e.Salario)
}

type Empresa struct {
	Nome      string
	Empregados []Empregado // A empresa agrega uma lista de empregados
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
	e.Empregados = append(e.Empregados, empregado)
}

func (e Empresa) ListarEmpregados() {
	fmt.Printf("Empresa: %s\n", e.Nome)
	for _, empregado := range e.Empregados {
		fmt.Println(empregado.Info())
	}
}

func main() {
	empresa := Empresa{Nome: "Lex Corp"}

	emp1 := Empregado{Nome: "Alice", Cargo: "Desenvolvedora", Salario: 5000.0}
	emp2 := Empregado{Nome: "Roberto", Cargo: "Gerente", Salario: 7000.0}
	emp3 := Empregado{Nome: "Carlos", Cargo: "Analista", Salario: 4500.0}

	empresa.AdicionarEmpregado(emp1)
	empresa.AdicionarEmpregado(emp2)
	empresa.AdicionarEmpregado(emp3)

	empresa.ListarEmpregados()
}

