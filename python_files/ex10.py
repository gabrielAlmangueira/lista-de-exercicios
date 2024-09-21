class Calculadora:
    def somar_dois(self, a, b):
        return a+b
    
    def somar_tres(self, a, b, c):
        return a+b+c
    
calc = Calculadora()

# Usando o método para somar dois números
soma_dois = calc.somar_dois(5, 10)
print(f"Soma de dois números: {soma_dois}")

# Usando o método para somar três números
soma_tres = calc.somar_tres(5, 10, 20)
print(f"Soma de três números: {soma_tres}")