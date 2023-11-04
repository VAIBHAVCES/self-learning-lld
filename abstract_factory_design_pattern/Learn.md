### Why we need it 
* As per hands on design first pattern book 
> This patters provides and interface for creating families of related or depended objectts without specifying there concrete classes



### Applicability
*  Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.


#### Difference in abstact factory and factory
* Take and example
    * Usually when we have multiple types of products for e.g `Laptop(Interface)`, `Mobile(Interface)` and now both of them can have different products for eg. for `Laptop- Lenovo, Mac, HP` for `Mobiles - Lenovo, Iphone, Samsung`.
    * Now in this case we can have single factory which can return both mobiles and laptops
    * for e.g `AppleFactory` in this I can give 2 methods `createMobile` and `createLatop` which can appropriately return mobiles of apple i.e iphone and createLaptop will give us mac
    * So scenarios where single factory can create 2 or more different types of products then there we use abstract factory

### My Code Explaination

#### Problem
* I am constructing a car factory which can basically support 3 types of cars sporrts, luxury and economy
* Now all of them comes with a fix type of engines as per there names. But interior is something where customers can get some customization
* for e.g Luxury cars can support luxury interiors and sporty interiors but they don't support economy interiors
* But when it comes to engine sports cars will only support high powered v8 enginer there is no custmization you can get there.


#### My Code Aproach
* I have decided to create an factories based on the requirements  sporrts, luxury and economy

* Particular factory will return particular types of engines and interiors. They alos have a default interior but you can customize it as per your input


### Resources
* https://refactoring.guru/design-patterns/abstract-factory
* https://refactoring.guru/design-patterns/abstract-factory



