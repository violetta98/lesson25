package AbstractFactory;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class TeddyToysFactory implements ToyFactory {
    public Bear getBear() {
        return new TeddyBear();
    }

    public Cat getCat() {
        return new TeddyCat();
    }
}
