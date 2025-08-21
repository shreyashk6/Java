package Opps.UpCasting;

public class Mainclass5Flipcart {
    public static void main(String[] args) {
        Television tv = new Television();
        Flipkart.addToCart(tv); //Upcasting TV to class Flipcart addToProduct.

        Mobile mob =  new Mobile();
        Flipkart.addToCart(mob); //Upcasting...

        Refrigerator ref =  new Refrigerator();
        Flipkart.addToCart(ref); //Upcasting...
        
    }
}
class Flipkart{
    static void addToCart(Product p ){
        if(p!=null){
            System.out.println("Product Added");
        }
    }
}
class Product{

}
class Television extends Product{
    // {
    //     System.out.println("TV");
    // }
}
class Mobile extends Product{
    // {
    //     System.out.println("Mobile");
    // }
}
class Refrigerator extends Product{
    // {
    //     System.out.println("Fridge");
    // }
}
