package main

import "fmt"

func somarDois(a int, b int) int {
	return a + b
}

func somarTres(a int, b int, c int) int {
	return a + b + c
}

func main() {
	// Usando a função para somar dois números
	somaDois := somarDois(5, 10)
	fmt.Printf("Soma de dois números: %d\n", somaDois)

	// Usando a função para somar três números
	somaTres := somarTres(5, 10, 20)
	fmt.Printf("Soma de três números: %d\n", somaTres)
}