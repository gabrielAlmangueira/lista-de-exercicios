from abc import ABC, abstractmethod

# Classe abstrata Impressao
class Impressao(ABC):

    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Impressao):
    def __init__(self, titulo, conteudo, autor):
        self.titulo = titulo
        self.conteudo = conteudo
        self.autor = autor

    def imprimir(self):
        print("=== Relatório ===")
        print(f"Título: {self.titulo}")
        print(f"Conteúdo: {self.conteudo}")
        print(f"Autor: {self.autor}")
        print("=================")

class Contrato(Impressao):
    def __init__(self, partes, objeto, data_assinatura):
        self.partes = partes
        self.objeto = objeto
        self.data_assinatura = data_assinatura

    def imprimir(self):
        print("=== Contrato ===")
        print(f"Partes envolvidas: {self.partes}")
        print(f"Objeto do Contrato: {self.objeto}")
        print(f"Data de Assinatura: {self.data_assinatura}")
        print("================")

# Teste
relatorio = Relatorio("Relatório de Desempenho Anual", 
            "Este relatório contém uma análise detalhada dos KPIs e recomendações estratégicas para o próximo ano.", 
            "Carlos Souza")
contrato = Contrato("Empresa ABC e Empresa XYZ", 
            "Prestação de serviços de consultoria em tecnologia", 
            "15/09/2024")

relatorio.imprimir()
contrato.imprimir()