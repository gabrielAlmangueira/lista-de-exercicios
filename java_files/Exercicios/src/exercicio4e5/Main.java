package exercicio4e5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Função que usa polimorfismo para chamar o som de cada animal
    public static void emitirSons(List<Animal> animais) {
        System.out.println("Som de cada animal:");
        for (Animal animal : animais){
            System.out.print(animal.getClass().getSimpleName()+" ");
            animal.som();
        }
    }
    public static void main(String[] args) {
        Animal dog = new Cachorro("Rex");
        Animal cat = new Gato("Pike");
        List<Animal> animais = new ArrayList<>();
        animais.add(dog);
        animais.add(cat);

        dog.som();  
        cat.som();

        emitirSons(animais);
    }
}