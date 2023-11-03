package decorator_pattern.code.pizza_system_with_topping_limits.toppings;

import decorator_pattern.code.pizza_system_with_topping_limits.BasePizza;

public abstract class ToppingsDecorator extends BasePizza{

    BasePizza pizza;
    ToppingsDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    
    
}
