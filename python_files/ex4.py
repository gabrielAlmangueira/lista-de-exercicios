class Animal:
    def __init__(self,nome):
        self.nome=nome

    def som(self):
        raise NotImplementedError("Somente as subclasses de Animal devem implementar esse metodo")

# Classe derivada Cachorro    
class Cachorro(Animal):
    def som(self):
        return f"{self.nome}: Au Au!"

# Classe derivada Gato   
class Gato(Animal):
    def som(self):
        return f"{self.nome}: Miau!"

# Função que recebe uma lista de animais e chama o método som    
def emitir_Sons(animais):
    print("Som de cada animal:")
    for animal in animais:
        print(type(animal).__name__,animal.som())
    
dog = Cachorro("Rex")
cat = Gato("Pike")

animais = [dog, cat]

print(dog.som())
print(cat.som())

emitir_Sons(animais)

