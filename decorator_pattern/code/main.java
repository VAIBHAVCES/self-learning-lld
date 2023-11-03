package decorator_pattern.code;

import decorator_pattern.code.toppings.CheeseToppings;
import decorator_pattern.code.toppings.MashroomToppings;

public class main {
    
    public static void main(String[] args) {
        BasePizza pizza = new MashroomToppings( new CheeseToppings( new FarmHousePizza()));
        System.out.println(pizza.cost());
            
    }
}
