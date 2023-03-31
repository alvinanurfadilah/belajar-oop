package programmer.application;

import programmer.data.Animal;
import programmer.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        
        Animal animal = new Cat();
        animal.name = "Push";
        animal.run();
    }
}
