package AbstractFactory;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public abstract class Cat {

    private String name;

    public String getName() {
        return name;
    }
}


class WoodenCat extends Cat {
    public String getName() {
        return "Wooden Cat";
    }
}

class TeddyCat extends Cat {
    public String getName() {
        return "Teddy Cat";
    }
}
