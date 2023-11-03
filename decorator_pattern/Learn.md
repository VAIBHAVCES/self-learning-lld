## Decorator Pattern

* Take a usecase - we are a pizza delivery system where user can provide you toppings choices for e.g it can ask you for halapeno, extra cheese, mushrooms and 3-4 other types of topppings
* Now you need to track all this toppings at the runtime ?
* Telling again. When our programs runs it should be dynamically able to take options of what types of toppings we need and based on that type it should generate the pizza and its cost

### Problem
* From above usecase one major problem is combination
* Means if users orders a pizza with one extra cheese, and other other orders a pizza with halapeno and extra cheese. How you gonna maintain it. 
* One possible solution is you create seperatae class for evert combination 1 for extra cheese, 1 for halapeeno, and 1 for their combination HalapenoExtraCheese.
* But does it scalable to you going forward we can have 100s of options and it will leaad us to nothing but a `Class Explosion`


### When we need it 

The following are the indicators which show the requirement of the decorator design pattern:

* When one has an object that requires functionality extension. For extending functionality, decorators are a versatile alternative to subclassing.

* When one has to recursively rewrap or change the functionalities of an object according to the requirements, dynamically without affecting other objects of the class.


### Solution

> Decorator pattern allows us to add a new functionality to existing objects without changing its structure at all. Simply, it allows to do runtime modifications to the objects.

### Coding Explaination
* If you checkout my code you can find `BasePizza` class which is in `IS-A` relation ship with `FarmHousePizza` and `MarghareitaPizza`

* Now to add topppings on top of this pizza we use a toppings decorator which basically is nothing but a abstract class which holds a `HAS-A` and `IS-A` relationship with the base pizza.

* This relationship helps us maintain the toppings as a part of pizza itself.

* And due to this we can create as many toppings as we want and that data can be communicated between these objects