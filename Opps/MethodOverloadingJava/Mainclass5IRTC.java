package Opps.MethodOverloadingJava;

public class Mainclass5IRTC {
    public static void main(String[] args) {
        IRTC ir = new IRTC();
        ir.search("Bangalore","Mangalore");

        ir.search(9479);

        ir.search(8765498765L);
    }
}
class IRTC{
    void search(String src,  String destination){
        System.out.println("Searching with source and destination");
    }
    void search(int TrainNo){
        System.out.println("searching with train Number");
    }
    void search(long pnr){
        System.out.println("Searching with pnr");
    }
}