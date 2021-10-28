package old;

public class SixthHW {
    public static void main(String[] args) {
        Cat firstCat = new Cat ("Boris");
        Cat secondCat = new Cat ("Volodya");
        Dog firstDog = new Dog("Tuzik");
        Dog secondDog = new Dog("Kostik");

        firstCat.run(100);
        firstCat.swim(2);
        secondCat.run(500);
        secondCat.swim(50);
        firstDog.run(150);
        firstDog.swim(600);
        secondDog.run(190);
        secondDog.swim(200);

        System.out.println("Cats: " + Cat.getCount());
        System.out.println("Dogs: " + Dog.getCount());
        System.out.println("Animals: " + Animal.getCount());

    }
}
