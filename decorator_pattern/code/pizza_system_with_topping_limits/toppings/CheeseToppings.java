package decorator_pattern.code.pizza_system_with_topping_limits.toppings;

import decorator_pattern.code.pizza_system_with_topping_limits.BasePizza;

public class CheeseToppings extends ToppingsDecorator {

    public CheeseToppings(BasePizza pizza) {
        super(pizza);
        System.out.println("Applying the : Cheese Toppings : with pizza : "+ pizza);
        if(pizza.TOPIC_APPLIED_COUNT<=0){
            throw new RuntimeException("You can apply max of 3 toppings only");
        }
        super.TOPIC_APPLIED_COUNT = pizza.TOPIC_APPLIED_COUNT-1;
    }

    @Override
    public int cost() {
        return pizza.cost() + cheeseCost();
    }

    public int cheeseCost(){
        return 60;
    }

}
