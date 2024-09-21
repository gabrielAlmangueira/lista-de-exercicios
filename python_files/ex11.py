from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome):
        self.nome = nome
    
    @abstractmethod
    def calcular_salario():
        pass


class FuncionarioHorista(Funcionario):
    def __init__(self, nome, horas_trabalhadas, valor_hora):
        super().__init__(nome)
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_hora
    

class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_fixo):
        super().__init__(nome)
        self.salario_fixo = salario_fixo

    def calcular_salario(self):
        return self.salario_fixo
    
func_horista = FuncionarioHorista("João", 40, 20)
func_assalariado = FuncionarioAssalariado("Maria", 3000)

print(f"Salário de {func_horista.nome}: R$ {func_horista.calcular_salario()}")
print(f"Salário de {func_assalariado.nome}: R$ {func_assalariado.calcular_salario()}")