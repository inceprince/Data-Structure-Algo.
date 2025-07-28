package Methods;

public class PassByValue {
    public static void main(String[] args) {

        //  Pass by value with String (method doesn't modify the value)
        
        String name = "Prince";
        greet(name);  // Just prints "Prince"

        // Pass by value of reference
        String name2 = "Prince";
        greet1(name2);  // Tries to change it inside method
        System.out.println("After greet1: " + name2); // Still "Prince"
    }

    // Simple pass-by-value (no modification)
    static void greet(String naam) {
        System.out.println("Inside greet: " + naam); // Output: Prince
    }

    //  Pass-by-value of a reference (String is immutable)
    static void greet1(String naam) {
        naam = "Kumar";  // Reassigns parameter only (not affecting original)
        System.out.println("Inside greet1: " + naam); // Output: Kumar
    }
}
