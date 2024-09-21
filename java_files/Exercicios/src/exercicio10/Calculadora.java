package exercicio10;

public class Calculadora {
    public int somar(int a, int b) {
        return a+b;
    }

    public int somar(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Usando o método somar com dois parâmetros
        int somaDois = calc.somar(5, 10);
        System.out.println("Soma de dois números: " + somaDois);

        // Usando o método somar com três parâmetros
        int somaTres = calc.somar(5, 10, 20);
        System.out.println("Soma de três números: " + somaTres);
    }
}
