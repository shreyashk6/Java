public class Pattern18 {
                // A                         
                // AB                        
                // ABC                       
                // ABCD                      
                // ABCDE                     
                // ABCDEF                    
                // ABCDEFG                   
                // ABCDEFGH                  
                // ABCDEFGHI                 
                // ABCDEFGHIJ                
                // ABCDEFGHIJK       
                
//DIRECTLY USING CHAR FOR LOOP
    public static void main(String[] args) {
        
        
        for (char i='A';i<='K';i++){
            
            for(char j='A';j<='K';j++){
                if(i>=j){
                   
                    System.out.print(j);
                    
                    }
                    else {
                        System.out.print(" ");
                    }
                }
        System.out.println();
        }
    }
}
