

public class Mainclass1 {
    public static void main(String[] args) {
        VendingMachine v1 = new VendingMachine();
        Drink d1 = v1.geDrink(1);//INPUT
        System.out.println(d1);//COFFEE
        if(d1 instanceof Coffee){
            Coffee c =(Coffee)d1;
            c.coffeeDetails();
        }
        else{
            Tea t =(Tea)d1;
            t.teaDetails();
        }
    }
}

class Drink{
    String name;
    int price;
}
 class Coffee extends Drink{
    {
        name = "Aericano-Latte";
        price = 320;
    }
    void coffeeDetails(){
        System.out.println(name+ " "+price);
    }
}
class Tea extends Drink{
    {
        name = "Masala Tea";
        price = 20;
    }
    void teaDetails(){
        System.out.println(name+" "+price);
    }
}
class VendingMachine{
    Drink geDrink(int input){
        if(input==1){
            Coffee c1 = new Coffee();
            return c1 ;

        }
        else {
            Tea t1 =  new Tea();
            return t1;
        }
    }
}