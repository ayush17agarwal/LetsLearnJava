package com.example.helloworld;


/*
The start of every Java program is from a class. All of your code will go inside of a class
Every class should always start with an uppercase letter
 */
public class HelloWorld {

    /*
    public static - the type of the method. public methods can be called at any time. Not important for now
    void - the return type of the method
    main - the name of the method. Always follow camel-case when creating a method (sumNumbers, isDivisibleBy2)
    String[] args - the parameters of the method, not super important for now
     */
    public static void main(String[] args) {
        // print statements
        System.out.println("PRINT STATEMENTS:");

        System.out.println("Hello World!");
        System.out.print("What is different about this print statement?");
        System.out.println(3);
        System.out.println(3 * 3);
        System.out.println("hello" + 3);

        // Types and Variables
        System.out.println("\n\nTYPES AND VARIABLES:");
        // Primitive types
        short my_short = 32767; // small whole number
        int my_int = 42; // whole number
        long my_long = 42; // a bigger whole number
        double my_double = 3.14; // decimal number
        float my_float = 3.14f; // small floating point number
        boolean my_boolean = true;
        char my_char = 'a';

        // Non-primitive types
        String my_string = "Hello World!";
        Integer my_integer = 42;

        //How can we print each type?
        System.out.println(my_short);
        my_short = (short) (my_short + 1);
        System.out.println(my_short);


        //What will the following code print out?

        // Example 1
        System.out.println("\n\nEXAMPLE 1:");
        int x = 5;
        int y = 10;
        int z = 22;
        System.out.println(x + y + z);
        System.out.println(x + y - z);

        // Example 2
        System.out.println("\n\nEXAMPLE 2:");

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);


        // Operators
        System.out.println("\n\nOPERATORS:");
        int a = 1;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 1 / 2 = 0 because integer division
        System.out.println(a % b); // 1 % 2 = 1 because 1/2 = 0 with a remainder of 1
        System.out.println(a++); // = a = a + 1
        System.out.println(b--); // = b = b - 1
        System.out.println(a);
        System.out.println(b);

        //https://www.w3schools.com/java/java_operators.asp

        // FOR NEXT TIME

        //Comparison operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a > b);

        //Logical Operators (&&, ||, !)
        System.out.println(a == b && a != b);
        System.out.println(a != b || a == b);
        System.out.println(!(a <= b || a == b));
    }

    public void myMethod() {
        System.out.println("You're in my method!!");
    }
}
