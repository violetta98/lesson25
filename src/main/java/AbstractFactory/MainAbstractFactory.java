package AbstractFactory;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class MainAbstractFactory {
    ToyFactory toyFactory = new WoodenToyFactory();
    Bear bear = toyFactory.getBear();
    Cat cat = toyFactory.getCat();
System.out.printf("I've got %s and %s", bear.getName(), cat.getName());
// Вывод на консоль будет: [I've got Wooden Bear and Wooden Cat]

    // А теперь создадим «плюшевую» фабрику, следующая линейка является единственной разницей в коде
    ToyFactory toyFactory1 = new TeddyToysFactory();
    // Как видим код ниже не отличается  от приведенного выше
    Bear bear1 = toyFactory1.getBear(); Cat cat1 = toyFactory1.getCat();

System.out.printf("I've got %s and %s", bear1.getName, cat1.getName);
}
