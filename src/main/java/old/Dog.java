package old;

public class Dog extends Animal {
    private static int count = 0;
    private final int RUN_Distance = 200;
    private final int swim_distance = 10;

    public Dog(String name) {
        super(name);
        count++;
    }

    public void run(int distance) {
        if (distance <= RUN_Distance) {
            System.out.printf("Пёс пробежал %d метров%n", distance);
        }
    }

    public void swim(int distance) {
        if (distance <= swim_distance) {
            System.out.printf("Пёс проплыл %d метров%n", distance);
        } else {
            System.out.printf("пёс не может проплыть %d метров%n", distance);
        }

    }


    public static int getCount() {
        return count;
    }
}
