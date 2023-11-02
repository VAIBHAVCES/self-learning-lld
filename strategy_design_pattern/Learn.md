## Strategy design pattern

* What is design patters
    * These are the principles for OOPs
    * they help us in achiveing scalability in our code 


### Problem
* Consider we have a base class 
* Now this parent class has 100 subclass out of which base class has a method `drive`

* Now 40 classes override the `drive` method with an implmentation of `sporty-drive`. Means they override `drive` method with `sporty-drive` implementation

* And 50 classes override the `drive` methid with an implementaton of `offroad-driver` method implementaion

* Now the problem these 40 classes of `sport-driver` was a 100LOC. And writting it in 40 different subclasses means writting same code in 4000LOC.

* In long term its not very scalable. If system size increase we cant keep writing same code again and again

* And also it breaks the SOLID principle's O- Open/close extensibility principle


### Solution

* Idea in here is we need to save the LOC and keep it repeative code in some other way

* So idea is we will create another interface such as `DriveStrategy` now overrides of this interface such as `SportyDrive` and `NormalDriver` will provide there resepective definitions overrding driver method

* Now this interface will be used in our base `Vehicle` class 

* All inheriting class of `Vehichle` , now don't need to provide the driver method as its alread being provided by the `DriverStrategy` they just need to provide proper implementation of `DriverStrategy` i.e `SportyDrive` or `NormalDriver` via there constructors to the base class `Vehicle`

* The best help here is code is now controllable from single file

* See the implementation I provided

