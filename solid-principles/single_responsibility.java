public class marker{
    String name;
    String color;
    int price;
    int year;
}

public class Invoice{

    private marker m;
    private int quantity;


    public int calculate_total(){
        return m.price*quantity; 
    }
    public void print_invoice(){

    }
    public void saveToDb(){
        
    }
}