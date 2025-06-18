package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bulldog);
    }
    public static void animalCrying(Animal animal) {
        animal.crying();
        //dog객체 넘어오면 jump메소드
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }
    }
}
