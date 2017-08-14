package Prototype;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class Cookie implements Cloneable {

    protected int weight;

    @Override
    public Cookie clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
        return copy;
    }

}
