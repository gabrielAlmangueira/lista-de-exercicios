package main

import "fmt"

type Produto struct {
	nome string
	preco float64
}

// Método de conveniência para somar o preço dos produtos
func (p Produto) SomarPreco(p2 Produto) float64 {
	return p.preco + p2.preco
}

func (p Produto) String() string {
    return fmt.Sprintf("Produto: %s, Preço: %.2f", p.nome, p.preco)
}

func main() {
    produto1 := Produto{nome: "Teclado", preco: 100.0}
    produto2 := Produto{nome: "Mouse", preco: 50.0}

    fmt.Println(produto1)
    fmt.Println(produto2)
    precoTotal := produto1.SomarPreco(produto2)
    fmt.Printf("Preço total: %.2f\n", precoTotal)
}