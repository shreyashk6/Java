//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainClass1 {
    public static void main(String[] args) {
        int i = 20;
        int j =0;
       try {
        j=18/i;
        if(j==0){
            throw new ChutiyaException("Custom Exception Man!");//since we r sending a message here make sure theres a String class in the Created Exception class
        }
       }
       catch(ArithmeticException e){
        System.out.println("qwertyuio");
       }

       catch(ChutiyaException e){
        j=18/1;
        System.out.println("Output" +e);
       }
       catch (Exception e) {
        // TODO: handle exception   
        System.out.println("Something went wrong");
       }
    }
}
class ChutiyaException extends Exception{
    public ChutiyaException(String custommess){
        super(custommess); //  calls the message here
    }
}
