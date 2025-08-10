package Patterns;
public class Pattern17 {
                    // A    
                    // BC   
                    // DEF  
                    // GHIJ 
                    // KLMNO

//USING INTEGER LOOP AND CONVERSION OF INT TO CHAR
    public static void main(String[] args) {
        int n=5;
        int rownum='A';
        for (int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(i>=j){
                    char letter = (char) rownum;//   Vise Versa is:     int asciiValue = myChar;    
                    System.out.print(letter);
                    rownum=rownum+1;
                    }
                    else {
                        System.out.print(" ");
                    }
                }
        System.out.println();
        }
    }
}
