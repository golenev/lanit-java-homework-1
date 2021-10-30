package Food;

public class Grass extends Food{
    @Override
    protected String getName() {
        return "Зелёная травушка";
    }
    @Override
    public String toString() {
        return getName();
    }
}
