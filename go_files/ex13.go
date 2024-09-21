package main

import "fmt"

type Matematica struct {}

func (m Matematica) Fatorial(n int) int {
	if n == 0 || n == 1 {
        return 1
    }
    return n * m.Fatorial(n - 1)
}

func main() {
    // Criando uma instância da struct Matematica
    m := Matematica{}

    // Chamando o método Fatorial da struct
    fmt.Println(m.Fatorial(5))  // Saída: 120
}