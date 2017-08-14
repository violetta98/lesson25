package AbstractFactory;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class WoodenToyFactory implements ToyFactory {
    public Bear getBear() {
        return new WoodenBear();
    }

    public Cat getCat() {
        return new WoodenCat();
    }
}
