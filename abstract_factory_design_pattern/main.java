package abstract_factory_design_pattern;

import abstract_factory_design_pattern.engines.Engine;
import abstract_factory_design_pattern.factory.CarFactory;
import abstract_factory_design_pattern.factory.EconomyCarFactory;
import abstract_factory_design_pattern.factory.LuxuryCarFactory;
import abstract_factory_design_pattern.factory.SportsCarFactory;
import abstract_factory_design_pattern.interior.Interior;

public class main {

    public static void main(String[] args) {
        
        // Sports cars supports all type of interiors: sporty, luxury, economy
        // But there speciality is there super engine 

        CarFactory cf = new LuxuryCarFactory();
        Engine se = cf.createEngine();
        Interior si = cf.createInterior();

        System.err.println(
            " Luxury car usually have good engines : " + se +
            " With speeds upto : "+ se.maxSpeed()+" with a power of: "+ se.getHorsePowers() 
            +
            " And they have default interiors which have : "
        );
        si.interior();

        // Luxury cars supports expensive type of interiors: sporty, luxury
        // But they have mid range powerful engine 

        CarFactory sCarFactory = new SportsCarFactory();
        Engine sEngine = sCarFactory.createEngine();
        Interior sInterior = sCarFactory.createInterior();

        System.err.println(
            " Sports car usually have performance engines : " + sEngine +
            " With super speeds upto : "+ sEngine.maxSpeed()+" with a strong enginer of: "+ sEngine.getHorsePowers() 
            +
            " And they have default interiors which have : "
        );
        sInterior.interior();



        // Luxury cars supports expensive type of interiors: sporty, luxury
        // But they have mid range powerful engine 

        CarFactory eCarFactory = new EconomyCarFactory();
        Engine engine = eCarFactory.createEngine();
        Interior interior = eCarFactory.createInterior();

        System.err.println(
            " Economy car usually have average engines : " + engine +
            " With  speeds upto : "+ engine.maxSpeed()+"kmph with a strong enginer of: "+ engine.getHorsePowers() 
            +
            "hp And they have default interiors which have : "
        );
        interior.interior();


        





    }
    
}
