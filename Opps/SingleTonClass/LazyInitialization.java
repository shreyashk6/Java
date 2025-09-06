package Opps.SingleTonClass;
//LAZY INITIALIZATION!
public class LazyInitialization {
    public static void main(String[] args) {
    TableData td1 = TableData.getTableData();    
    TableData td2 = TableData.getTableData();
    TableData td3 = TableData.getTableData();
    System.out.println(td1); 
    System.out.println(td2);
    System.out.println(td3);
    }
}
class TableData{
    private static TableData ref = null;
    public static TableData getTableData(){
        if(ref == null){
            ref = new TableData();
        }
        return ref;
    }
    private TableData(){

    }
    
}