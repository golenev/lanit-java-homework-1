package Food;

public class Meat extends Food {
    @Override
    protected String getName() {
        return "Мяско";
    }

    @Override
    public String toString() {
        return getName();
    }
}
