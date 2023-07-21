How To: Use Abstract Classes vs Interfaces  --------------------------------------------- (REFER TO: oop/__assignments__/advanced_oop/abstract_art_assignment)
==========================================
Abstract Classes (Simplified)
----------------
* A generic version of a class to be inherited from
* Can contain abstract methods (methods without a body)
* Can contain non-abstract methods (methods with a body)
* Cannot be instantiated
* Can have a constructor
* Can have instance variables (like: `private int x;`)
* A Java class can only inherit from one parent class (at a time)

Interfaces (Simplified)
----------------
* Identifies behaviors an implementing class must satisfy
* Cannot be instantiated
* Doesn't have a constructor
* Can only have static final variables
* A Java class can implement multiple Interfaces 



- Consider using ABSTRACT classes if any of these statements apply to your situation:
===================================================================================

* You want to share code among several closely related classes.
* You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
* You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.


- Consider using INTERFACES if any of these statements apply to your situation:
=============================================================================

* You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
* You want to specify the behavior of a particular data type, but aren't concerned about who implements its behavior.
* You want to take advantage of multiple inheritances of type.