package Opps.SingleTonClass;
//ENTHUSIASTIC INITIALIZATION
public class EnthusiasticInitialization {
    public static void main(String[] args) {
        Connection con1 =  Connection.gConnection();
        Connection con2 =  Connection.gConnection();
        Connection con3 =  Connection.gConnection();
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);
    }
}
class Connection{
    private static Connection con =  new Connection();
    public static Connection gConnection(){
        if(con!=null){
            return con;
        }
        else{
            con = new Connection();
            return con;
        }
    }
    private Connection(){

    }
}