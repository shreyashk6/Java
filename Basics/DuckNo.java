public class DuckNo {
    public static void main(String[] args) {
        int n = 1203; // The number to check
        int rem = 0;
        boolean flag = false; // A flag to see if we found a zero

        while (n != 0) {
            rem = n % 10; // Get the last digit
            if (rem == 0) {
                flag = true; // Found a zero?then true
                break;       // Exit
            }
            n = n / 10; // Go to the next digit
        }

        // This check happens AFTER the loop is finished
        if (flag == true) {
            System.out.println("It is a Duck Number");
        } else {
            System.out.println("It is not a Duck Number");
        }
    }
}