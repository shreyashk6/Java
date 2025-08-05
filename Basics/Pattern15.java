public class Pattern15 {
// 1   
// 23  
// 456 
// 78910       
    public static void main(String[] args) {
        int n=4;
        int rownum=0;
        for (int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(i>=j){
                    rownum=rownum+1;
                    System.out.print(rownum);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
        System.out.println();
        }
    }
}
