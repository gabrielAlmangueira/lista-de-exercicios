package main
import ("fmt")

type Carro struct {
  Marca string
  Modelo string
  Ano int
  Cor string
  Velocidade int
}

func (c *Carro) acelerar(incremento int) {
  c.Velocidade += incremento
}

func (c *Carro) frear(incremento int) {
  c.Velocidade -= incremento
  if c.Velocidade < 0 {
    c.Velocidade=0
  }
}

func (c *Carro) exibirVelocidade() {
  fmt.Printf("%s está a %d km/h.\n", c.Modelo, c.Velocidade)
}

func main() {

  carro1 := Carro{
		Marca:  "Fiat",
		Modelo: "Uno",
		Ano:    2010,
		Cor:    "Cinza",
	}

	carro2 := Carro{
		Marca:  "Ford",
		Modelo: "Fiesta",
		Ano:    2014,
		Cor:    "Preto",
	}

	carro3 := Carro{
		Marca:  "Chevrolet",
		Modelo: "Onix",
		Ano:    2020,
		Cor:    "Prata",
	}

  informacoesCarro(carro1,1)

  informacoesCarro(carro2,2)

  informacoesCarro(carro3,3)

  carro1.exibirVelocidade()
  carro1.acelerar(20)
  carro1.exibirVelocidade()
  carro1.frear(15)
  carro1.exibirVelocidade()
  carro1.frear(30)
  carro1.exibirVelocidade()


}

func informacoesCarro(carro Carro,numCarro int) {
	fmt.Print("carro",numCarro,":\n")
	fmt.Println("marca:", carro.Marca)
	fmt.Println("modelo:", carro.Modelo)
	fmt.Println("ano:", carro.Ano)
	fmt.Println("cor:", carro.Cor)
}