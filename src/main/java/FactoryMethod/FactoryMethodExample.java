package FactoryMethod;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class FactoryMethodExample {

    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for (Creator creator: creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }

}
