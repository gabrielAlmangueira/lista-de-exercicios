class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    # Sobrecarga do operador +
    def __add__(self, outro_produto):
        return self.preco + outro_produto.preco

    def __str__(self):
        return f"Produto: {self.nome}, Preço: {self.preco:.2f}"

produto1 = Produto("Teclado", 100.0)
produto2 = Produto("Mouse", 50.0)

print(produto1)
print(produto2)
preco_total = produto1 + produto2
print(f"Preço total: {preco_total}")
