package FactoryMethod;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public abstract class Creator {
    public abstract Product factoryMethod();
    public Product operation() {
        return factoryMethod().testProduct();
    }
}
