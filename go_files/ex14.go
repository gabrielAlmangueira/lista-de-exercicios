package main

import (
    "fmt"
    "sync"
)

// Definindo a struct Configuracao
type Configuracao struct {
    config string
}

var instancia *Configuracao
var once sync.Once

func GetInstancia() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{config: "Configuração padrão"}
	})
	return instancia
}


func main() {
    config1 := GetInstancia()
    config2 := GetInstancia()

    fmt.Println(config1 == config2)  // Saída: true
    fmt.Println(config1.config)      // Saída: Configuração padrão
    config1.config = "Nova configuração"
    fmt.Println(config2.config)      // Saída: Nova configuração
}