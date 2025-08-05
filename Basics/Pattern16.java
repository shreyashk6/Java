public class Pattern16 {
// 1    
// 12   
// 123  
// 1234 
// 12345
    public static void main(String[] args) {
        int n=5;
        //int rownum=0;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j){
                   // rownum=rownum+1;
                    //System.out.println(rownum);
                    System.out.print(j);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
        System.out.println();
        //rownum=0;
        }
    }
}
