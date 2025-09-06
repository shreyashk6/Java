public class test1 {

  public static void main(String[] args) {
    int[] n = { 7, 2, 1, 4, 5, 6, 8 };

    int count = 3;

    int[] n2 = new int[count];

    int[] n1 = new int[n.length - count];

    for (int i = 0; i < n1.length; i++) {
      n1[i] = n[i];
    }

    int l = 0;
    for (int i = n.length - count; i < n.length; i++) {
      n2[l] = n[i];
      l++;

    }

    for (int i = 0; i < n1.length; i++) {
      n[i] = n1[i];
    }

  }

}
