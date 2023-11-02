package strategy_design_pattern.strategy_design_code;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Vehichle sportsCar = new SportsCar();
        sportsCar.drive();
        Vehichle sportsTruck = new SportsTruck();
        sportsTruck.drive();
        Vehichle normaVehichle = new NormalCar();
        normaVehichle.drive();

        

    }
}
