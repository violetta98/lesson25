package Builder;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham + pineapple");
    }
}
