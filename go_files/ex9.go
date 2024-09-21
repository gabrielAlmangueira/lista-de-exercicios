package main

import "fmt"

// Definindo a interface Impressao
type Impressao interface {
	Imprimir()
}

type Relatorio struct {
	Titulo   string
	Conteudo string
	Autor    string
}

func (r Relatorio) Imprimir() {
	fmt.Println("=== Relatório ===")
	fmt.Printf("Título: %s\n", r.Titulo)
	fmt.Printf("Conteúdo: %s\n", r.Conteudo)
	fmt.Printf("Autor: %s\n", r.Autor)
	fmt.Println("=================")
}

// Struct Contrato que implementa a interface Impressao
type Contrato struct {
	Partes          string
	Objeto          string
	DataAssinatura  string
}

func (c Contrato) Imprimir() {
	fmt.Println("=== Contrato ===")
	fmt.Printf("Partes envolvidas: %s\n", c.Partes)
	fmt.Printf("Objeto do Contrato: %s\n", c.Objeto)
	fmt.Printf("Data de Assinatura: %s\n", c.DataAssinatura)
	fmt.Println("================")
}

func main() {
	var impressao Impressao

	impressao = Relatorio{
		Titulo:   "Relatório de Desempenho Anual",
		Conteudo: "Este relatório contém uma análise detalhada dos KPIs e recomendações estratégicas para o próximo ano.",
		Autor:    "Carlos Souza",
	}
	impressao.Imprimir()

	impressao = Contrato{
		Partes:         "Empresa ABC e Empresa XYZ",
		Objeto:         "Prestação de serviços de consultoria em tecnologia",
		DataAssinatura: "15/09/2024",
	}
	impressao.Imprimir()
}