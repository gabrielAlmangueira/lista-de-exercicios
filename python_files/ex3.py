class SaldoInsuficienteException(Exception):
    def __init__(self, saldo, valor):
        super().__init__(f"Saldo insuficiente: {saldo}. Tentativa de saque: {valor}")

class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.titular = titular
        self.__saldo = saldo_inicial  # Atributo privado
    def depositar(self, valor):
        if valor>0:
            self.__saldo+=valor
            print(f"Depósito de {valor} realizado com sucesso!")
        else:
            print("Valor inválido para depósito.")
    
    def sacar(self,valor):
        if valor > self.__saldo:
            raise SaldoInsuficienteException(self.__saldo, valor)
        self.__saldo-=valor
        print(f"saque de {valor} realizado com sucesso!")

    def consultaSaldo(self):
        print(f"Saldo: {self.__saldo}R$.")

conta = ContaBancaria("João", 1000)
conta.consultaSaldo()
conta.depositar(500)
conta.consultaSaldo()

try:
    conta.sacar(200)
except SaldoInsuficienteException as e:
    print(e)

conta.consultaSaldo()

try:
    conta.sacar(2000)
except SaldoInsuficienteException as e:
    print(e)