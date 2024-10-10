package exercicio4e5;
public class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método que será sobrescrito nas subclasses
    public void som() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void som() {
        System.out.println(nome+": Au Au!");
    }
    
}

class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void som() {
        System.out.println(nome+": Miau!");
    }
    
}

