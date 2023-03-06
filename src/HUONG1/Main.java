package HUONG1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 5, "Golden Retriever", "golden", 25.5);
        Cat cat = new Cat("Whiskers", 3, "Siamese", "brown", 12.3);

        System.out.println("Dog: " + dog.getName() + " - " + dog.getAge() + " years old - " + dog.getBreed() + " - " + dog.getColor() + " - " + dog.getWeight() + "kg");
        System.out.println("Cat: " + cat.getName() + " - " + cat.getAge() + " years old - " + cat.getBreed() + " - " + cat.getFurColor() + " - " + cat.getHeight() + "cm");
    }
}
