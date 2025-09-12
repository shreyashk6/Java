package Opps.Constructors;
class Container{
    int capacity;
    Container(int args){
        capacity =  args;
    }
}
public class Mainclass5 {
    public static void main(String[] args) {
        Container c1=new Container(420);
        System.out.println(c1.capacity);
        Container c2=new Container(420);
        System.out.println(c2.capacity);
        Container c3=new Container(420);
        System.out.println(c3.capacity);
        
    }
}
