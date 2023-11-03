package decorator_pattern.code.pizza_system_with_no_topping_limits;

import decorator_pattern.code.pizza_system_with_no_topping_limits.toppings.CheeseToppings;
import decorator_pattern.code.pizza_system_with_no_topping_limits.toppings.MashroomToppings;

public class main {
    
    public static void main(String[] args) {
        BasePizza pizza = 
        // new MashroomToppings(
             new CheeseToppings( new FarmHousePizza())
             
            //  )
            ;
        System.out.println(pizza.cost());
            
    }
}
