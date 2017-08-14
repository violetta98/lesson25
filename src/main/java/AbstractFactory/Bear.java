package AbstractFactory;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public abstract class Bear {

    private String name;

    public String getName() {
        return name;
    }

}

class WoodenBear extends Bear {
    public String getName() {
        return "Wooden Bear";
    }
}

class TeddyBear extends Bear {
    public String getName() {
        return "Teddy Bear";
    }
}
