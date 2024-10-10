package main

import "fmt"

type Animal interface{
	Som() string
}

type Cachorro struct{
	Nome string
}

type Gato struct{
	Nome string
}

func (c Cachorro) Som() string{
	return fmt.Sprintf("%s: Au Au!", c.Nome)
}

func (g Gato) Som() string{
	return fmt.Sprintf("%s: Miau!", g.Nome)
}

func emitirSom(a Animal){
	fmt.Println(a.Som())
}

// Função que usa polimorfismo para chamar o som de cada animal
func emitirSons(animais []Animal) {
	fmt.Println("som de cada animal:")
	for _, animal := range animais{
		fmt.Println(animal.Som())
	}
}

func main() {
	dog := Cachorro{Nome: "Rex"}
	cat := Gato{Nome: "Pike"}
	animais := []Animal{dog, cat}

	emitirSom(dog)  
	emitirSom(cat)
	
	emitirSons(animais)
}