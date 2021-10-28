package old;

public class Cat  extends Animal{
    private static int count = 0;
    private final int RUN_Distance = 200;

    public Cat(String name) {
        super(name);
        count++;
    }

    public void run(int distance) {
        if (distance <= RUN_Distance) {
            System.out.printf("Кот пробежал %d метров%n", distance);
        }
    }

    public void swim(int distance) {
        System.out.printf("Кот не умеет плавать%n");
    }

    public static int getCount() {
        return count;
    }
}