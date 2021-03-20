package edu.wctc.example2;

/*
 This class is the start class for example2.
 The purpose of this example is to show how inheriting
 poor program logic can lead to trouble.
 */
public class Main {
    // Instance property objects are auto initialized to null
    private String message;


    public static void main(String[] args) {
        // Create an instance so we can reference the non-static property
        // "message" from this static method. See duck.speak() below.
        Main p = new Main();


        // Duck inherits the Animal method speak().
        // Next, create a Duck object.
        Animal duck = new Duck();

        // Now ask the duck object to use the inherited method speak().
        // But oops! We forgot to change the message to something useful.
        // As a result of poor programming in the original speak()
        // implementation this will cause an exception (an error).
        duck.speak(p.message);
    }

}
