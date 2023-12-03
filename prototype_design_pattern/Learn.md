### Problem
* Cloning could be a expensive operation coz consider a class `Robot` with 100 params so copying 100 params everytime in client code is not feasible.
* And also there could be some private varaibles which you don't want to be accessed in client code. For e.g `robo_password` this you will feed only at time of instantiation and there is not setter for it. So how will you access it even if you wanted to copy
* And let's suppouse both problem doesn't come then what about a scenario where you don't even concrete class you just have a interface so now you don't even know the parameters. 

### Intution
* Idea is user should have way to copy(clone) the object but not access it's private variable.
* Cloning sholdn't lead to sec issues etc.
* So means class itself should have concrete duplications


### Implementations
* Usually there can be multiple ways to implement cloning too.
* But one thing common in all implmentations is that always there is a parent `Prototype` interface which defines the clone method. And whosoevery uses it have to override it.
* The implementation difference comes where you want to save Line of codes and want to use java's own clone 

#### Style - 1 - java.lang.Cloneable - Shallow Copy
* So this is an interface availaible internally in java this is very easy and amazing to use
* It's an empty interface yes repeating again it doesn't expose `clone` method actually.
* In reality `Object` holds the `clone` method and when you implement `Cloneable` it automatically notifies the `Object` that user want feature of clone objects
* And hence it automaitcally provies an `protected clone` method.
* So in your model class you just need to implement and it will automaitcally do the **SHALLOW COPYING** which is amazing. 
* But note check below first what is shallow copying 
* Check my code_style_2
* One the very closest way is that you can write up a clone method itself in the `Robot` class which is not a problem until

***Note: Dont consider this aproach to use in the case your model; have any passwords etc. in that case best way is to use custom clone prototype ***

#### Style - 1 - java.lang.Cloneable - Shallow Copy -( code_style_2)
* So this is an interface availaible internally in java this is very easy and amazing to use
* It's an empty interface yes repeating again it doesn't expose `clone` method actually.
* In reality `Object` holds the `clone` method and when you implement `Cloneable` it automatically notifies the `Object` that user want feature of clone objects
* And hence it automaitcally provies an `protected clone` method.
* So in your model class you just need to implement and it will automaitcally do the **SHALLOW COPYING** which is amazing. 
* But note check below first what is shallow copying 
* Check my code_style_2
* One the very closest way is that you can write up a clone method itself in the `Robot` class which is not a problem until

***Note: Dont consider this aproach to use in the case your model; have any passwords etc. in that case best way is to use custom clone prototype ***

#### Style - 2 - Custom Cloneable - Deep Copy - (code style 1)
* In this everything was same only difference being I used custom cloner for the cloning purpouses not cloneable
* -ve point of this is if 100 lines were in params we have to wrie every of it manually

### Shallow Copy vs Deep Copy
My mantra is whatever stored in heap area is related to deep copying, and what is in other method area or temporary areas such as SCP(Stirng constant pool) then they are shallow copy. I hope you know the fact `String x= "abc"` is shallow creation as x stores address of SCP. But `String y = new String("abc")` creates object in  heap area
Shallow Copy:

* A shallow copy of an object creates a new object but does not create new instances of the objects contained within the original object.
* For immutable objects like strings, the distinction is less pronounced, as they cannot be modified after creation.
* For strings, a shallow copy essentially creates a new reference to the same underlying string object.
* Example of a shallow copy for a string:
    ```
    String original = "Hello, World!";
    String shallowCopy = original;  // Creates a new reference to the same string object
    Deep Copy:
    ```


* A deep copy, on the other hand, creates a new object and recursively copies the objects referenced by the original object.
* For strings, which are immutable, creating a deep copy might be seen as unnecessary, as they cannot be modified.
* In practice, a deep copy is more relevant when dealing with mutable objects that contain other mutable objects.
* Example of a deep copy for a string (though not practically useful for immutable objects):

    ```
    String original = "Hello, World!";
    String deepCopy = new String(original);  // 
    ```




