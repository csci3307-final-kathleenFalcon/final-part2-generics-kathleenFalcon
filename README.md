# Java Generics
--Generic interface "MyGenInterface" that takes two generic types K and V with two methods to return K (key) and V (value) which are not implemented.

--Generic class "MyGenClass" that implements MyGenInterface with attributes K key and V value, constructor to set key and value, and implementation of getKey() and getValue()

--Regular class "MyRegularClass" with public static generic method getSum() that takes two parameters of T of type Number or it's children and returns the first T (inp1)

--MainEntry that instantiates MyGenInterface as MyGenClass (polymorphism) with inputs Integer, String and Integer, Integer. 
----An Integer i1 variable is set to the returned value from MyRegularClass getSum() method when passing in (10, 20). 
----A Float f1 variable is set to the returned value from MyRegularClass getSum() method when passing in (100f, 200f).