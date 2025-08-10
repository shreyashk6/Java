package ArrraysJava;

public class ColorRandom {
    public static void main(String[] args) {
        String[] arr={"red","blue","green","yellow"};
        int i = (int)(Math.random()*arr.length);
        System.out.println(arr[i]);
    }
}
