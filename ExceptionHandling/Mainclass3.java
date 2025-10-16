
class A{
    public void shows() throws ClassNotFoundException{
        Class.forName("wertyj");//class doesnt exist
    }
}
public class Mainclass3 {
    public static void main(String[] args) { //throws ClassNotFoundException{
        A obj =  new A();
        try {
            obj.shows();
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
    }
}