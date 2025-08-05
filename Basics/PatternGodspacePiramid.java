public class PatternGodspacePiramid {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                    System.out.print("* ");
                    }
                    else {
                        System.out.print(" ");//Just Change the number of Space for changing designs of pyramid 
                    }
                }
        System.out.println();
        }
    }
}
