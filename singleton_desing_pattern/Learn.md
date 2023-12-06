## Singleton Design

Helps in the scenarions where you want only 1 instance of a class.
* For e.g  for your complete application you want a single DB connection object then it can be done via singleton
* For e.g a logging lib need only 1 instance in whole application

### Eager Initialization
* In this case you initialize the class instance inside the class itself using a private constructor.
* I hope you know pvt constructor can be accessed from the class itself
* Plus point is they are thread safe ? How coz they have instantation and declaration in a single step. Later when you read further method you will realize in other methods we instantiate the variables via other methods which is not exactly thread safe
```
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

```

