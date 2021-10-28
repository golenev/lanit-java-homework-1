package old;

public abstract class Animal {
    public String name;
    public static int count = 0;
    public Animal (String name) {
        this.name = name;
        count++;
    }

    public abstract void run (final int distance);
    public abstract void swim (final int distance);
    public static int getCount() {
        return count;
    }
}
