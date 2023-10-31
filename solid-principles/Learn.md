## SOLID Principles
### S - Single Responsibility
* As per this rule one class should have a single responsibility and it should have only 2 reason to change 

* For eg.
    ```sh
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
    ```

    #### Problems 
    * In above code single handedly Invoice class has 3 functionality of pushing to db, printing and calculation.
    * Which is wrong

    #### Ideal scenarion
    * What actually methods should look like is
    
    * One class for DAO

    ```sh
    public class InvoiceDao{
        public void save_to_db(){
            //anny code 
        }
    }
    ```
    * One class for Printing

    ```sh
    public class InvoicePrinter{
        public void print_invoice(){
            //anny code 
        }
    }
    ```
    * And one Invoice class for keeping and handling all calculation related to Invoices

    ```sh
     public class Invoice{

        private marker m;
        private int quantity;
        public int calculate_total(){
            return m.price*quantity; 
        }
    }
    ```

### O - Open for extension but close for modification.
* Idea is we shouldn't create new classes for providing support for different vendors with same functinoality

* Or in simple words any feature should be extendable so that if everything is workign fine in production, instead of changing the classes, we use thse methods and classes for extending features.

* For e.g for above class only `InvoiceDao`. Invoice data can be stored in database too, but can be stored in file too. So to add support for file in same class Invoice Dao make it extract

    #### Solution

     * Make DAO interface

    ```sh
    public interface InvoiceDao{
        public void save(){
            //anny code 
        }
    }

    * Now dataabse extension can extend it
    ```sh
    public class DatabaseInvoiceDao extends InvoiceDao {
        @Override
        public void save(){
            //anny code 
        }
    }
    ```
     * And file storage can also extend it
    ```sh
    public class DatabaseInvoiceDao extends InvoiceDao {
        @Override
        public void save(){
            //anny code 
        }
    }
    ```

### L- Liskov's Principle
* Idea for this is : If class B is subtyp of class A thenm we should be able to replace object of A with B without breaking the code 

* Subclass should extend the ability of class and it shouldn't narrow it down

* In summary it wants to say that if you are lets suppouse having 2 methods in an interface now if any of the extension class of this interface just kinding of noarrowing down the method by just simplying throwing exception or just avoiding the method call then its not a good pattern.

* An interface should have all its method working in all its subclasses 

* Consider an example of `Bike` inteface having method `accellerate` and `turnOnEgnine`.
* Now if `Motorcycle` extends `Bike` then it can implement both the methods because in a motorcyle you have both features
* But suppouse we have `Cycle` extending `Bike`. This would be wrong because there is no engine in cycle hence for  `turnOnEgnine` we have to throw an exception or fake it.


### I - Interface Segmented Principle.

* The Interface Segregation Principle is one of the SOLID principles, and it deals with the design of interfaces. It states that a class should not be forced to implement interfaces it does not use. In other words, clients (classes that use interfaces) should not be forced to depend on methods they do not use.

* For e.g suppouse we have interface `RestaurantEmployee` which have three methods `cleanDish`, `cookFood` , `createBill`.
* Now the problem is if we appoint a new chef he doesn't need to clean dishes. So instead of that this principle proposes that instead of creating single interface with 3 methods with irrelevant implementation of chef is wrong

* Better approach is to create interfaces for each `RestaurantChefEmployee` , `RestaurantCleanerEmployee` , `RestaturantAccountantEmployee` and use them individually


### D - Dependency Inversion
* This states that high level concrete classes should not rely on low level concrete classes instead of that they should rely on abstractions

* In simpler terms, DIP suggests that you should program to interfaces or abstract classes rather than concrete implementations. This principle promotes decoupling in your codebase, making it more flexible and maintainable. It allows you to change the concrete implementations of components without affecting the higher-level modules that depend on them.



* When we perform Dependency Injection, the concrete implementations of dependencies are indeed provided, but this can still be in accordance with DIP. The key is that these concrete implementations should implement interfaces or abstract classes, and the injection should be based on these abstractions. In other words, you inject instances of concrete classes, but those classes should adhere to higher-level abstractions.
    #### Example

    * COnsider classes `WiredKeyboard`,     `WirelessKeyboard` now I have a class called `Computer` too
    
    * Now when we use keyboard in computer class one way is we directly use either `WiredKeyboard` or `WirelessKeyboard`

    * But problem is how to support both and now in future if some new type of keyboard wokring from brain come up how do we keep extensibility for that too so thats why we will use `Keyboard` interface in the `Computer` class.