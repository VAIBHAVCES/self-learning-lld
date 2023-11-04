### What is factory design patern 
* As per hands on design first pattern book 
    >  Factory method pattern defines an interface for creating an object but lets subclasses decide which class to instantiate
* As per online article
    > The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class 

### Applicability
* Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

* More refining to point 1, when you have a single range of products. For e.g in scenarions where your factory class needs to create only 1 type of class out of multiple classes from a single interface then its successful.

#### Difference in abstact factory and factory
* Take and example
    * Usually when we have multiple types of products for e.g `Laptop(Interface)`, `Mobile(Interface)` and now both of them can have different products for eg. for `Laptop- Lenovo, Mac, HP` for `Mobiles - Lenovo, Iphone, Samsung`.
    * Now in this case we can have single factory which can return both mobiles and laptops
    * for e.g `AppleFactory` in this I can give 2 methods `createMobile` and `createLatop` 
    * So scenarios where single factory can create 2 different types of products then there we use abstract factory

* In factory
    * Usually the idea is when we don't know what else we will have support for in future
    * For eg. I create an application for windows. but in future if my applications scales and I need a support for apple too the instead of writing everything from scracth.
    * Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.


### My Code Explaination

#### Problem
* I am constructing a logistic company consider something like DP world. I have a usecase where I can choose the way I want to transport a package. Consider right the weight type of product delicacy etc. is not an issue. 
* Customer will come to me and ask for delivering package with a distance and I can automatically decide which transportation method I want to use
* Only crux is we also need to apply a filter that nations like Afghanistan which are landlocked they will be having a very high sea way export cost so based on region I want to crate an appropriate factorty which gives me best mode of transportaiton


#### My Code Aproach
* I have decided to create an interface for factories
* `TransportFactory` defines template for regions
* And based on this interface we can support regional factories which can define there own logics of choosing appropriate transportation system



### Resources
* https://refactoring.guru/design-patterns/factory-method
* https://www.youtube.com/watch?v=7g9S371qzwM&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=8
* https://www.youtube.com/watch?v=EcFVTgRHJLM




