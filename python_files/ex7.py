class Professor:
    def __init__(self,nome):
        self.nome = nome
        self.escolas = []  # Um professor pode ter várias escolas

    def adicionar_escola(self,escola):
        if escola not in self.escolas:
            self.escolas.append(escola)
            escola.adicionar_professor(self)

    def info(self):
        escolas_nomes = ', '.join([escola.nome for escola in self.escolas])
        return f"Professor {self.nome} leciona em: {escolas_nomes}"
    
class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []  # Uma escola pode ter vários professores

    def adicionar_professor(self,professor):
        if professor not in self.professores:
            self.professores.append(professor)
            professor.adicionar_escola(self)

    def info(self):
        professores_nomes = ', '.join([prof.nome for prof in self.professores])
        return f"Escola {self.nome} tem os professores: {professores_nomes}"
    
# Teste
prof1 = Professor("João")
prof2 = Professor("Maria")

escola1 = Escola("Escola A")
escola2 = Escola("Escola B")

escola1.adicionar_professor(prof1)
escola2.adicionar_professor(prof1)
prof2.adicionar_escola(escola1)

print(escola1.info())
print(escola2.info())
print(prof1.info())
print(prof2.info())