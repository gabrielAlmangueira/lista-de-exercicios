class Motor:
    def __init__(self, cilindradas, potencia):
        self.cilindradas = cilindradas
        self.potencia = potencia

    def __str__(self):
        return f"[{self.cilindradas}cc, {self.potencia} HP]"

class Carro:
    def __init__(self,marca,modelo,ano,cor,motor):
        self.marca=marca
        self.modelo=modelo
        self.ano=ano
        self.cor=cor
        self.velocidade=0
        self.motor=motor
    
    def acelerar(self, incremento):
        self.velocidade += incremento
    
    def frear(self, decremento):
        self.velocidade-=decremento
        if self.velocidade < 0:
            self.velocidade = 0

    def exibirVelocidade(self):
        print(f"{self.modelo} está a {self.velocidade} km/h.")


    def __str__(self):
        return f"marca={self.marca},modelo={self.modelo}, ano={self.ano}, cor={self.cor}, motor={self.motor}"


motor = Motor(2000, 150)
carro1=Carro('Fiat','Uno',2010,'cinza',motor)   
carro2=Carro('Ford','Fiesta',2014,'preto',motor)
carro3=Carro('Chevrolet','Onix',2020,'prata',motor)
print(carro1)
print(carro2)
print(carro3)

carro3.acelerar(100)
carro3.exibirVelocidade()
carro3.frear(10)
carro3.exibirVelocidade()

