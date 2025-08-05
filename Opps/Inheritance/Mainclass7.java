package Opps.Inheritance;


class Watch{
    void showTIme(){
        System.out.println("Show Date & Time");
    }
}
class SearchWatch extends Watch{
    void showNotifications(){
        System.out.println("Show Notifications");
    }
}
public class Mainclass7 {
    public static void main(String[] args) {
        SearchWatch sw= new SearchWatch();
        sw.showTIme();
        sw.showNotifications();        
    }
}
