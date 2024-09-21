package exercicio13;

public class Matematica {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        // Testando o método estático
        System.out.println(Matematica.fatorial(5));
    }
}
