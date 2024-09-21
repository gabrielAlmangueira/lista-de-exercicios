class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def info(self):
        return f"Nome: {self.nome}, Cargo: {self.cargo}, Salário: {self.salario:.2f}"

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []  # A empresa agrega uma lista de empregados

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def listar_empregados(self):
        print(f"Empresa: {self.nome}")
        for empregado in self.empregados:
            print(empregado.info())

empresa = Empresa("Lex Corp")

emp1 = Empregado("Alice", "Desenvolvedora", 5000.0)
emp2 = Empregado("Roberto", "Gerente", 7000.0)
emp3 = Empregado("Carlos", "Analista", 4500.0)

empresa.adicionar_empregado(emp1)
empresa.adicionar_empregado(emp2)
empresa.adicionar_empregado(emp3)

empresa.listar_empregados()