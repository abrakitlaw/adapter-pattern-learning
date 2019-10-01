# Adapter Pattern
The Adapter Pattern is one of the structural design pattern that converts the interface of a class into another interface of clients expect. Adapter lets classes work together that
couldn't otherwise because of incompatible interfaces.

There are two kinds of adapters: object adapters and class adapters.

1. Class Adapter - This form uses Java inheritance and extends the source interface , in our case Socket class.
2. Object Adapter - This form uses Java composition and adapter contains the source object.


The only difference about these two adapters is that with class adapter we subclass the Target and the Adaptee, while with object adapter
we use composition to pass request to an Adaptee.
