package decorator_pattern.code.toppings;

import decorator_pattern.code.BasePizza;

public class CheeseToppings extends ToppingsDecorator {

    public CheeseToppings(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + cheeseCost();
    }

    public int cheeseCost(){
        return 60;
    }

}
