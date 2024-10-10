package main

import (
    "fmt"
)

func SaldoInsuficienteError(saldo, valor float64) error {
    return fmt.Errorf("saldo insuficiente: %.2f. Tentativa de saque: %.2f", saldo, valor)
}

type ContaBancaria struct {
	titular string
	saldo   float64  // campo "privado" (começa com letra minúscula)
}

// Construtor para criar uma nova conta
func NovaContaBancaria(titular string, saldoInicial float64) *ContaBancaria {
	return &ContaBancaria{
		titular: titular,
		saldo:   saldoInicial,
	}
}

func (c*ContaBancaria) Depositar(valor float64){
	if valor>0 {
		c.saldo+=valor
		fmt.Printf("Depósito de %.2f realizado com sucesso!\n", valor)
	} else {
		fmt.Println("Valor inválido para depósito.")
	}
}

func (c*ContaBancaria) Sacar(valor float64) error {
	if valor > c.saldo {
		return SaldoInsuficienteError(c.saldo, valor)
	}
	c.saldo-=valor
	fmt.Printf("Saque de %.2f realizado com sucesso!\n", valor)
	return nil
}

func (c*ContaBancaria) ConsultarSaldo(){
	fmt.Printf("Saldo atual: %.2f\n", c.saldo)
}

func main() {
	conta := NovaContaBancaria("João", 1000)
	conta.ConsultarSaldo()
	conta.Depositar(500)
	conta.ConsultarSaldo()
	err := conta.Sacar(200)
	if err != nil {
        fmt.Println(err)  // Saída: saldo insuficiente: 500.00. Tentativa de saque: 600.00
    }
	conta.ConsultarSaldo()
	err = conta.Sacar(2000)  // Testando saldo insuficiente
	if err != nil {
        fmt.Println(err)  // Saída: saldo insuficiente: 500.00. Tentativa de saque: 600.00
    }
}