class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
            cls._instancia.config = "Configuração padrão"
        return cls._instancia
    
# Testando o Singleton
config1 = Configuracao()
config2 = Configuracao()

print(config1 is config2)  # Saída: True
print(config1.config)  # Saída: Configuração padrão
config1.config = "Nova configuração"
print(config2.config)  # Saída: Nova configuração