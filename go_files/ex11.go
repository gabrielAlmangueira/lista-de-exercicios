package main

import "fmt"

// Definindo a interface Funcionario
type Funcionario interface {
	CalcularSalario() float64
}

type FuncionarioHorista struct {
	nome string
	horasTrabalhadas float64
	valorHora float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return f.horasTrabalhadas * f.valorHora
}

type FuncionarioAssalariado struct {
	nome        string
	salarioFixo float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.salarioFixo
}

func imprimirSalario(funcionario Funcionario, nome string) {
	fmt.Printf("Salário de %s: R$ %.2f\n", nome, funcionario.CalcularSalario())
}

func main() {
	funcHorista := FuncionarioHorista{nome: "João", horasTrabalhadas: 40, valorHora: 20}
	funcAssalariado := FuncionarioAssalariado{nome: "Maria", salarioFixo: 3000}

	imprimirSalario(funcHorista, "João")
	imprimirSalario(funcAssalariado, "Maria")
}