// Package declaration (commented out in original; defines namespace)
// package Opps.UpCasting;

// Main class to run the program
public class Mainclass5Flipcart {
    public static void main(String[] args) {
        // Create a Television object (calls instance initializer block)
        Television tv = new Television(); // Output: TV
        // Upcasting: Television object passed as Product to addToCart
        // The Product parameter accepts any subclass of Product
        Flipkart.addToCart(tv); // Output: Product Added

        // Create a Mobile object (calls instance initializer block if uncommented)
        Mobile mob = new Mobile(); // Output: Mobile (if block uncommented)
        // Upcasting: Mobile object passed as Product
        Flipkart.addToCart(mob); // Output: Product Added

        // Create a Refrigerator object (calls instance initializer block if uncommented)
        Refrigerator ref = new Refrigerator(); // Output: Fridge (if block uncommented)
        // Upcasting: Refrigerator object passed as Product
        Flipkart.addToCart(ref); // Output: Product Added
    }
}
    
// Flipkart class with a static method to add products to a cart
class Flipkart {
    // Static method accepting a Product reference (enables polymorphism)
    // Can handle any subclass of Product (Television, Mobile, Refrigerator)
    static void addToCart(Product p) {
        // Null check to ensure a valid Product object is passed
        if (p != null) {
            System.out.println("Product Added");
        }
    }
}

// Parent class (base class for inheritance)
class Product {
    // Empty class; could have fields/methods for all products
    // Acts as a common type for polymorphic behavior
}

// Subclass inheriting from Product (is-a Product)
class Television extends Product {
    // Instance initializer block: runs when a Television object is created
    // Before any constructor (even default one)
    {
        System.out.println("TV");
    }
    // Note: No explicit constructor; Java provides a default no-arg constructor
}

// Subclass inheriting from Product
class Mobile extends Product {
    // Instance initializer block (commented out in original)
    // Uncommented to show consistent behavior
    {
        System.out.println("Mobile");
    }
}

// Subclass inheriting from Product
class Refrigerator extends Product {
    // Instance initializer block (commented out in original)
    // Uncommented to show consistent behavior
    {
        System.out.println("Fridge");
    }
}