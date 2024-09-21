package exercicio7;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("João");
        Professor prof2 = new Professor("Maria");

        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        escola1.adicionarProfessor(prof1);
        escola2.adicionarProfessor(prof1);
        prof2.adicionarEscola(escola1);

        System.out.println(escola1.info());
        System.out.println(escola2.info());
        System.out.println(prof1.info());
        System.out.println(prof2.info());
    }
}
