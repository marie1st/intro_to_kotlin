package com.example.intro_to_kotlin

fun main () {

    //Explain mutable,

    // The Kotlin Standard Library provides implementations for basic collection types: sets, lists, and maps.
    // A pair of interfaces represent each collection type:
    //
    //1. A read-only interface that provides operations for accessing collection elements.
    //
    //2. A mutable interface that extends the corresponding read-only interface with write operations: adding, removing, and updating its elements.


    //From, lecture, List and array is different for the use of it the list will not be able to change or adjust,
    //while the array is able to change or adjust according to the index.
    //There is two types of lists and arrays which is non-mutable and mutable lists and arrays.
    //Non-mutable and mutable has different function to assign to manage when it comes to lists and arrays.

    //From research, I found that in more profound understanding, it states:
    //Array<Type> is a class with known implementation: it's a sequential fixed -size memory region
    //storing the items (and on JVM it is represented by Java array).

    //List<Type> and MutableList<Type> are interfaces which have different implementations.
    //ArrayList<T>, LinkedList<Type> etc. Memory representation and operations logic of lists are
    //defined in concrete implementation, e.g. indexing in a LinkedList<Type> goes thru the links and tasks
    //O(n) time whereas ArrayList<Type> stores its items in a dynamically allocated array.

    //An array, Array<T> is mutable (it can be changed through any reference to it), but List<T> doesn't have modifying methods (it is either
    // read-only view of MutableList<T> or an immutable list implementation).  The same said with the lectures that the array of mutable is able to change
    //its content over indexing, but not with the lists.

    //i.e.,
    val a = arrayOf(1,2,3)
    a[0] = a[1]  //is allowed, for non-mutable
    //while,
    val l = listOf(1,2,3)
    l[0] = l[1]  //the method doesn't allow for non-mutable

    val m = mutableListOf(1,2,3)
    m[0] = m[1] // is ok for mutable list
    //And also with mutable list the removal or addition to existing list is allowed.
    //Arrays have fixed size and cannot expand or shrink retaining identity (you need to copy an array to resize it). As to the lists, MutableList<T>
    //has add and remove functions, so that it can increase and reduce its size.

    var roster = mutableListOf<String>("Nimish", "sarah", "John")
    roster.add("Tracy")
    val nimish: String = roster.removeAt(0)

    //Array<T> is invariant on T (Array<Int> is not Array<Number>), the same for MutableList<T>, but List<T> is covariant (List<Int> is List<Number>).
    val a: Array<Number> = Array<Int>(0) { 0 } // won't compile
    val l: List<Number> = listOf(1, 2, 3) // OK
    // Arrays are optimized for primitives: there are separate IntArray, DoubleArray, CharArray etc. which are mapped to Java primitive arrays (int[], double[], char[]), not boxed ones (Array<Int> is mapped to Java's Integer[]). Lists in general do not have implementations optimized for primitives,
    // though some libraries (outside JDK) provide primitive-optimized lists.

    //List<T> and MutableList<T> are mapped types and have special behaviour in Java interoperability (Java's List<T> is seen from Kotlin as either List<T> or MutableList<T>). Arrays are also mapped, but they have other rules of Java interoperability.
    //Certain array types are used in annotations (primitive arrays, Array<String>, and arrays with enum class entries), and there's a special array literal syntax for annotations. Lists and other collections cannot be used in annotations.
    //As to the usage, good practice is to prefer using lists over arrays everywhere except for performance critical parts of your code, the reasoning is the same to that for Java.

    //example of array of mutable arraylist
    var bread: String = "Bread"
    var int_int: Int = 2
    var shoppingList = arrayListOf<String>("Eggs", "Butter", "Shoes")
    shoppingList.add(0, bread)
    shoppingList.add(1, int_int)  //is not allowed to interoperable, but in case of
    shoppingList.add(1, 3)  //is also not interoperable must be of same type of arrayListOf<String>
}