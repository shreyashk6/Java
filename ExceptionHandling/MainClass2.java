public class MainClass2 {
    public static void main(String[] args) {
        try {
            Class.forName("MainClass1");//exists
            Class.forName("Cattt");//does not exists
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found bruh");
        }
        
        
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong");
        }
    }
}
