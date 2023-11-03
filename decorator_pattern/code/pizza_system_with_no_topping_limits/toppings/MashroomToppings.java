package decorator_pattern.code.pizza_system_with_no_topping_limits.toppings;

import decorator_pattern.code.pizza_system_with_no_topping_limits.BasePizza;

public class MashroomToppings extends ToppingsDecorator {

    public MashroomToppings(BasePizza pizza){
        super(pizza);

    }

    @Override
    public int cost(){
        return pizza.cost() + mashroomCost();
    }

    public int mashroomCost(){
        return 40;
    }
    
}
