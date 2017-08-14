package FactoryMethod;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
