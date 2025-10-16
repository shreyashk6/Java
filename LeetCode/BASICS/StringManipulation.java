import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";

        // 1. Concatenation
        String concat1 = str1 + " " + str2;
        String concat2 = str1.concat(" " + str2);
        System.out.println("Concatenation: " + concat1);
        System.out.println("Concat using method: " + concat2);

        // 2. Accessing characters
        System.out.println("Char at 0: " + str1.charAt(0));

        // 3. Substring
        System.out.println("Substring of Programming(0,6): " + str2.substring(0, 6));

        // 4. Searching
        String sentence = "Java Programming is fun";
        System.out.println("Index of 'Prog': " + sentence.indexOf("Prog"));
        System.out.println("Contains 'Java'? " + sentence.contains("Java"));
        System.out.println("Starts with 'Java'? " + sentence.startsWith("Java"));
        System.out.println("Ends with 'fun'? " + sentence.endsWith("fun"));

        // 5. Replacing
        System.out.println("Replace fun with powerful: " + sentence.replace("fun", "powerful"));

        // 6. Splitting and Joining
        String fruits = "apple,banana,grape";
        String[] arr = fruits.split(",");
        System.out.println("Split fruits: " + Arrays.toString(arr));
        String joined = String.join(" | ", arr);
        System.out.println("Joined fruits: " + joined);
        String joined2=String.join(" 3 ", arr);
        System.out.println("Joined fruits2: "+joined2);

        // 7. Case conversion & trimming
        String spaced = "   Java   ";
        System.out.println("Uppercase: " + spaced.toUpperCase());
        System.out.println("Lowercase: " + spaced.toLowerCase());
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. Comparison
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
        System.out.println("CompareTo: " + a.compareTo(b));

        // 9. Reverse a string
        String rev = new StringBuilder(a).reverse().toString();
        System.out.println("Reverse of Java: " + rev);

        // 10. Converting to char array
        char[] ch = a.toCharArray();
        System.out.println("Char array: " + Arrays.toString(ch));

        // 11. Palindrome check
        String pal = "madam";
        String revPal = new StringBuilder(pal).reverse().toString();
        System.out.println(pal + " is palindrome? " + pal.equals(revPal));

        // 12. Word count
        String text = "Java is powerful and Java is fun";
        String[] words = text.split(" ");
        System.out.println("Word count: " + words.length);

        // 13. Anagram check
        String s1 = "listen";
        String s2 = "silent";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println("Are 'listen' and 'silent' anagrams? " + Arrays.equals(c1, c2));
    }
}
