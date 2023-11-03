package decorator_pattern.code.toppings;

import decorator_pattern.code.BasePizza;

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
