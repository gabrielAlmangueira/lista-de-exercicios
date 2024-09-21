package exercicio12;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //metodo conveniencia para somar os preços dos produtos
    public double somarPreco(Produto produto2) {
        return this.preco+produto2.preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + String.format("%.2f", preco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", 100.0);
        Produto produto2 = new Produto("Mouse", 50.0);

        System.out.println(produto1);
        System.out.println(produto2);
        double precoTotal = produto1.somarPreco(produto2);
        System.out.println("Preço total: " + precoTotal);
    }
}
