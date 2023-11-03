package decorator_pattern.code.toppings;

import decorator_pattern.code.BasePizza;

public abstract class ToppingsDecorator extends BasePizza{

    BasePizza pizza;
    ToppingsDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    
    
}
