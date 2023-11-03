package decorator_pattern.code.pizza_system_with_no_topping_limits.toppings;

import decorator_pattern.code.pizza_system_with_no_topping_limits.BasePizza;

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
