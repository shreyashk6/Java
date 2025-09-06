public class LeftRightRemover {
  public static void main(String[] args) {
    String s1 = "JSPIDER";
    int l = 0;
    
    int h=s1.length()-1;
    System.out.println(s1);
    for(int i =0;i<s1.length();i++){
      if(i%2==0){
        h--;
      }
      else{
        l++;
      }
      String temp = "";
      for(int j =l;j<=h;j++){
        temp=temp+s1.charAt(j);
      
      }
    System.out.println(temp);
    }
  }
}
